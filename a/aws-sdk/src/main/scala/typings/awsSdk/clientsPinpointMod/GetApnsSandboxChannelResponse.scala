package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApnsSandboxChannelResponse extends StObject {
  
  var APNSSandboxChannelResponse: typings.awsSdk.clientsPinpointMod.APNSSandboxChannelResponse
}
object GetApnsSandboxChannelResponse {
  
  inline def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): GetApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsSandboxChannelResponse]
  }
  
  extension [Self <: GetApnsSandboxChannelResponse](x: Self) {
    
    inline def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
