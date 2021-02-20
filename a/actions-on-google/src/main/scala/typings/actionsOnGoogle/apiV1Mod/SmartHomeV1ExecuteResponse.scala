package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteResponse extends SmartHomeV1Response {
  
  var payload: SmartHomeV1ExecutePayload = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1ExecuteResponse {
  
  @scala.inline
  def apply(payload: SmartHomeV1ExecutePayload, requestId: String): SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponse]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteResponseMutableBuilder[Self <: SmartHomeV1ExecuteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: SmartHomeV1ExecutePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
