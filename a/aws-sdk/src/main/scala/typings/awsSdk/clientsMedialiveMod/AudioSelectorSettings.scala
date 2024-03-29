package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelectorSettings extends StObject {
  
  var AudioHlsRenditionSelection: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioHlsRenditionSelection] = js.undefined
  
  var AudioLanguageSelection: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioLanguageSelection] = js.undefined
  
  var AudioPidSelection: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioPidSelection] = js.undefined
  
  var AudioTrackSelection: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioTrackSelection] = js.undefined
}
object AudioSelectorSettings {
  
  inline def apply(): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioSelectorSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioHlsRenditionSelection(value: AudioHlsRenditionSelection): Self = StObject.set(x, "AudioHlsRenditionSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioHlsRenditionSelectionUndefined: Self = StObject.set(x, "AudioHlsRenditionSelection", js.undefined)
    
    inline def setAudioLanguageSelection(value: AudioLanguageSelection): Self = StObject.set(x, "AudioLanguageSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioLanguageSelectionUndefined: Self = StObject.set(x, "AudioLanguageSelection", js.undefined)
    
    inline def setAudioPidSelection(value: AudioPidSelection): Self = StObject.set(x, "AudioPidSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioPidSelectionUndefined: Self = StObject.set(x, "AudioPidSelection", js.undefined)
    
    inline def setAudioTrackSelection(value: AudioTrackSelection): Self = StObject.set(x, "AudioTrackSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackSelectionUndefined: Self = StObject.set(x, "AudioTrackSelection", js.undefined)
  }
}
