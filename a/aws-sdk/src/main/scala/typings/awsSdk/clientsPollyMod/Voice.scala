package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Voice extends StObject {
  
  /**
    * Additional codes for languages available for the specified voice in addition to its default language.  For example, the default language for Aditi is Indian English (en-IN) because it was first used for that language. Since Aditi is bilingual and fluent in both Indian English and Hindi, this parameter would show the code hi-IN.
    */
  var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList] = js.undefined
  
  /**
    * Gender of the voice.
    */
  var Gender: js.UndefOr[typings.awsSdk.clientsPollyMod.Gender] = js.undefined
  
  /**
    * Amazon Polly assigned voice ID. This is the ID that you specify when calling the SynthesizeSpeech operation.
    */
  var Id: js.UndefOr[VoiceId] = js.undefined
  
  /**
    * Language code of the voice.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsPollyMod.LanguageCode] = js.undefined
  
  /**
    * Human readable name of the language in English.
    */
  var LanguageName: js.UndefOr[typings.awsSdk.clientsPollyMod.LanguageName] = js.undefined
  
  /**
    * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might display in your application.
    */
  var Name: js.UndefOr[VoiceName] = js.undefined
  
  /**
    * Specifies which engines (standard or neural) that are supported by a given voice.
    */
  var SupportedEngines: js.UndefOr[EngineList] = js.undefined
}
object Voice {
  
  inline def apply(): Voice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Voice]
  }
  
  extension [Self <: Voice](x: Self) {
    
    inline def setAdditionalLanguageCodes(value: LanguageCodeList): Self = StObject.set(x, "AdditionalLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalLanguageCodesUndefined: Self = StObject.set(x, "AdditionalLanguageCodes", js.undefined)
    
    inline def setAdditionalLanguageCodesVarargs(value: LanguageCode*): Self = StObject.set(x, "AdditionalLanguageCodes", js.Array(value*))
    
    inline def setGender(value: Gender): Self = StObject.set(x, "Gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "Gender", js.undefined)
    
    inline def setId(value: VoiceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageName(value: LanguageName): Self = StObject.set(x, "LanguageName", value.asInstanceOf[js.Any])
    
    inline def setLanguageNameUndefined: Self = StObject.set(x, "LanguageName", js.undefined)
    
    inline def setName(value: VoiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSupportedEngines(value: EngineList): Self = StObject.set(x, "SupportedEngines", value.asInstanceOf[js.Any])
    
    inline def setSupportedEnginesUndefined: Self = StObject.set(x, "SupportedEngines", js.undefined)
    
    inline def setSupportedEnginesVarargs(value: Engine*): Self = StObject.set(x, "SupportedEngines", js.Array(value*))
  }
}
