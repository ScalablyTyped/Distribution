package typings.androiduix.android.widget.AbsListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowRunnnable extends js.Object {
  
  var _AbsListView_this: typings.androiduix.android.widget.AbsListView = js.native
  
  var mOriginalAttachCount: js.Any = js.native
  
  def rememberWindowAttachCount(): Unit = js.native
  
  def sameWindow(): Boolean = js.native
}
object WindowRunnnable {
  
  @scala.inline
  def apply(
    _AbsListView_this: typings.androiduix.android.widget.AbsListView,
    mOriginalAttachCount: js.Any,
    rememberWindowAttachCount: () => Unit,
    sameWindow: () => Boolean
  ): WindowRunnnable = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), sameWindow = js.Any.fromFunction0(sameWindow))
    __obj.asInstanceOf[WindowRunnnable]
  }
  
  @scala.inline
  implicit class WindowRunnnableOps[Self <: WindowRunnnable] (val x: Self) extends AnyVal {
    
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
    def set_AbsListView_this(value: typings.androiduix.android.widget.AbsListView): Self = this.set("_AbsListView_this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOriginalAttachCount(value: js.Any): Self = this.set("mOriginalAttachCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberWindowAttachCount(value: () => Unit): Self = this.set("rememberWindowAttachCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSameWindow(value: () => Boolean): Self = this.set("sameWindow", js.Any.fromFunction0(value))
  }
}
