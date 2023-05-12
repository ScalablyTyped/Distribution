package typings.awsSdk.clientsComprehendMod

import typings.awsSdk.awsSdkStrings.CHILD
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyLengthString = java.lang.String

type AttributeNamesList = js.Array[AttributeNamesListItem]

type AttributeNamesListItem = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PLAIN_TEXT_DOCUMENT
  - typings.awsSdk.awsSdkStrings.SEMI_STRUCTURED_DOCUMENT
  - java.lang.String
*/
type AugmentedManifestsDocumentTypeFormat = _AugmentedManifestsDocumentTypeFormat | java.lang.String

type BatchItemErrorList = js.Array[BatchItemError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINE
  - typings.awsSdk.awsSdkStrings.WORD
  - java.lang.String
*/
type BlockType = _BlockType | java.lang.String

type ClientRequestTokenString = java.lang.String

type ComprehendArn = java.lang.String

type ComprehendArnName = java.lang.String

type ComprehendDatasetArn = java.lang.String

type ComprehendEndpointArn = java.lang.String

type ComprehendEndpointName = java.lang.String

type ComprehendFlywheelArn = java.lang.String

type ComprehendModelArn = java.lang.String

type CustomerInputString = java.lang.String

type CustomerInputStringList = js.Array[CustomerInputString]

type DatasetAugmentedManifestsList = js.Array[DatasetAugmentedManifestsListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPREHEND_CSV
  - typings.awsSdk.awsSdkStrings.AUGMENTED_MANIFEST
  - java.lang.String
*/
type DatasetDataFormat = _DatasetDataFormat | java.lang.String

type DatasetPropertiesList = js.Array[DatasetProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DatasetStatus = _DatasetStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRAIN
  - typings.awsSdk.awsSdkStrings.TEST
  - java.lang.String
*/
type DatasetType = _DatasetType | java.lang.String

type Description = java.lang.String

type DocumentClassificationJobPropertiesList = js.Array[DocumentClassificationJobProperties]

type DocumentClassifierArn = java.lang.String

type DocumentClassifierAugmentedManifestsList = js.Array[AugmentedManifestsListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPREHEND_CSV
  - typings.awsSdk.awsSdkStrings.AUGMENTED_MANIFEST
  - java.lang.String
*/
type DocumentClassifierDataFormat = _DocumentClassifierDataFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PLAIN_TEXT_DOCUMENT
  - typings.awsSdk.awsSdkStrings.SEMI_STRUCTURED_DOCUMENT
  - java.lang.String
*/
type DocumentClassifierDocumentTypeFormat = _DocumentClassifierDocumentTypeFormat | java.lang.String

type DocumentClassifierEndpointArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_CLASS
  - typings.awsSdk.awsSdkStrings.MULTI_LABEL
  - java.lang.String
*/
type DocumentClassifierMode = _DocumentClassifierMode | java.lang.String

type DocumentClassifierPropertiesList = js.Array[DocumentClassifierProperties]

type DocumentClassifierSummariesList = js.Array[DocumentClassifierSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEXTRACT_DETECT_DOCUMENT_TEXT
  - typings.awsSdk.awsSdkStrings.TEXTRACT_ANALYZE_DOCUMENT
  - java.lang.String
*/
type DocumentReadAction = _DocumentReadAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TABLES
  - typings.awsSdk.awsSdkStrings.FORMS
  - java.lang.String
*/
type DocumentReadFeatureTypes = _DocumentReadFeatureTypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVICE_DEFAULT
  - typings.awsSdk.awsSdkStrings.FORCE_DOCUMENT_READ_ACTION
  - java.lang.String
*/
type DocumentReadMode = _DocumentReadMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NATIVE_PDF
  - typings.awsSdk.awsSdkStrings.SCANNED_PDF
  - typings.awsSdk.awsSdkStrings.MS_WORD
  - typings.awsSdk.awsSdkStrings.IMAGE
  - typings.awsSdk.awsSdkStrings.PLAIN_TEXT
  - typings.awsSdk.awsSdkStrings.TEXTRACT_DETECT_DOCUMENT_TEXT_JSON
  - typings.awsSdk.awsSdkStrings.TEXTRACT_ANALYZE_DOCUMENT_JSON
  - java.lang.String
*/
type DocumentType = _DocumentType | java.lang.String

type DominantLanguageDetectionJobPropertiesList = js.Array[DominantLanguageDetectionJobProperties]

type Double = scala.Double

type EndpointPropertiesList = js.Array[EndpointProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IN_SERVICE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type EndpointStatus = _EndpointStatus | java.lang.String

type EntitiesDetectionJobPropertiesList = js.Array[EntitiesDetectionJobProperties]

type EntityRecognizerArn = java.lang.String

type EntityRecognizerAugmentedManifestsList = js.Array[AugmentedManifestsListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPREHEND_CSV
  - typings.awsSdk.awsSdkStrings.AUGMENTED_MANIFEST
  - java.lang.String
*/
type EntityRecognizerDataFormat = _EntityRecognizerDataFormat | java.lang.String

type EntityRecognizerEndpointArn = java.lang.String

type EntityRecognizerMetadataEntityTypesList = js.Array[EntityRecognizerMetadataEntityTypesListItem]

type EntityRecognizerPropertiesList = js.Array[EntityRecognizerProperties]

type EntityRecognizerSummariesList = js.Array[EntityRecognizerSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSON
  - typings.awsSdk.awsSdkStrings.LOCATION
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - typings.awsSdk.awsSdkStrings.COMMERCIAL_ITEM
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.QUANTITY
  - typings.awsSdk.awsSdkStrings.TITLE
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

type EntityTypeName = java.lang.String

type EntityTypesList = js.Array[EntityTypesListItem]

type EventTypeString = java.lang.String

type EventsDetectionJobPropertiesList = js.Array[EventsDetectionJobProperties]

type Float = scala.Double

type FlywheelIterationId = java.lang.String

type FlywheelIterationPropertiesList = js.Array[FlywheelIterationProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRAINING
  - typings.awsSdk.awsSdkStrings.EVALUATING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type FlywheelIterationStatus = _FlywheelIterationStatus | java.lang.String

type FlywheelS3Uri = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type FlywheelStatus = _FlywheelStatus | java.lang.String

type FlywheelSummaryList = js.Array[FlywheelSummary]

type IamRoleArn = java.lang.String

type InferenceUnitsInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONE_DOC_PER_FILE
  - typings.awsSdk.awsSdkStrings.ONE_DOC_PER_LINE
  - java.lang.String
*/
type InputFormat = _InputFormat | java.lang.String

type Integer = scala.Double

type JobId = java.lang.String

type JobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type KeyPhrasesDetectionJobPropertiesList = js.Array[KeyPhrasesDetectionJobProperties]

type KmsKeyId = java.lang.String

type LabelDelimiter = java.lang.String

type LabelListItem = java.lang.String

type LabelsList = js.Array[LabelListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.en_
  - typings.awsSdk.awsSdkStrings.es_
  - typings.awsSdk.awsSdkStrings.fr_
  - typings.awsSdk.awsSdkStrings.de_
  - typings.awsSdk.awsSdkStrings.it_
  - typings.awsSdk.awsSdkStrings.pt_
  - typings.awsSdk.awsSdkStrings.ar_
  - typings.awsSdk.awsSdkStrings.hi_
  - typings.awsSdk.awsSdkStrings.ja_
  - typings.awsSdk.awsSdkStrings.ko_
  - typings.awsSdk.awsSdkStrings.zh_
  - typings.awsSdk.awsSdkStrings.`zh-TW`
  - java.lang.String
*/
type LanguageCode = _LanguageCode | java.lang.String

type ListOfBlockReferences = js.Array[BlockReference]

type ListOfBlocks = js.Array[Block]

type ListOfChildBlocks = js.Array[ChildBlock]

type ListOfClasses = js.Array[DocumentClass]

type ListOfDescriptiveMentionIndices = js.Array[Integer]

type ListOfDetectDominantLanguageResult = js.Array[BatchDetectDominantLanguageItemResult]

type ListOfDetectEntitiesResult = js.Array[BatchDetectEntitiesItemResult]

type ListOfDetectKeyPhrasesResult = js.Array[BatchDetectKeyPhrasesItemResult]

type ListOfDetectSentimentResult = js.Array[BatchDetectSentimentItemResult]

type ListOfDetectSyntaxResult = js.Array[BatchDetectSyntaxItemResult]

type ListOfDetectTargetedSentimentResult = js.Array[BatchDetectTargetedSentimentItemResult]

type ListOfDocumentReadFeatureTypes = js.Array[DocumentReadFeatureTypes]

type ListOfDocumentType = js.Array[DocumentTypeListItem]

type ListOfDominantLanguages = js.Array[DominantLanguage]

type ListOfEntities = js.Array[Entity]

type ListOfEntityLabels = js.Array[EntityLabel]

type ListOfErrors = js.Array[ErrorsListItem]

type ListOfExtractedCharacters = js.Array[ExtractedCharactersListItem]

type ListOfKeyPhrases = js.Array[KeyPhrase]

type ListOfLabels = js.Array[DocumentLabel]

type ListOfMentions = js.Array[TargetedSentimentMention]

type ListOfPiiEntities = js.Array[PiiEntity]

type ListOfPiiEntityTypes = js.Array[PiiEntityType]

type ListOfRelationships = js.Array[RelationshipsListItem]

type ListOfSyntaxTokens = js.Array[SyntaxToken]

type ListOfTargetedSentimentEntities = js.Array[TargetedSentimentEntity]

type ListOfWarnings = js.Array[WarningsListItem]

type MaskCharacter = java.lang.String

type MaxResultsInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.TRAINING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.IN_ERROR
  - typings.awsSdk.awsSdkStrings.TRAINED
  - typings.awsSdk.awsSdkStrings.TRAINED_WITH_WARNING
  - java.lang.String
*/
type ModelStatus = _ModelStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOCUMENT_CLASSIFIER
  - typings.awsSdk.awsSdkStrings.ENTITY_RECOGNIZER
  - java.lang.String
*/
type ModelType = _ModelType | java.lang.String

type NumberOfDocuments = scala.Double

type NumberOfTopicsInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEXTRACT_BAD_PAGE
  - typings.awsSdk.awsSdkStrings.TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.PAGE_CHARACTERS_EXCEEDED
  - typings.awsSdk.awsSdkStrings.PAGE_SIZE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type PageBasedErrorCode = _PageBasedErrorCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL
  - typings.awsSdk.awsSdkStrings.INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
  - java.lang.String
*/
type PageBasedWarningCode = _PageBasedWarningCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADJ
  - typings.awsSdk.awsSdkStrings.ADP
  - typings.awsSdk.awsSdkStrings.ADV
  - typings.awsSdk.awsSdkStrings.AUX
  - typings.awsSdk.awsSdkStrings.CONJ
  - typings.awsSdk.awsSdkStrings.CCONJ
  - typings.awsSdk.awsSdkStrings.DET
  - typings.awsSdk.awsSdkStrings.INTJ
  - typings.awsSdk.awsSdkStrings.NOUN
  - typings.awsSdk.awsSdkStrings.NUM
  - typings.awsSdk.awsSdkStrings.O
  - typings.awsSdk.awsSdkStrings.PART
  - typings.awsSdk.awsSdkStrings.PRON
  - typings.awsSdk.awsSdkStrings.PROPN
  - typings.awsSdk.awsSdkStrings.PUNCT
  - typings.awsSdk.awsSdkStrings.SCONJ
  - typings.awsSdk.awsSdkStrings.SYM
  - typings.awsSdk.awsSdkStrings.VERB
  - java.lang.String
*/
type PartOfSpeechTagType = _PartOfSpeechTagType | java.lang.String

type PiiEntitiesDetectionJobPropertiesList = js.Array[PiiEntitiesDetectionJobProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASK
  - typings.awsSdk.awsSdkStrings.REPLACE_WITH_PII_ENTITY_TYPE
  - java.lang.String
*/
type PiiEntitiesDetectionMaskMode = _PiiEntitiesDetectionMaskMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONLY_REDACTION
  - typings.awsSdk.awsSdkStrings.ONLY_OFFSETS
  - java.lang.String
*/
type PiiEntitiesDetectionMode = _PiiEntitiesDetectionMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BANK_ACCOUNT_NUMBER
  - typings.awsSdk.awsSdkStrings.BANK_ROUTING
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_NUMBER
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_CVV
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_EXPIRY
  - typings.awsSdk.awsSdkStrings.PIN
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.ADDRESS
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.PHONE
  - typings.awsSdk.awsSdkStrings.SSN
  - typings.awsSdk.awsSdkStrings.DATE_TIME
  - typings.awsSdk.awsSdkStrings.PASSPORT_NUMBER
  - typings.awsSdk.awsSdkStrings.DRIVER_ID
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.AGE
  - typings.awsSdk.awsSdkStrings.USERNAME
  - typings.awsSdk.awsSdkStrings.PASSWORD
  - typings.awsSdk.awsSdkStrings.AWS_ACCESS_KEY
  - typings.awsSdk.awsSdkStrings.AWS_SECRET_KEY
  - typings.awsSdk.awsSdkStrings.IP_ADDRESS
  - typings.awsSdk.awsSdkStrings.MAC_ADDRESS
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.LICENSE_PLATE
  - typings.awsSdk.awsSdkStrings.VEHICLE_IDENTIFICATION_NUMBER
  - typings.awsSdk.awsSdkStrings.UK_NATIONAL_INSURANCE_NUMBER
  - typings.awsSdk.awsSdkStrings.CA_SOCIAL_INSURANCE_NUMBER
  - typings.awsSdk.awsSdkStrings.US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER
  - typings.awsSdk.awsSdkStrings.UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER
  - typings.awsSdk.awsSdkStrings.IN_PERMANENT_ACCOUNT_NUMBER
  - typings.awsSdk.awsSdkStrings.IN_NREGA
  - typings.awsSdk.awsSdkStrings.INTERNATIONAL_BANK_ACCOUNT_NUMBER
  - typings.awsSdk.awsSdkStrings.SWIFT_CODE
  - typings.awsSdk.awsSdkStrings.UK_NATIONAL_HEALTH_SERVICE_NUMBER
  - typings.awsSdk.awsSdkStrings.CA_HEALTH_NUMBER
  - typings.awsSdk.awsSdkStrings.IN_AADHAAR
  - typings.awsSdk.awsSdkStrings.IN_VOTER_NUMBER
  - java.lang.String
*/
type PiiEntityType = _PiiEntityType | java.lang.String

type Policy = java.lang.String

type PolicyRevisionId = java.lang.String

type Polygon = js.Array[Point]

type RelationshipType = CHILD | java.lang.String

type S3Uri = java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SemiStructuredDocumentBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type SentimentDetectionJobPropertiesList = js.Array[SentimentDetectionJobProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POSITIVE
  - typings.awsSdk.awsSdkStrings.NEGATIVE
  - typings.awsSdk.awsSdkStrings.NEUTRAL
  - typings.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type SentimentType = _SentimentType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRAIN
  - typings.awsSdk.awsSdkStrings.TEST
  - java.lang.String
*/
type Split = _Split | java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SubnetId = java.lang.String

type Subnets = js.Array[SubnetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.en_
  - typings.awsSdk.awsSdkStrings.es_
  - typings.awsSdk.awsSdkStrings.fr_
  - typings.awsSdk.awsSdkStrings.de_
  - typings.awsSdk.awsSdkStrings.it_
  - typings.awsSdk.awsSdkStrings.pt_
  - java.lang.String
*/
type SyntaxLanguageCode = _SyntaxLanguageCode | java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetEventTypes = js.Array[EventTypeString]

type TargetedSentimentDetectionJobPropertiesList = js.Array[TargetedSentimentDetectionJobProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSON
  - typings.awsSdk.awsSdkStrings.LOCATION
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - typings.awsSdk.awsSdkStrings.FACILITY
  - typings.awsSdk.awsSdkStrings.BRAND
  - typings.awsSdk.awsSdkStrings.COMMERCIAL_ITEM
  - typings.awsSdk.awsSdkStrings.MOVIE
  - typings.awsSdk.awsSdkStrings.MUSIC
  - typings.awsSdk.awsSdkStrings.BOOK
  - typings.awsSdk.awsSdkStrings.SOFTWARE
  - typings.awsSdk.awsSdkStrings.GAME
  - typings.awsSdk.awsSdkStrings.PERSONAL_TITLE
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.QUANTITY
  - typings.awsSdk.awsSdkStrings.ATTRIBUTE
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type TargetedSentimentEntityType = _TargetedSentimentEntityType | java.lang.String

type Timestamp = js.Date

type TopicsDetectionJobPropertiesList = js.Array[TopicsDetectionJobProperties]

type VersionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-11-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
