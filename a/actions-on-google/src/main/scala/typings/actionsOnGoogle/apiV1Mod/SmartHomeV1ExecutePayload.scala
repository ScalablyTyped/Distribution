package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecutePayload extends StObject {
  
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
  implicit class SmartHomeV1ExecutePayloadMutableBuilder[Self <: SmartHomeV1ExecutePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: js.Array[SmartHomeV1ExecuteResponseCommands]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsVarargs(value: SmartHomeV1ExecuteResponseCommands*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    @scala.inline
    def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    @scala.inline
    def setErrorCode(value: SmartHomeV1ExecuteErrors): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
