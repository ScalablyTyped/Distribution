package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionDescriptionPreset extends StObject {
  
  /**
    * Specify the language for this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information when automatically selecting the font script for rendering the captions text. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
    */
  var CustomLanguageCode: js.UndefOr[stringPatternAZaZ23AZaZ] = js.undefined
  
  /**
    * Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to one output captions track. Depending on your output captions format, one tab might correspond to a set of output captions tracks. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
  
  /**
    * Specify the language of this captions output track. For most captions output formats, the encoder puts this language information in the output captions metadata. If your output captions format is DVB-Sub or Burn in, the encoder uses this language information to choose the font language for rendering the captions text.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.LanguageCode] = js.undefined
  
  /**
    * Specify a label for this set of output captions. For example, "English", "Director commentary", or "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for display on the end-viewer's player device. For outputs in other output groups, the service ignores this setting.
    */
  var LanguageDescription: js.UndefOr[string] = js.undefined
}
object CaptionDescriptionPreset {
  
  inline def apply(): CaptionDescriptionPreset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionDescriptionPreset]
  }
  
  extension [Self <: CaptionDescriptionPreset](x: Self) {
    
    inline def setCustomLanguageCode(value: stringPatternAZaZ23AZaZ): Self = StObject.set(x, "CustomLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCustomLanguageCodeUndefined: Self = StObject.set(x, "CustomLanguageCode", js.undefined)
    
    inline def setDestinationSettings(value: CaptionDestinationSettings): Self = StObject.set(x, "DestinationSettings", value.asInstanceOf[js.Any])
    
    inline def setDestinationSettingsUndefined: Self = StObject.set(x, "DestinationSettings", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageDescription(value: string): Self = StObject.set(x, "LanguageDescription", value.asInstanceOf[js.Any])
    
    inline def setLanguageDescriptionUndefined: Self = StObject.set(x, "LanguageDescription", js.undefined)
  }
}
