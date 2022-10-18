package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceChannelRequest extends StObject {
  
  /**
    * Specifies whether to enable the voice channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object VoiceChannelRequest {
  
  inline def apply(): VoiceChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceChannelRequest]
  }
  
  extension [Self <: VoiceChannelRequest](x: Self) {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
