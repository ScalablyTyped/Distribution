package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1QueryRequest extends SmartHomeV1Request {
  
  var inputs: js.Array[SmartHomeV1QueryRequestInputs] = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1QueryRequest {
  
  @scala.inline
  def apply(inputs: js.Array[SmartHomeV1QueryRequestInputs], requestId: String): SmartHomeV1QueryRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequest]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryRequestMutableBuilder[Self <: SmartHomeV1QueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[SmartHomeV1QueryRequestInputs]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: SmartHomeV1QueryRequestInputs*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
