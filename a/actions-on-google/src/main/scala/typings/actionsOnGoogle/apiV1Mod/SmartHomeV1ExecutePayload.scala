package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecutePayload extends js.Object {
  
  var commands: js.Array[SmartHomeV1ExecuteResponseCommands] = js.native
  
  var debugString: js.UndefOr[String] = js.native
  
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.native
}
object SmartHomeV1ExecutePayload {
  
  @scala.inline
  def apply(commands: js.Array[SmartHomeV1ExecuteResponseCommands]): SmartHomeV1ExecutePayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecutePayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecutePayloadOps[Self <: SmartHomeV1ExecutePayload] (val x: Self) extends AnyVal {
    
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
    def setCommandsVarargs(value: SmartHomeV1ExecuteResponseCommands*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[SmartHomeV1ExecuteResponseCommands]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugString(value: String): Self = this.set("debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugString: Self = this.set("debugString", js.undefined)
    
    @scala.inline
    def setErrorCode(value: SmartHomeV1ExecuteErrors): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
  }
}
