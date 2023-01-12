package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typings.awsSdk.clientsPinpointMod.VoiceChannelResponse
}
object DeleteVoiceChannelResponse {
  
  inline def apply(VoiceChannelResponse: VoiceChannelResponse): DeleteVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVoiceChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}
