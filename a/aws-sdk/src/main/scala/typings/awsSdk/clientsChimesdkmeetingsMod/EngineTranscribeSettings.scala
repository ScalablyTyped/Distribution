package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineTranscribeSettings extends StObject {
  
  /**
    * Labels all personally identifiable information (PII) identified in your transcript. If you don't include PiiEntityTypes, all PII is identified.  You can’t set ContentIdentificationType and ContentRedactionType. 
    */
  var ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType] = js.undefined
  
  /**
    * Content redaction is performed at the segment level. If you don't include PiiEntityTypes, all PII is redacted.  You can’t set ContentRedactionType and ContentIdentificationType. 
    */
  var ContentRedactionType: js.UndefOr[TranscribeContentRedactionType] = js.undefined
  
  /**
    * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in your output, but may impact accuracy.
    */
  var EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables automatic language identification for your transcription. If you include IdentifyLanguage, you can optionally use LanguageOptions to include a list of language codes that you think may be present in your audio stream. Including language options can improve transcription accuracy. You can also use PreferredLanguage to include a preferred language. Doing so can help Amazon Transcribe identify the language faster. You must include either LanguageCode or IdentifyLanguage. Language identification can't be combined with custom language models or redaction.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the language code that represents the language spoken. If you're unsure of the language spoken in your audio, consider using IdentifyLanguage to enable automatic language identification.
    */
  var LanguageCode: js.UndefOr[TranscribeLanguageCode] = js.undefined
  
  /**
    * Specify the name of the custom language model that you want to use when processing your transcription. Note that language model names are case sensitive. The language of the specified language model must match the language code. If the languages don't match, the custom language model isn't applied. There are no errors or warnings associated with a language mismatch. If you use Amazon Transcribe in multiple Regions, the custom language model must be available in Amazon Transcribe in each Region.
    */
  var LanguageModelName: js.UndefOr[TranscribeLanguageModelName] = js.undefined
  
  /**
    * Specify two or more language codes that represent the languages you think may be present in your media; including more than five is not recommended. If you're unsure what languages are present, do not include this parameter. Including language options can improve the accuracy of language identification. If you include LanguageOptions, you must also include IdentifyLanguage.  You can only include one language dialect per language. For example, you cannot include en-US and en-AU. 
    */
  var LanguageOptions: js.UndefOr[TranscribeLanguageOptions] = js.undefined
  
  /**
    * Specify the level of stability to use when you enable partial results stabilization (EnablePartialResultsStabilization). Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy.
    */
  var PartialResultsStability: js.UndefOr[TranscribePartialResultsStability] = js.undefined
  
  /**
    * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can include as many types as you'd like, or you can select ALL. Values must be comma-separated and can include: ADDRESS, BANK_ACCOUNT_NUMBER, BANK_ROUTING, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY CREDIT_DEBIT_NUMBER, EMAIL,NAME, PHONE, PIN, SSN, or ALL. Note that if you include PiiEntityTypes, you must also include ContentIdentificationType or ContentRedactionType. If you include ContentRedactionType or ContentIdentificationType, but do not include PiiEntityTypes, all PII is redacted or identified.
    */
  var PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes] = js.undefined
  
  /**
    * Specify a preferred language from the subset of languages codes you specified in LanguageOptions. You can only use this parameter if you include IdentifyLanguage and LanguageOptions.
    */
  var PreferredLanguage: js.UndefOr[TranscribeLanguageCode] = js.undefined
  
  /**
    * The AWS Region in which to use Amazon Transcribe. If you don't specify a Region, then the MediaRegion of the meeting is used. However, if Amazon Transcribe is not available in the MediaRegion, then a TranscriptFailed event is sent. Use auto to use Amazon Transcribe in a Region near the meeting’s MediaRegion. For more information, refer to Choosing a transcription Region in the Amazon Chime SDK Developer Guide.
    */
  var Region: js.UndefOr[TranscribeRegion] = js.undefined
  
  /**
    * Specify how you want your vocabulary filter applied to your transcript. To replace words with ***, choose mask. To delete words, choose remove. To flag words without changing them, choose tag.
    */
  var VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod] = js.undefined
  
  /**
    * Specify the name of the custom vocabulary filter that you want to use when processing your transcription. Note that vocabulary filter names are case sensitive.  If you use Amazon Transcribe in multiple Regions, the vocabulary filter must be available in Amazon Transcribe in each Region. If you include IdentifyLanguage and want to use one or more vocabulary filters with your transcription, use the VocabularyFilterNames parameter instead.
    */
  var VocabularyFilterName: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the names of the custom vocabulary filters that you want to use when processing your transcription. Note that vocabulary filter names are case sensitive. If you use Amazon Transcribe in multiple Regions, the vocabulary filter must be available in Amazon Transcribe in each Region.  If you're not including IdentifyLanguage and want to use a custom vocabulary filter with your transcription, use the VocabularyFilterName parameter instead.
    */
  var VocabularyFilterNames: js.UndefOr[TranscribeVocabularyNamesOrFilterNamesString] = js.undefined
  
  /**
    * Specify the name of the custom vocabulary that you want to use when processing your transcription. Note that vocabulary names are case sensitive. If you use Amazon Transcribe multiple Regions, the vocabulary must be available in Amazon Transcribe in each Region. If you include IdentifyLanguage and want to use one or more custom vocabularies with your transcription, use the VocabularyNames parameter instead.
    */
  var VocabularyName: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the names of the custom vocabularies that you want to use when processing your transcription. Note that vocabulary names are case sensitive. If you use Amazon Transcribe in multiple Regions, the vocabulary must be available in Amazon Transcribe in each Region. If you don't include IdentifyLanguage and want to use a custom vocabulary with your transcription, use the VocabularyName parameter instead.
    */
  var VocabularyNames: js.UndefOr[TranscribeVocabularyNamesOrFilterNamesString] = js.undefined
}
object EngineTranscribeSettings {
  
  inline def apply(): EngineTranscribeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineTranscribeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineTranscribeSettings] (val x: Self) extends AnyVal {
    
    inline def setContentIdentificationType(value: TranscribeContentIdentificationType): Self = StObject.set(x, "ContentIdentificationType", value.asInstanceOf[js.Any])
    
    inline def setContentIdentificationTypeUndefined: Self = StObject.set(x, "ContentIdentificationType", js.undefined)
    
    inline def setContentRedactionType(value: TranscribeContentRedactionType): Self = StObject.set(x, "ContentRedactionType", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionTypeUndefined: Self = StObject.set(x, "ContentRedactionType", js.undefined)
    
    inline def setEnablePartialResultsStabilization(value: Boolean): Self = StObject.set(x, "EnablePartialResultsStabilization", value.asInstanceOf[js.Any])
    
    inline def setEnablePartialResultsStabilizationUndefined: Self = StObject.set(x, "EnablePartialResultsStabilization", js.undefined)
    
    inline def setIdentifyLanguage(value: Boolean): Self = StObject.set(x, "IdentifyLanguage", value.asInstanceOf[js.Any])
    
    inline def setIdentifyLanguageUndefined: Self = StObject.set(x, "IdentifyLanguage", js.undefined)
    
    inline def setLanguageCode(value: TranscribeLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageModelName(value: TranscribeLanguageModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
    
    inline def setLanguageOptions(value: TranscribeLanguageOptions): Self = StObject.set(x, "LanguageOptions", value.asInstanceOf[js.Any])
    
    inline def setLanguageOptionsUndefined: Self = StObject.set(x, "LanguageOptions", js.undefined)
    
    inline def setPartialResultsStability(value: TranscribePartialResultsStability): Self = StObject.set(x, "PartialResultsStability", value.asInstanceOf[js.Any])
    
    inline def setPartialResultsStabilityUndefined: Self = StObject.set(x, "PartialResultsStability", js.undefined)
    
    inline def setPiiEntityTypes(value: TranscribePiiEntityTypes): Self = StObject.set(x, "PiiEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setPiiEntityTypesUndefined: Self = StObject.set(x, "PiiEntityTypes", js.undefined)
    
    inline def setPreferredLanguage(value: TranscribeLanguageCode): Self = StObject.set(x, "PreferredLanguage", value.asInstanceOf[js.Any])
    
    inline def setPreferredLanguageUndefined: Self = StObject.set(x, "PreferredLanguage", js.undefined)
    
    inline def setRegion(value: TranscribeRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setVocabularyFilterMethod(value: TranscribeVocabularyFilterMethod): Self = StObject.set(x, "VocabularyFilterMethod", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterMethodUndefined: Self = StObject.set(x, "VocabularyFilterMethod", js.undefined)
    
    inline def setVocabularyFilterName(value: String): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    inline def setVocabularyFilterNames(value: TranscribeVocabularyNamesOrFilterNamesString): Self = StObject.set(x, "VocabularyFilterNames", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNamesUndefined: Self = StObject.set(x, "VocabularyFilterNames", js.undefined)
    
    inline def setVocabularyName(value: String): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
    
    inline def setVocabularyNames(value: TranscribeVocabularyNamesOrFilterNamesString): Self = StObject.set(x, "VocabularyNames", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNamesUndefined: Self = StObject.set(x, "VocabularyNames", js.undefined)
  }
}
