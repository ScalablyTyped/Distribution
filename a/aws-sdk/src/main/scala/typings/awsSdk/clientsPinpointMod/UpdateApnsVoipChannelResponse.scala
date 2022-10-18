package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipChannelResponse extends StObject {
  
  var APNSVoipChannelResponse: typings.awsSdk.clientsPinpointMod.APNSVoipChannelResponse
}
object UpdateApnsVoipChannelResponse {
  
  inline def apply(APNSVoipChannelResponse: APNSVoipChannelResponse): UpdateApnsVoipChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipChannelResponse]
  }
  
  extension [Self <: UpdateApnsVoipChannelResponse](x: Self) {
    
    inline def setAPNSVoipChannelResponse(value: APNSVoipChannelResponse): Self = StObject.set(x, "APNSVoipChannelResponse", value.asInstanceOf[js.Any])
  }
}
