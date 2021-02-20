package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Ack
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteRequestExecution extends StObject {
  
  var challenge: js.UndefOr[Ack] = js.native
  
  var command: String = js.native
  
  var params: js.UndefOr[ApiClientObjectMap[_]] = js.native
}
object SmartHomeV1ExecuteRequestExecution {
  
  @scala.inline
  def apply(command: String): SmartHomeV1ExecuteRequestExecution = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestExecution]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestExecutionMutableBuilder[Self <: SmartHomeV1ExecuteRequestExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallenge(value: Ack): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: ApiClientObjectMap[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
