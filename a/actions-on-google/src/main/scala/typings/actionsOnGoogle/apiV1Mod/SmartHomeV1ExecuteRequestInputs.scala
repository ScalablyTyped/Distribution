package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteRequestInputs extends StObject {
  
  var intent: SmartHomeV1Intents = js.native
  
  var payload: SmartHomeV1ExecuteRequestPayload = js.native
}
object SmartHomeV1ExecuteRequestInputs {
  
  @scala.inline
  def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1ExecuteRequestPayload): SmartHomeV1ExecuteRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestInputs]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestInputsMutableBuilder[Self <: SmartHomeV1ExecuteRequestInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: SmartHomeV1Intents): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: SmartHomeV1ExecuteRequestPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
