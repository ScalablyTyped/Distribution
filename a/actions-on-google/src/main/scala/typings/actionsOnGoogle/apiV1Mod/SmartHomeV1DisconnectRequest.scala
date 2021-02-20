package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1DisconnectRequest extends SmartHomeV1Request {
  
  var inputs: js.Array[Intent] = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1DisconnectRequest {
  
  @scala.inline
  def apply(inputs: js.Array[Intent], requestId: String): SmartHomeV1DisconnectRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1DisconnectRequest]
  }
  
  @scala.inline
  implicit class SmartHomeV1DisconnectRequestMutableBuilder[Self <: SmartHomeV1DisconnectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[Intent]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: Intent*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
