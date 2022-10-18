package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryResponse
  extends StObject
     with SmartHomeV1Response {
  
  var payload: SmartHomeV1QueryPayload
  
  var requestId: String
}
object SmartHomeV1QueryResponse {
  
  inline def apply(payload: SmartHomeV1QueryPayload, requestId: String): SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryResponse]
  }
  
  extension [Self <: SmartHomeV1QueryResponse](x: Self) {
    
    inline def setPayload(value: SmartHomeV1QueryPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
