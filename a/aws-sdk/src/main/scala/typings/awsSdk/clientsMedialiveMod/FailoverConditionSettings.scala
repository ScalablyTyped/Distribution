package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverConditionSettings extends StObject {
  
  /**
    * MediaLive will perform a failover if the specified audio selector is silent for the specified period.
    */
  var AudioSilenceSettings: js.UndefOr[AudioSilenceFailoverSettings] = js.undefined
  
  /**
    * MediaLive will perform a failover if content is not detected in this input for the specified period.
    */
  var InputLossSettings: js.UndefOr[InputLossFailoverSettings] = js.undefined
  
  /**
    * MediaLive will perform a failover if content is considered black for the specified period.
    */
  var VideoBlackSettings: js.UndefOr[VideoBlackFailoverSettings] = js.undefined
}
object FailoverConditionSettings {
  
  inline def apply(): FailoverConditionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConditionSettings]
  }
  
  extension [Self <: FailoverConditionSettings](x: Self) {
    
    inline def setAudioSilenceSettings(value: AudioSilenceFailoverSettings): Self = StObject.set(x, "AudioSilenceSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioSilenceSettingsUndefined: Self = StObject.set(x, "AudioSilenceSettings", js.undefined)
    
    inline def setInputLossSettings(value: InputLossFailoverSettings): Self = StObject.set(x, "InputLossSettings", value.asInstanceOf[js.Any])
    
    inline def setInputLossSettingsUndefined: Self = StObject.set(x, "InputLossSettings", js.undefined)
    
    inline def setVideoBlackSettings(value: VideoBlackFailoverSettings): Self = StObject.set(x, "VideoBlackSettings", value.asInstanceOf[js.Any])
    
    inline def setVideoBlackSettingsUndefined: Self = StObject.set(x, "VideoBlackSettings", js.undefined)
  }
}
