package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncResponse
  extends StObject
     with SmartHomeV1Response {
  
  var payload: SmartHomeV1SyncPayload
  
  var requestId: String
}
object SmartHomeV1SyncResponse {
  
  inline def apply(payload: SmartHomeV1SyncPayload, requestId: String): SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1SyncResponse] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: SmartHomeV1SyncPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
