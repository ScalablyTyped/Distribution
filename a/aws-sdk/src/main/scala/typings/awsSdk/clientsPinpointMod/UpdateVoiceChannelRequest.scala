package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var VoiceChannelRequest: typings.awsSdk.clientsPinpointMod.VoiceChannelRequest
}
object UpdateVoiceChannelRequest {
  
  inline def apply(ApplicationId: string, VoiceChannelRequest: VoiceChannelRequest): UpdateVoiceChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], VoiceChannelRequest = VoiceChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceChannelRequest]
  }
  
  extension [Self <: UpdateVoiceChannelRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setVoiceChannelRequest(value: VoiceChannelRequest): Self = StObject.set(x, "VoiceChannelRequest", value.asInstanceOf[js.Any])
  }
}
