package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsComprehendMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AnyLengthString = java.lang.String
  type BatchItemErrorList = js.Array[BatchItemError]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendArn = java.lang.String
  type ComprehendArnName = java.lang.String
  type ComprehendEndpointArn = java.lang.String
  type ComprehendEndpointName = java.lang.String
  type ComprehendModelArn = java.lang.String
  type DocumentClassificationJobPropertiesList = js.Array[DocumentClassificationJobProperties]
  type DocumentClassifierArn = java.lang.String
  type DocumentClassifierEndpointArn = java.lang.String
  type DocumentClassifierPropertiesList = js.Array[DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type Double = scala.Double
  type EndpointPropertiesList = js.Array[EndpointProperties]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.IN_SERVICE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | java.lang.String
  type EntitiesDetectionJobPropertiesList = js.Array[EntitiesDetectionJobProperties]
  type EntityRecognizerArn = java.lang.String
  type EntityRecognizerMetadataEntityTypesList = js.Array[EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList = js.Array[EntityRecognizerProperties]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PERSON
    - typings.awsDashSdk.awsDashSdkStrings.LOCATION
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION
    - typings.awsDashSdk.awsDashSdkStrings.COMMERCIAL_ITEM
    - typings.awsDashSdk.awsDashSdkStrings.EVENT
    - typings.awsDashSdk.awsDashSdkStrings.DATE
    - typings.awsDashSdk.awsDashSdkStrings.QUANTITY
    - typings.awsDashSdk.awsDashSdkStrings.TITLE
    - typings.awsDashSdk.awsDashSdkStrings.OTHER
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EntityTypeName = java.lang.String
  type EntityTypesList = js.Array[EntityTypesListItem]
  type Float = scala.Double
  type IamRoleArn = java.lang.String
  type InferenceUnitsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ONE_DOC_PER_FILE
    - typings.awsDashSdk.awsDashSdkStrings.ONE_DOC_PER_LINE
    - java.lang.String
  */
  type InputFormat = _InputFormat | java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STOP_REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[KeyPhrasesDetectionJobProperties]
  type KmsKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.en
    - typings.awsDashSdk.awsDashSdkStrings.es_
    - typings.awsDashSdk.awsDashSdkStrings.fr_
    - typings.awsDashSdk.awsDashSdkStrings.de_
    - typings.awsDashSdk.awsDashSdkStrings.it_
    - typings.awsDashSdk.awsDashSdkStrings.pt_
    - typings.awsDashSdk.awsDashSdkStrings.ar_
    - typings.awsDashSdk.awsDashSdkStrings.hi
    - typings.awsDashSdk.awsDashSdkStrings.ja
    - typings.awsDashSdk.awsDashSdkStrings.ko
    - typings.awsDashSdk.awsDashSdkStrings.zh
    - typings.awsDashSdk.awsDashSdkStrings.`zh-TW`
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | java.lang.String
  type ListOfClasses = js.Array[DocumentClass]
  type ListOfDetectDominantLanguageResult = js.Array[BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult = js.Array[BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult = js.Array[BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult = js.Array[BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult = js.Array[BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages = js.Array[DominantLanguage]
  type ListOfEntities = js.Array[Entity]
  type ListOfKeyPhrases = js.Array[KeyPhrase]
  type ListOfSyntaxTokens = js.Array[SyntaxToken]
  type MaxResultsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.TRAINING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.STOP_REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.IN_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.TRAINED
    - java.lang.String
  */
  type ModelStatus = _ModelStatus | java.lang.String
  type NumberOfTopicsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADJ
    - typings.awsDashSdk.awsDashSdkStrings.ADP
    - typings.awsDashSdk.awsDashSdkStrings.ADV
    - typings.awsDashSdk.awsDashSdkStrings.AUX
    - typings.awsDashSdk.awsDashSdkStrings.CONJ
    - typings.awsDashSdk.awsDashSdkStrings.CCONJ
    - typings.awsDashSdk.awsDashSdkStrings.DET
    - typings.awsDashSdk.awsDashSdkStrings.INTJ
    - typings.awsDashSdk.awsDashSdkStrings.NOUN
    - typings.awsDashSdk.awsDashSdkStrings.NUM
    - typings.awsDashSdk.awsDashSdkStrings.O
    - typings.awsDashSdk.awsDashSdkStrings.PART
    - typings.awsDashSdk.awsDashSdkStrings.PRON
    - typings.awsDashSdk.awsDashSdkStrings.PROPN
    - typings.awsDashSdk.awsDashSdkStrings.PUNCT
    - typings.awsDashSdk.awsDashSdkStrings.SCONJ
    - typings.awsDashSdk.awsDashSdkStrings.SYM
    - typings.awsDashSdk.awsDashSdkStrings.VERB
    - java.lang.String
  */
  type PartOfSpeechTagType = _PartOfSpeechTagType | java.lang.String
  type S3Uri = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SentimentDetectionJobPropertiesList = js.Array[SentimentDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.POSITIVE
    - typings.awsDashSdk.awsDashSdkStrings.NEGATIVE
    - typings.awsDashSdk.awsDashSdkStrings.NEUTRAL
    - typings.awsDashSdk.awsDashSdkStrings.MIXED
    - java.lang.String
  */
  type SentimentType = _SentimentType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.en
    - typings.awsDashSdk.awsDashSdkStrings.es_
    - typings.awsDashSdk.awsDashSdkStrings.fr_
    - typings.awsDashSdk.awsDashSdkStrings.de_
    - typings.awsDashSdk.awsDashSdkStrings.it_
    - typings.awsDashSdk.awsDashSdkStrings.pt_
    - java.lang.String
  */
  type SyntaxLanguageCode = _SyntaxLanguageCode | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = Date
  type TopicsDetectionJobPropertiesList = js.Array[TopicsDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
