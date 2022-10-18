package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipSandboxChannelResponse extends StObject {
  
  var APNSVoipSandboxChannelResponse: typings.awsSdk.clientsPinpointMod.APNSVoipSandboxChannelResponse
}
object UpdateApnsVoipSandboxChannelResponse {
  
  inline def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): UpdateApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelResponse]
  }
  
  extension [Self <: UpdateApnsVoipSandboxChannelResponse](x: Self) {
    
    inline def setAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
