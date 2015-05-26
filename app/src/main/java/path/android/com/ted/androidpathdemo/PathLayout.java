package path.android.com.ted.androidpathdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Ted on 2015/5/26.
 */
public class PathLayout extends View {

    private Path mPath;
    private Paint mPaint;

    public PathLayout(Context context) {
        super(context);
        init();
    }

    public PathLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public PathLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        // 实例化路径
//        mPath = new Path();
//        // 移动起点至[100,100]
//        mPath.moveTo(100, 300);
//
//        mPath.lineTo(500, 100);
//
//        canvas.drawPath(mPath, mPaint);
//
//        mPaint.setTextSize(50);
//        // 绘制路径上的文字
//        canvas.drawTextOnPath("android-path-demo", mPath, 0, 0, mPaint);

        mPath = new Path();
        // 移动起点至[100,100]
        mPath.moveTo(400, 400);

        // 添加一条弧线到Path中
        RectF oval = new RectF(100, 100, 300, 400);
        mPath.addOval(oval, Path.Direction.CW);

        canvas.drawPath(mPath, mPaint);

        mPaint.setTextSize(50);
        // 绘制路径上的文字
        canvas.drawTextOnPath("android-path-demo", mPath, 0, 0, mPaint);
    }
}
