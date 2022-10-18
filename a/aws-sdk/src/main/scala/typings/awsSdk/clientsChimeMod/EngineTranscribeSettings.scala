package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineTranscribeSettings extends StObject {
  
  /**
    * Set this field to PII to identify personally identifiable information in the transcription output.
    */
  var ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType] = js.undefined
  
  /**
    * Set this field to PII to redact personally identifiable information in the transcription output. Content redaction is performed only upon complete transcription of the audio segments.
    */
  var ContentRedactionType: js.UndefOr[TranscribeContentRedactionType] = js.undefined
  
  /**
    * Generates partial transcription results that are less likely to change as meeting attendees speak. It does so by only allowing the last few words from the partial results to change.
    */
  var EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language code specified for the Amazon Transcribe engine.
    */
  var LanguageCode: TranscribeLanguageCode
  
  /**
    * The name of the language model used during transcription.
    */
  var LanguageModelName: js.UndefOr[TranscribeLanguageModelName] = js.undefined
  
  /**
    * The stabity level of a partial results transcription. Determines how stable you want the transcription results to be. A higher level means the transcription results are less likely to change.
    */
  var PartialResultsStability: js.UndefOr[TranscribePartialResultsStability] = js.undefined
  
  /**
    * Lists the PII entity types you want to identify or redact. To specify entity types, you must enable ContentIdentificationType or ContentRedactionType.  PIIEntityTypes must be comma-separated. The available values are: BANK_ACCOUNT_NUMBER, BANK_ROUTING, CREDIT_DEBIT_NUMBER, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, PIN, EMAIL, ADDRESS, NAME, PHONE, SSN, and ALL.  PiiEntityTypes is an optional parameter with a default value of ALL.
    */
  var PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes] = js.undefined
  
  /**
    * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's Region.
    */
  var Region: js.UndefOr[TranscribeRegion] = js.undefined
  
  /**
    * The filtering method passed to Amazon Transcribe.
    */
  var VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod] = js.undefined
  
  /**
    * The name of the vocabulary filter passed to Amazon Transcribe.
    */
  var VocabularyFilterName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the vocabulary passed to Amazon Transcribe.
    */
  var VocabularyName: js.UndefOr[String] = js.undefined
}
object EngineTranscribeSettings {
  
  inline def apply(LanguageCode: TranscribeLanguageCode): EngineTranscribeSettings = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineTranscribeSettings]
  }
  
  extension [Self <: EngineTranscribeSettings](x: Self) {
    
    inline def setContentIdentificationType(value: TranscribeContentIdentificationType): Self = StObject.set(x, "ContentIdentificationType", value.asInstanceOf[js.Any])
    
    inline def setContentIdentificationTypeUndefined: Self = StObject.set(x, "ContentIdentificationType", js.undefined)
    
    inline def setContentRedactionType(value: TranscribeContentRedactionType): Self = StObject.set(x, "ContentRedactionType", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionTypeUndefined: Self = StObject.set(x, "ContentRedactionType", js.undefined)
    
    inline def setEnablePartialResultsStabilization(value: Boolean): Self = StObject.set(x, "EnablePartialResultsStabilization", value.asInstanceOf[js.Any])
    
    inline def setEnablePartialResultsStabilizationUndefined: Self = StObject.set(x, "EnablePartialResultsStabilization", js.undefined)
    
    inline def setLanguageCode(value: TranscribeLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelName(value: TranscribeLanguageModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
    
    inline def setPartialResultsStability(value: TranscribePartialResultsStability): Self = StObject.set(x, "PartialResultsStability", value.asInstanceOf[js.Any])
    
    inline def setPartialResultsStabilityUndefined: Self = StObject.set(x, "PartialResultsStability", js.undefined)
    
    inline def setPiiEntityTypes(value: TranscribePiiEntityTypes): Self = StObject.set(x, "PiiEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setPiiEntityTypesUndefined: Self = StObject.set(x, "PiiEntityTypes", js.undefined)
    
    inline def setRegion(value: TranscribeRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setVocabularyFilterMethod(value: TranscribeVocabularyFilterMethod): Self = StObject.set(x, "VocabularyFilterMethod", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterMethodUndefined: Self = StObject.set(x, "VocabularyFilterMethod", js.undefined)
    
    inline def setVocabularyFilterName(value: String): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    inline def setVocabularyName(value: String): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
