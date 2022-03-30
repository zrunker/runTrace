package cc.banzhi.runtrace_api.click;

import android.view.View;

/**
 * @program: ZRunTrace
 * @description:
 * @author: zoufengli01
 * @create: 2022/3/30 4:39 下午
 **/
public interface IClickTrace {

    /**
     * 监听点击事件
     *
     * @param tag tag标记，一般用类命表示
     * @param v   被点击的View
     */
    void runClick(String tag, View v);
}