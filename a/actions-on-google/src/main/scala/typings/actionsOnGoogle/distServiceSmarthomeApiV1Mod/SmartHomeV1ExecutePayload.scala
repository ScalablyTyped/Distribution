package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecutePayload extends StObject {
  
  var commands: js.Array[SmartHomeV1ExecuteResponseCommands]
  
  var debugString: js.UndefOr[String] = js.undefined
  
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.undefined
}
object SmartHomeV1ExecutePayload {
  
  inline def apply(commands: js.Array[SmartHomeV1ExecuteResponseCommands]): SmartHomeV1ExecutePayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecutePayload]
  }
  
  extension [Self <: SmartHomeV1ExecutePayload](x: Self) {
    
    inline def setCommands(value: js.Array[SmartHomeV1ExecuteResponseCommands]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: SmartHomeV1ExecuteResponseCommands*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    inline def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    inline def setErrorCode(value: SmartHomeV1ExecuteErrors): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
