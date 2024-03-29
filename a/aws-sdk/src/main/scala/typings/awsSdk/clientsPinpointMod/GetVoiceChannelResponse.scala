package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typings.awsSdk.clientsPinpointMod.VoiceChannelResponse
}
object GetVoiceChannelResponse {
  
  inline def apply(VoiceChannelResponse: VoiceChannelResponse): GetVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}
