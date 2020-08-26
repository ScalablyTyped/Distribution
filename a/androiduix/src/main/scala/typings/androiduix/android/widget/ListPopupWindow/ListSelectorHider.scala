package typings.androiduix.android.widget.ListPopupWindow

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSelectorHider extends Runnable {
  var _ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow = js.native
}

object ListSelectorHider {
  @scala.inline
  def apply(_ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow, run: () => js.Any): ListSelectorHider = {
    val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[ListSelectorHider]
  }
  @scala.inline
  implicit class ListSelectorHiderOps[Self <: ListSelectorHider] (val x: Self) extends AnyVal {
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

