package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteRequestPayload extends StObject {
  
  var commands: js.Array[SmartHomeV1ExecuteRequestCommands]
}
object SmartHomeV1ExecuteRequestPayload {
  
  @scala.inline
  def apply(commands: js.Array[SmartHomeV1ExecuteRequestCommands]): SmartHomeV1ExecuteRequestPayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestPayloadMutableBuilder[Self <: SmartHomeV1ExecuteRequestPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: js.Array[SmartHomeV1ExecuteRequestCommands]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsVarargs(value: SmartHomeV1ExecuteRequestCommands*): Self = StObject.set(x, "commands", js.Array(value :_*))
  }
}
