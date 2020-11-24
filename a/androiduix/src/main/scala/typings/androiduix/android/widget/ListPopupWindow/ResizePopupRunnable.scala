package typings.androiduix.android.widget.ListPopupWindow

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizePopupRunnable extends Runnable {
  
  var _ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow = js.native
}
object ResizePopupRunnable {
  
  @scala.inline
  def apply(_ListPopupWindow_this: typings.androiduix.android.widget.ListPopupWindow, run: () => js.Any): ResizePopupRunnable = {
    val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[ResizePopupRunnable]
  }
  
  @scala.inline
  implicit class ResizePopupRunnableOps[Self <: ResizePopupRunnable] (val x: Self) extends AnyVal {
    
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
