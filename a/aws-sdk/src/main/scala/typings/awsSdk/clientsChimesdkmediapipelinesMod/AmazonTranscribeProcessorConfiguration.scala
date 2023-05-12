package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonTranscribeProcessorConfiguration extends StObject {
  
  /**
    * Labels all personally identifiable information (PII) identified in your transcript. Content identification is performed at the segment level; PII specified in PiiEntityTypes is flagged upon complete transcription of an audio segment. You can’t set ContentIdentificationType and ContentRedactionType in the same request. If you set both, your request returns a BadRequestException. For more information, see Redacting or identifying personally identifiable information in the Amazon Transcribe Developer Guide.
    */
  var ContentIdentificationType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Redacts all personally identifiable information (PII) identified in your transcript. Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete transcription of an audio segment. You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both, your request returns a BadRequestException. For more information, see Redacting or identifying personally identifiable information in the Amazon Transcribe Developer Guide.
    */
  var ContentRedactionType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in your output, but may impact accuracy. For more information, see Partial-result stabilization in the Amazon Transcribe Developer Guide.
    */
  var EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, TranscriptEvents with IsPartial: true are filtered out of the insights target.
    */
  var FilterPartialResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language code that represents the language spoken in your audio. If you're unsure of the language spoken in your audio, consider using IdentifyLanguage to enable automatic language identification. For a list of languages that real-time Call Analytics supports, see the Supported languages table in the Amazon Transcribe Developer Guide.
    */
  var LanguageCode: CallAnalyticsLanguageCode
  
  /**
    * The name of the custom language model that you want to use when processing your transcription. Note that language model names are case sensitive. The language of the specified language model must match the language code you specify in your transcription request. If the languages don't match, the custom language model isn't applied. There are no errors or warnings associated with a language mismatch. For more information, see Custom language models in the Amazon Transcribe Developer Guide.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.undefined
  
  /**
    * The level of stability to use when you enable partial results stabilization (EnablePartialResultsStabilization). Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy. For more information, see Partial-result stabilization in the Amazon Transcribe Developer Guide.
    */
  var PartialResultsStability: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PartialResultsStability] = js.undefined
  
  /**
    * The types of personally identifiable information (PII) to redact from a transcript. You can include as many types as you'd like, or you can select ALL. To include PiiEntityTypes in your Call Analytics request, you must also include ContentIdentificationType or ContentRedactionType, but you can't include both. Values must be comma-separated and can include: ADDRESS, BANK_ACCOUNT_NUMBER, BANK_ROUTING, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, CREDIT_DEBIT_NUMBER, EMAIL, NAME, PHONE, PIN, SSN, or ALL. If you leave this parameter empty, the default behavior is equivalent to ALL.
    */
  var PiiEntityTypes: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PiiEntityTypes] = js.undefined
  
  /**
    * Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the speech from individual speakers in your media file. For more information, see Partitioning speakers (diarization) in the Amazon Transcribe Developer Guide.
    */
  var ShowSpeakerLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The vocabulary filtering method used in your Call Analytics transcription.
    */
  var VocabularyFilterMethod: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.VocabularyFilterMethod] = js.undefined
  
  /**
    * The name of the custom vocabulary filter that you specified in your Call Analytics request. Length Constraints: Minimum length of 1. Maximum length of 200.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.VocabularyFilterName] = js.undefined
  
  /**
    * The name of the custom vocabulary that you specified in your Call Analytics request. Length Constraints: Minimum length of 1. Maximum length of 200.
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.VocabularyName] = js.undefined
}
object AmazonTranscribeProcessorConfiguration {
  
  inline def apply(LanguageCode: CallAnalyticsLanguageCode): AmazonTranscribeProcessorConfiguration = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonTranscribeProcessorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonTranscribeProcessorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContentIdentificationType(value: ContentType): Self = StObject.set(x, "ContentIdentificationType", value.asInstanceOf[js.Any])
    
    inline def setContentIdentificationTypeUndefined: Self = StObject.set(x, "ContentIdentificationType", js.undefined)
    
    inline def setContentRedactionType(value: ContentType): Self = StObject.set(x, "ContentRedactionType", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionTypeUndefined: Self = StObject.set(x, "ContentRedactionType", js.undefined)
    
    inline def setEnablePartialResultsStabilization(value: Boolean): Self = StObject.set(x, "EnablePartialResultsStabilization", value.asInstanceOf[js.Any])
    
    inline def setEnablePartialResultsStabilizationUndefined: Self = StObject.set(x, "EnablePartialResultsStabilization", js.undefined)
    
    inline def setFilterPartialResults(value: Boolean): Self = StObject.set(x, "FilterPartialResults", value.asInstanceOf[js.Any])
    
    inline def setFilterPartialResultsUndefined: Self = StObject.set(x, "FilterPartialResults", js.undefined)
    
    inline def setLanguageCode(value: CallAnalyticsLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelName(value: ModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
    
    inline def setPartialResultsStability(value: PartialResultsStability): Self = StObject.set(x, "PartialResultsStability", value.asInstanceOf[js.Any])
    
    inline def setPartialResultsStabilityUndefined: Self = StObject.set(x, "PartialResultsStability", js.undefined)
    
    inline def setPiiEntityTypes(value: PiiEntityTypes): Self = StObject.set(x, "PiiEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setPiiEntityTypesUndefined: Self = StObject.set(x, "PiiEntityTypes", js.undefined)
    
    inline def setShowSpeakerLabel(value: Boolean): Self = StObject.set(x, "ShowSpeakerLabel", value.asInstanceOf[js.Any])
    
    inline def setShowSpeakerLabelUndefined: Self = StObject.set(x, "ShowSpeakerLabel", js.undefined)
    
    inline def setVocabularyFilterMethod(value: VocabularyFilterMethod): Self = StObject.set(x, "VocabularyFilterMethod", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterMethodUndefined: Self = StObject.set(x, "VocabularyFilterMethod", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
