package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteRequestPayload extends js.Object {
  
  var commands: js.Array[SmartHomeV1ExecuteRequestCommands] = js.native
}
object SmartHomeV1ExecuteRequestPayload {
  
  @scala.inline
  def apply(commands: js.Array[SmartHomeV1ExecuteRequestCommands]): SmartHomeV1ExecuteRequestPayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestPayloadOps[Self <: SmartHomeV1ExecuteRequestPayload] (val x: Self) extends AnyVal {
    
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
    def setCommandsVarargs(value: SmartHomeV1ExecuteRequestCommands*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[SmartHomeV1ExecuteRequestCommands]): Self = this.set("commands", value.asInstanceOf[js.Any])
  }
}
