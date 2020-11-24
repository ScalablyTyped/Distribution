package typings.amqp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumercancelnotify extends js.Object {
  
  var consumer_cancel_notify: js.UndefOr[Boolean] = js.native
}
object Consumercancelnotify {
  
  @scala.inline
  def apply(): Consumercancelnotify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consumercancelnotify]
  }
  
  @scala.inline
  implicit class ConsumercancelnotifyOps[Self <: Consumercancelnotify] (val x: Self) extends AnyVal {
    
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
    def setConsumer_cancel_notify(value: Boolean): Self = this.set("consumer_cancel_notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumer_cancel_notify: Self = this.set("consumer_cancel_notify", js.undefined)
  }
}
