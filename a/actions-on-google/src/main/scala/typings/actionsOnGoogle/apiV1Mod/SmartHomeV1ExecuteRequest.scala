package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteRequest
  extends StObject
     with SmartHomeV1Request {
  
  var inputs: js.Array[SmartHomeV1ExecuteRequestInputs]
  
  var requestId: String
}
object SmartHomeV1ExecuteRequest {
  
  inline def apply(inputs: js.Array[SmartHomeV1ExecuteRequestInputs], requestId: String): SmartHomeV1ExecuteRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequest]
  }
  
  extension [Self <: SmartHomeV1ExecuteRequest](x: Self) {
    
    inline def setInputs(value: js.Array[SmartHomeV1ExecuteRequestInputs]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: SmartHomeV1ExecuteRequestInputs*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
