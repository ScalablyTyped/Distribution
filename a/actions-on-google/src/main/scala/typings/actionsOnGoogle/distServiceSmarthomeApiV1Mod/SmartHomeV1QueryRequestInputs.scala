package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryRequestInputs extends StObject {
  
  var intent: SmartHomeV1Intents
  
  var payload: SmartHomeV1QueryRequestPayload
}
object SmartHomeV1QueryRequestInputs {
  
  inline def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1QueryRequestPayload): SmartHomeV1QueryRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1QueryRequestInputs] (val x: Self) extends AnyVal {
    
    inline def setIntent(value: SmartHomeV1Intents): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: SmartHomeV1QueryRequestPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
