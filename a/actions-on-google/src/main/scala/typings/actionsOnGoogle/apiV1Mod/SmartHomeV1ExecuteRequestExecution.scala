package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Ack
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteRequestExecution extends StObject {
  
  var challenge: js.UndefOr[Ack] = js.undefined
  
  var command: String
  
  var params: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
}
object SmartHomeV1ExecuteRequestExecution {
  
  inline def apply(command: String): SmartHomeV1ExecuteRequestExecution = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestExecution]
  }
  
  extension [Self <: SmartHomeV1ExecuteRequestExecution](x: Self) {
    
    inline def setChallenge(value: Ack): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setParams(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
