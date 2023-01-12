package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteRequestPayload extends StObject {
  
  var commands: js.Array[SmartHomeV1ExecuteRequestCommands]
}
object SmartHomeV1ExecuteRequestPayload {
  
  inline def apply(commands: js.Array[SmartHomeV1ExecuteRequestCommands]): SmartHomeV1ExecuteRequestPayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1ExecuteRequestPayload] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: js.Array[SmartHomeV1ExecuteRequestCommands]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: SmartHomeV1ExecuteRequestCommands*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}
