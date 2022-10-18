package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSilenceFailoverSettings extends StObject {
  
  /**
    * The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most important rendition. If you didn't create an audio selector in this input, leave blank.
    */
  var AudioSelectorName: string
  
  /**
    * The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs. Silence is defined as audio loss or audio quieter than -50 dBFS.
    */
  var AudioSilenceThresholdMsec: js.UndefOr[integerMin1000] = js.undefined
}
object AudioSilenceFailoverSettings {
  
  inline def apply(AudioSelectorName: string): AudioSilenceFailoverSettings = {
    val __obj = js.Dynamic.literal(AudioSelectorName = AudioSelectorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSilenceFailoverSettings]
  }
  
  extension [Self <: AudioSilenceFailoverSettings](x: Self) {
    
    inline def setAudioSelectorName(value: string): Self = StObject.set(x, "AudioSelectorName", value.asInstanceOf[js.Any])
    
    inline def setAudioSilenceThresholdMsec(value: integerMin1000): Self = StObject.set(x, "AudioSilenceThresholdMsec", value.asInstanceOf[js.Any])
    
    inline def setAudioSilenceThresholdMsecUndefined: Self = StObject.set(x, "AudioSilenceThresholdMsec", js.undefined)
  }
}
