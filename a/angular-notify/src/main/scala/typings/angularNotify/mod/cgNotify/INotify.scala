package typings.angularNotify.mod.cgNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotify extends js.Object {
  
  /**
    * Close this open notifications.
    */
  def close(): Unit = js.native
  
  /**
    * The message to show.
    */
  var message: String = js.native
}
object INotify {
  
  @scala.inline
  def apply(close: () => Unit, message: String): INotify = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotify]
  }
  
  @scala.inline
  implicit class INotifyOps[Self <: INotify] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
