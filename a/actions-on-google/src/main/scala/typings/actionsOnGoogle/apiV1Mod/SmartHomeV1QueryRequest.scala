package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryRequest
  extends StObject
     with SmartHomeV1Request {
  
  var inputs: js.Array[SmartHomeV1QueryRequestInputs]
  
  var requestId: String
}
object SmartHomeV1QueryRequest {
  
  inline def apply(inputs: js.Array[SmartHomeV1QueryRequestInputs], requestId: String): SmartHomeV1QueryRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequest]
  }
  
  extension [Self <: SmartHomeV1QueryRequest](x: Self) {
    
    inline def setInputs(value: js.Array[SmartHomeV1QueryRequestInputs]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: SmartHomeV1QueryRequestInputs*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
