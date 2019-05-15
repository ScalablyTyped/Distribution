package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsComprehendMod {
  type AnyLengthString = java.lang.String
  type BatchItemErrorList = js.Array[BatchItemError]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendArn = java.lang.String
  type ComprehendArnName = java.lang.String
  type DocumentClassificationJobPropertiesList = js.Array[DocumentClassificationJobProperties]
  type DocumentClassifierArn = java.lang.String
  type DocumentClassifierPropertiesList = js.Array[DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]
  type Double = scala.Double
  type EntitiesDetectionJobPropertiesList = js.Array[EntitiesDetectionJobProperties]
  type EntityRecognizerArn = java.lang.String
  type EntityRecognizerMetadataEntityTypesList = js.Array[EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList = js.Array[EntityRecognizerProperties]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PERSON
    - awsDashSdkLib.awsDashSdkLibStrings.LOCATION
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.COMMERCIAL_ITEM
    - awsDashSdkLib.awsDashSdkLibStrings.EVENT
    - awsDashSdkLib.awsDashSdkLibStrings.DATE
    - awsDashSdkLib.awsDashSdkLibStrings.QUANTITY
    - awsDashSdkLib.awsDashSdkLibStrings.TITLE
    - awsDashSdkLib.awsDashSdkLibStrings.OTHER
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EntityTypeName = java.lang.String
  type EntityTypesList = js.Array[EntityTypesListItem]
  type Float = scala.Double
  type IamRoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_DOC_PER_FILE
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_DOC_PER_LINE
    - java.lang.String
  */
  type InputFormat = _InputFormat | java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_REQUESTED
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[KeyPhrasesDetectionJobProperties]
  type KmsKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.en
    - awsDashSdkLib.awsDashSdkLibStrings.es
    - awsDashSdkLib.awsDashSdkLibStrings.fr
    - awsDashSdkLib.awsDashSdkLibStrings.de
    - awsDashSdkLib.awsDashSdkLibStrings.it
    - awsDashSdkLib.awsDashSdkLibStrings.pt
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | java.lang.String
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
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.TRAINING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_REQUESTED
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.TRAINED
    - java.lang.String
  */
  type ModelStatus = _ModelStatus | java.lang.String
  type NumberOfTopicsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADJ
    - awsDashSdkLib.awsDashSdkLibStrings.ADP
    - awsDashSdkLib.awsDashSdkLibStrings.ADV
    - awsDashSdkLib.awsDashSdkLibStrings.AUX
    - awsDashSdkLib.awsDashSdkLibStrings.CONJ
    - awsDashSdkLib.awsDashSdkLibStrings.CCONJ
    - awsDashSdkLib.awsDashSdkLibStrings.DET
    - awsDashSdkLib.awsDashSdkLibStrings.INTJ
    - awsDashSdkLib.awsDashSdkLibStrings.NOUN
    - awsDashSdkLib.awsDashSdkLibStrings.NUM
    - awsDashSdkLib.awsDashSdkLibStrings.O
    - awsDashSdkLib.awsDashSdkLibStrings.PART
    - awsDashSdkLib.awsDashSdkLibStrings.PRON
    - awsDashSdkLib.awsDashSdkLibStrings.PROPN
    - awsDashSdkLib.awsDashSdkLibStrings.PUNCT
    - awsDashSdkLib.awsDashSdkLibStrings.SCONJ
    - awsDashSdkLib.awsDashSdkLibStrings.SYM
    - awsDashSdkLib.awsDashSdkLibStrings.VERB
    - java.lang.String
  */
  type PartOfSpeechTagType = _PartOfSpeechTagType | java.lang.String
  type S3Uri = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SentimentDetectionJobPropertiesList = js.Array[SentimentDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.POSITIVE
    - awsDashSdkLib.awsDashSdkLibStrings.NEGATIVE
    - awsDashSdkLib.awsDashSdkLibStrings.NEUTRAL
    - awsDashSdkLib.awsDashSdkLibStrings.MIXED
    - java.lang.String
  */
  type SentimentType = _SentimentType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.en
    - awsDashSdkLib.awsDashSdkLibStrings.es
    - awsDashSdkLib.awsDashSdkLibStrings.fr
    - awsDashSdkLib.awsDashSdkLibStrings.de
    - awsDashSdkLib.awsDashSdkLibStrings.it
    - awsDashSdkLib.awsDashSdkLibStrings.pt
    - java.lang.String
  */
  type SyntaxLanguageCode = _SyntaxLanguageCode | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type TopicsDetectionJobPropertiesList = js.Array[TopicsDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
