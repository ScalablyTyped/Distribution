package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsChannelRequest extends StObject {
  
  var APNSChannelRequest: typings.awsSdk.clientsPinpointMod.APNSChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateApnsChannelRequest {
  
  inline def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: string): UpdateApnsChannelRequest = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApnsChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setAPNSChannelRequest(value: APNSChannelRequest): Self = StObject.set(x, "APNSChannelRequest", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
