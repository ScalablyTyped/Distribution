package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1DisconnectRequest
  extends StObject
     with SmartHomeV1Request {
  
  var inputs: js.Array[Intent]
  
  var requestId: String
}
object SmartHomeV1DisconnectRequest {
  
  inline def apply(inputs: js.Array[Intent], requestId: String): SmartHomeV1DisconnectRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1DisconnectRequest]
  }
  
  extension [Self <: SmartHomeV1DisconnectRequest](x: Self) {
    
    inline def setInputs(value: js.Array[Intent]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: Intent*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
