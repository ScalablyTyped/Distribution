package typings.actionsOnGoogle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ack extends js.Object {
  
  var ack: js.UndefOr[Boolean] = js.native
  
  var pin: js.UndefOr[String] = js.native
}
object Ack {
  
  @scala.inline
  def apply(): Ack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ack]
  }
  
  @scala.inline
  implicit class AckOps[Self <: Ack] (val x: Self) extends AnyVal {
    
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
    def setAck(value: Boolean): Self = this.set("ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAck: Self = this.set("ack", js.undefined)
    
    @scala.inline
    def setPin(value: String): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
  }
}
