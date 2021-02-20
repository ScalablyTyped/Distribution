package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncRequest extends SmartHomeV1Request {
  
  var inputs: js.Array[SmartHomeV1SyncRequestInputs] = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1SyncRequest {
  
  @scala.inline
  def apply(inputs: js.Array[SmartHomeV1SyncRequestInputs], requestId: String): SmartHomeV1SyncRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncRequest]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncRequestMutableBuilder[Self <: SmartHomeV1SyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[SmartHomeV1SyncRequestInputs]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: SmartHomeV1SyncRequestInputs*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
