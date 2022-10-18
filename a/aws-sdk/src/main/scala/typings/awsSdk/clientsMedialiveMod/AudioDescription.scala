package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDescription extends StObject {
  
  /**
    * Advanced audio normalization settings.
    */
  var AudioNormalizationSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioNormalizationSettings] = js.undefined
  
  /**
    * The name of the AudioSelector used as the source for this AudioDescription.
    */
  var AudioSelectorName: string
  
  /**
    * Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
    */
  var AudioType: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AudioType] = js.undefined
  
  /**
    * Determines how audio type is determined.
    followInput: If the input contains an ISO 639 audioType, then that value is passed through to the output. If the input contains no ISO 639 audioType, the value in Audio Type is included in the output.
    useConfigured: The value in Audio Type is included in the output.
  Note that this field and audioType are both ignored if inputType is broadcasterMixedAd.
    */
  var AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl] = js.undefined
  
  /**
    * Settings to configure one or more solutions that insert audio watermarks in the audio encode
    */
  var AudioWatermarkingSettings: js.UndefOr[AudioWatermarkSettings] = js.undefined
  
  /**
    * Audio codec settings.
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined
  
  /**
    * RFC 5646 language code representing the language of the audio output track. Only used if languageControlMode is useConfigured, or there is no ISO 639 language code specified in the input.
    */
  var LanguageCode: js.UndefOr[stringMin1Max35] = js.undefined
  
  /**
    * Choosing followInput will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The languageCode will be used when useConfigured is set, or when followInput is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl] = js.undefined
  
  /**
    * The name of this AudioDescription. Outputs will use this name to uniquely identify this AudioDescription.  Description names should be unique within this Live Event.
    */
  var Name: stringMax255
  
  /**
    * Settings that control how input audio channels are remixed into the output audio channels.
    */
  var RemixSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.RemixSettings] = js.undefined
  
  /**
    * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary).
    */
  var StreamName: js.UndefOr[string] = js.undefined
}
object AudioDescription {
  
  inline def apply(AudioSelectorName: string, Name: stringMax255): AudioDescription = {
    val __obj = js.Dynamic.literal(AudioSelectorName = AudioSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDescription]
  }
  
  extension [Self <: AudioDescription](x: Self) {
    
    inline def setAudioNormalizationSettings(value: AudioNormalizationSettings): Self = StObject.set(x, "AudioNormalizationSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioNormalizationSettingsUndefined: Self = StObject.set(x, "AudioNormalizationSettings", js.undefined)
    
    inline def setAudioSelectorName(value: string): Self = StObject.set(x, "AudioSelectorName", value.asInstanceOf[js.Any])
    
    inline def setAudioType(value: AudioType): Self = StObject.set(x, "AudioType", value.asInstanceOf[js.Any])
    
    inline def setAudioTypeControl(value: AudioDescriptionAudioTypeControl): Self = StObject.set(x, "AudioTypeControl", value.asInstanceOf[js.Any])
    
    inline def setAudioTypeControlUndefined: Self = StObject.set(x, "AudioTypeControl", js.undefined)
    
    inline def setAudioTypeUndefined: Self = StObject.set(x, "AudioType", js.undefined)
    
    inline def setAudioWatermarkingSettings(value: AudioWatermarkSettings): Self = StObject.set(x, "AudioWatermarkingSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioWatermarkingSettingsUndefined: Self = StObject.set(x, "AudioWatermarkingSettings", js.undefined)
    
    inline def setCodecSettings(value: AudioCodecSettings): Self = StObject.set(x, "CodecSettings", value.asInstanceOf[js.Any])
    
    inline def setCodecSettingsUndefined: Self = StObject.set(x, "CodecSettings", js.undefined)
    
    inline def setLanguageCode(value: stringMin1Max35): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeControl(value: AudioDescriptionLanguageCodeControl): Self = StObject.set(x, "LanguageCodeControl", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeControlUndefined: Self = StObject.set(x, "LanguageCodeControl", js.undefined)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setName(value: stringMax255): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRemixSettings(value: RemixSettings): Self = StObject.set(x, "RemixSettings", value.asInstanceOf[js.Any])
    
    inline def setRemixSettingsUndefined: Self = StObject.set(x, "RemixSettings", js.undefined)
    
    inline def setStreamName(value: string): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
