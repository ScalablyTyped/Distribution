package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsSandboxChannelRequest extends StObject {
  
  var APNSSandboxChannelRequest: typings.awsSdk.clientsPinpointMod.APNSSandboxChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateApnsSandboxChannelRequest {
  
  inline def apply(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: string): UpdateApnsSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
  }
  
  extension [Self <: UpdateApnsSandboxChannelRequest](x: Self) {
    
    inline def setAPNSSandboxChannelRequest(value: APNSSandboxChannelRequest): Self = StObject.set(x, "APNSSandboxChannelRequest", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
