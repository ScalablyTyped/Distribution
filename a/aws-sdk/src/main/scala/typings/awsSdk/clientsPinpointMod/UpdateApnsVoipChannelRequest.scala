package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipChannelRequest extends StObject {
  
  var APNSVoipChannelRequest: typings.awsSdk.clientsPinpointMod.APNSVoipChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateApnsVoipChannelRequest {
  
  inline def apply(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: string): UpdateApnsVoipChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipChannelRequest]
  }
  
  extension [Self <: UpdateApnsVoipChannelRequest](x: Self) {
    
    inline def setAPNSVoipChannelRequest(value: APNSVoipChannelRequest): Self = StObject.set(x, "APNSVoipChannelRequest", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
