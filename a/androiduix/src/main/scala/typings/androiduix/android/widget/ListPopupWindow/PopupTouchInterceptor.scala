package typings.androiduix.android.widget.ListPopupWindow

import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnTouchListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupTouchInterceptor extends OnTouchListener {
  var _ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow = js.native
}

object PopupTouchInterceptor {
  @scala.inline
  def apply(
    _ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow,
    onTouch: (View, MotionEvent) => Unit
  ): PopupTouchInterceptor = {
    val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], onTouch = js.Any.fromFunction2(onTouch))
    __obj.asInstanceOf[PopupTouchInterceptor]
  }
  @scala.inline
  implicit class PopupTouchInterceptorOps[Self <: PopupTouchInterceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_ListPopupWindow_this(value: typings.androiduix.android.widget.ListPopupWindow): Self = this.set("_ListPopupWindow_this", value.asInstanceOf[js.Any])
  }
  
}

