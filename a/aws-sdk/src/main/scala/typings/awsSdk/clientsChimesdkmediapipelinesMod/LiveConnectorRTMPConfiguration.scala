package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveConnectorRTMPConfiguration extends StObject {
  
  /**
    * The audio channels set for the RTMP configuration
    */
  var AudioChannels: js.UndefOr[AudioChannelsOption] = js.undefined
  
  /**
    * The audio sample rate set for the RTMP configuration. Default: 48000.
    */
  var AudioSampleRate: js.UndefOr[AudioSampleRateOption] = js.undefined
  
  /**
    * The URL of the RTMP configuration.
    */
  var Url: SensitiveString
}
object LiveConnectorRTMPConfiguration {
  
  inline def apply(Url: SensitiveString): LiveConnectorRTMPConfiguration = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveConnectorRTMPConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveConnectorRTMPConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAudioChannels(value: AudioChannelsOption): Self = StObject.set(x, "AudioChannels", value.asInstanceOf[js.Any])
    
    inline def setAudioChannelsUndefined: Self = StObject.set(x, "AudioChannels", js.undefined)
    
    inline def setAudioSampleRate(value: AudioSampleRateOption): Self = StObject.set(x, "AudioSampleRate", value.asInstanceOf[js.Any])
    
    inline def setAudioSampleRateUndefined: Self = StObject.set(x, "AudioSampleRate", js.undefined)
    
    inline def setUrl(value: SensitiveString): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
