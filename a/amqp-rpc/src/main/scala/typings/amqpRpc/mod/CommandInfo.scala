package typings.amqpRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandInfo extends js.Object {
  
  var cmd: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var exchange: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object CommandInfo {
  
  @scala.inline
  def apply(): CommandInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandInfo]
  }
  
  @scala.inline
  implicit class CommandInfoOps[Self <: CommandInfo] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
