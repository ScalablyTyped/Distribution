package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var EmailChannelRequest: typings.awsSdk.clientsPinpointMod.EmailChannelRequest
}
object UpdateEmailChannelRequest {
  
  inline def apply(ApplicationId: string, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelRequest]
  }
  
  extension [Self <: UpdateEmailChannelRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEmailChannelRequest(value: EmailChannelRequest): Self = StObject.set(x, "EmailChannelRequest", value.asInstanceOf[js.Any])
  }
}
