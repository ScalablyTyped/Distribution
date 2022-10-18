package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSource extends StObject {
  
  /**
    * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want Elastic Transcoder to apply to your caption sources.
    */
  var Encryption: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Encryption] = js.undefined
  
  /**
    * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
    */
  var Key: js.UndefOr[LongKey] = js.undefined
  
  /**
    * The label of the caption shown in the player when choosing a language. We recommend that you put the caption language name here, in the language of the captions.
    */
  var Label: js.UndefOr[Name] = js.undefined
  
  /**
    * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption language must match in order to be included in the output. Specify this as one of:   2-character ISO 639-1 code   3-character ISO 639-2 code   For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
    */
  var Language: js.UndefOr[Key] = js.undefined
  
  /**
    * For clip generation or captions that do not start at the same time as the associated video file, the TimeOffset tells Elastic Transcoder how much of the video to encode before including captions. Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
    */
  var TimeOffset: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.TimeOffset] = js.undefined
}
object CaptionSource {
  
  inline def apply(): CaptionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSource]
  }
  
  extension [Self <: CaptionSource](x: Self) {
    
    inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setKey(value: LongKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setLabel(value: Name): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setLanguage(value: Key): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setTimeOffset(value: TimeOffset): Self = StObject.set(x, "TimeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "TimeOffset", js.undefined)
  }
}
