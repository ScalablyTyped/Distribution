package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Devices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ReportStateRequest extends StObject {
  
  var agentUserId: String
  
  var payload: Devices
  
  var requestId: String
}
object SmartHomeV1ReportStateRequest {
  
  inline def apply(agentUserId: String, payload: Devices, requestId: String): SmartHomeV1ReportStateRequest = {
    val __obj = js.Dynamic.literal(agentUserId = agentUserId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ReportStateRequest]
  }
  
  extension [Self <: SmartHomeV1ReportStateRequest](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Devices): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
