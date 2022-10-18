package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncRequestInputs extends StObject {
  
  var intent: SmartHomeV1Intents
}
object SmartHomeV1SyncRequestInputs {
  
  inline def apply(intent: SmartHomeV1Intents): SmartHomeV1SyncRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncRequestInputs]
  }
  
  extension [Self <: SmartHomeV1SyncRequestInputs](x: Self) {
    
    inline def setIntent(value: SmartHomeV1Intents): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
