package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1DisconnectRequest] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: js.Array[Intent]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: Intent*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
