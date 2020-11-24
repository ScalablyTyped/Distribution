package typings.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCancelListener extends js.Object {
  
  def onCancel(dialog: typings.androiduix.android.content.DialogInterface): Unit = js.native
}
object OnCancelListener {
  
  @scala.inline
  def apply(onCancel: typings.androiduix.android.content.DialogInterface => Unit): OnCancelListener = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel))
    __obj.asInstanceOf[OnCancelListener]
  }
  
  @scala.inline
  implicit class OnCancelListenerOps[Self <: OnCancelListener] (val x: Self) extends AnyVal {
    
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
    def setOnCancel(value: typings.androiduix.android.content.DialogInterface => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
  }
}
