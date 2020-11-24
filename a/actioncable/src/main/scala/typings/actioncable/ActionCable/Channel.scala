package typings.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
  def perform(action: String, data: js.Object): Unit = js.native
  
  def send(data: js.Any): Boolean = js.native
  
  def unsubscribe(): Unit = js.native
}
object Channel {
  
  @scala.inline
  def apply(perform: (String, js.Object) => Unit, send: js.Any => Boolean, unsubscribe: () => Unit): Channel = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction2(perform), send = js.Any.fromFunction1(send), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    
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
    def setPerform(value: (String, js.Object) => Unit): Self = this.set("perform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(value: js.Any => Boolean): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
}
