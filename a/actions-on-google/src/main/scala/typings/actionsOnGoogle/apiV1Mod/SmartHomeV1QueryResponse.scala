package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1QueryResponse extends SmartHomeV1Response {
  
  var payload: SmartHomeV1QueryPayload = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1QueryResponse {
  
  @scala.inline
  def apply(payload: SmartHomeV1QueryPayload, requestId: String): SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryResponse]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryResponseMutableBuilder[Self <: SmartHomeV1QueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: SmartHomeV1QueryPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
