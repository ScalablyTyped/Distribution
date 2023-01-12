package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsSandboxChannelResponse extends StObject {
  
  var APNSSandboxChannelResponse: typings.awsSdk.clientsPinpointMod.APNSSandboxChannelResponse
}
object UpdateApnsSandboxChannelResponse {
  
  inline def apply(APNSSandboxChannelResponse: APNSSandboxChannelResponse): UpdateApnsSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApnsSandboxChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setAPNSSandboxChannelResponse(value: APNSSandboxChannelResponse): Self = StObject.set(x, "APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
