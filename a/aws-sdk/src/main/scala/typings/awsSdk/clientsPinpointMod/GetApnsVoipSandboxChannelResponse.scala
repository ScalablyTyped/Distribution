package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApnsVoipSandboxChannelResponse extends StObject {
  
  var APNSVoipSandboxChannelResponse: typings.awsSdk.clientsPinpointMod.APNSVoipSandboxChannelResponse
}
object GetApnsVoipSandboxChannelResponse {
  
  inline def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): GetApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsVoipSandboxChannelResponse]
  }
  
  extension [Self <: GetApnsVoipSandboxChannelResponse](x: Self) {
    
    inline def setAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
