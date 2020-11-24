package typings.androiduix.android.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogInterface_ extends js.Object {
  
  def cancel(): Unit = js.native
  
  def dismiss(): Unit = js.native
}
object DialogInterface_ {
  
  @scala.inline
  def apply(cancel: () => Unit, dismiss: () => Unit): DialogInterface_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[DialogInterface_]
  }
  
  @scala.inline
  implicit class DialogInterface_Ops[Self <: DialogInterface_] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDismiss(value: () => Unit): Self = this.set("dismiss", js.Any.fromFunction0(value))
  }
}
