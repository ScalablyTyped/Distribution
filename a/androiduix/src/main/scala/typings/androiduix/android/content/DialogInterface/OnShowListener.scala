package typings.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnShowListener extends js.Object {
  
  def onShow(dialog: typings.androiduix.android.content.DialogInterface): Unit = js.native
}
object OnShowListener {
  
  @scala.inline
  def apply(onShow: typings.androiduix.android.content.DialogInterface => Unit): OnShowListener = {
    val __obj = js.Dynamic.literal(onShow = js.Any.fromFunction1(onShow))
    __obj.asInstanceOf[OnShowListener]
  }
  
  @scala.inline
  implicit class OnShowListenerOps[Self <: OnShowListener] (val x: Self) extends AnyVal {
    
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
    def setOnShow(value: typings.androiduix.android.content.DialogInterface => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
  }
}
