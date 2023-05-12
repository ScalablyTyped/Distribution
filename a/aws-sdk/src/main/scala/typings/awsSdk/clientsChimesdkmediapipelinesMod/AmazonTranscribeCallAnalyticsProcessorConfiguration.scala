package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonTranscribeCallAnalyticsProcessorConfiguration extends StObject {
  
  /**
    * By default, all CategoryEvents are sent to the insights target. If this parameter is specified, only included categories are sent to the insights target. 
    */
  var CallAnalyticsStreamCategories: js.UndefOr[CategoryNameList] = js.undefined
  
  /**
    * Labels all personally identifiable information (PII) identified in your transcript. Content identification is performed at the segment level; PII specified in PiiEntityTypes is flagged upon complete transcription of an audio segment. You can’t set ContentIdentificationType and ContentRedactionType in the same request. If you do, your request returns a BadRequestException. For more information, see Redacting or identifying personally identifiable information in the Amazon Transcribe Developer Guide.
    */
  var ContentIdentificationType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Redacts all personally identifiable information (PII) identified in your transcript. Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete transcription of an audio segment. You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you do, your request returns a BadRequestException. For more information, see Redacting or identifying personally identifiable information in the Amazon Transcribe Developer Guide.
    */
  var ContentRedactionType: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in your output, but may impact accuracy. For more information, see Partial-result stabilization in the Amazon Transcribe Developer Guide.
    */
  var EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, UtteranceEvents with IsPartial: true are filtered out of the insights target.
    */
  var FilterPartialResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language code in the configuration.
    */
  var LanguageCode: CallAnalyticsLanguageCode
  
  /**
    * Specifies the name of the custom language model to use when processing a transcription. Note that language model names are case sensitive. The language of the specified language model must match the language code specified in the transcription request. If the languages don't match, the custom language model isn't applied. Language mismatches don't generate errors or warnings. For more information, see Custom language models in the Amazon Transcribe Developer Guide.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.undefined
  
  /**
    * Specifies the level of stability to use when you enable partial results stabilization (EnablePartialResultsStabilization). Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy. For more information, see Partial-result stabilization in the Amazon Transcribe Developer Guide.
    */
  var PartialResultsStability: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PartialResultsStability] = js.undefined
  
  /**
    * Specifies the types of personally identifiable information (PII) to redact from a transcript. You can include as many types as you'd like, or you can select ALL. To include PiiEntityTypes in your Call Analytics request, you must also include ContentIdentificationType or ContentRedactionType, but you can't include both.  Values must be comma-separated and can include: ADDRESS, BANK_ACCOUNT_NUMBER, BANK_ROUTING, CREDIT_DEBIT_CVV, CREDIT_DEBIT_EXPIRY, CREDIT_DEBIT_NUMBER, EMAIL, NAME, PHONE, PIN, SSN, or ALL. Length Constraints: Minimum length of 1. Maximum length of 300.
    */
  var PiiEntityTypes: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PiiEntityTypes] = js.undefined
  
  /**
    * The settings for a post-call analysis task in an analytics configuration.
    */
  var PostCallAnalyticsSettings: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PostCallAnalyticsSettings] = js.undefined
  
  /**
    * Specifies how to apply a vocabulary filter to a transcript. To replace words with ***, choose mask. To delete words, choose remove. To flag words without changing them, choose tag. 
    */
  var VocabularyFilterMethod: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.VocabularyFilterMethod] = js.undefined
  
  /**
    * Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that vocabulary filter names are case sensitive. If the language of the specified custom vocabulary filter doesn't match the language identified in your media, the vocabulary filter is not applied to your transcription. For more information, see Using vocabulary filtering with unwanted words in the Amazon Transcribe Developer Guide. Length Constraints: Minimum length of 1. Maximum length of 200. 
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.VocabularyFilterName] = js.undefined
  
  /**
    * Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary names are case sensitive. If the language of the specified custom vocabulary doesn't match the language identified in your media, the custom vocabulary is not applied to your transcription. For more information, see Custom vocabularies in the Amazon Transcribe Developer Guide. Length Constraints: Minimum length of 1. Maximum length of 200. 
    */
  var VocabularyName: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.VocabularyName] = js.undefined
}
object AmazonTranscribeCallAnalyticsProcessorConfiguration {
  
  inline def apply(LanguageCode: CallAnalyticsLanguageCode): AmazonTranscribeCallAnalyticsProcessorConfiguration = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonTranscribeCallAnalyticsProcessorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonTranscribeCallAnalyticsProcessorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCallAnalyticsStreamCategories(value: CategoryNameList): Self = StObject.set(x, "CallAnalyticsStreamCategories", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsStreamCategoriesUndefined: Self = StObject.set(x, "CallAnalyticsStreamCategories", js.undefined)
    
    inline def setCallAnalyticsStreamCategoriesVarargs(value: CategoryName*): Self = StObject.set(x, "CallAnalyticsStreamCategories", js.Array(value*))
    
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
    
    inline def setPostCallAnalyticsSettings(value: PostCallAnalyticsSettings): Self = StObject.set(x, "PostCallAnalyticsSettings", value.asInstanceOf[js.Any])
    
    inline def setPostCallAnalyticsSettingsUndefined: Self = StObject.set(x, "PostCallAnalyticsSettings", js.undefined)
    
    inline def setVocabularyFilterMethod(value: VocabularyFilterMethod): Self = StObject.set(x, "VocabularyFilterMethod", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterMethodUndefined: Self = StObject.set(x, "VocabularyFilterMethod", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
