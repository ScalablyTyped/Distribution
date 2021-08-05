package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteRequestInputs extends StObject {
  
  var intent: SmartHomeV1Intents
  
  var payload: SmartHomeV1ExecuteRequestPayload
}
object SmartHomeV1ExecuteRequestInputs {
  
  inline def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1ExecuteRequestPayload): SmartHomeV1ExecuteRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestInputs]
  }
  
  extension [Self <: SmartHomeV1ExecuteRequestInputs](x: Self) {
    
    inline def setIntent(value: SmartHomeV1Intents): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: SmartHomeV1ExecuteRequestPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
