package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteResponse
  extends StObject
     with SmartHomeV1Response {
  
  var payload: SmartHomeV1ExecutePayload
  
  var requestId: String
}
object SmartHomeV1ExecuteResponse {
  
  inline def apply(payload: SmartHomeV1ExecutePayload, requestId: String): SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1ExecuteResponse] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: SmartHomeV1ExecutePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
