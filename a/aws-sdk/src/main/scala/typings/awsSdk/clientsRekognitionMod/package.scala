package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Assets = js.Array[Asset]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type Attribute = _Attribute | java.lang.String

type Attributes = js.Array[Attribute]

type AudioMetadataList = js.Array[AudioMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FACE
  - typings.awsSdk.awsSdkStrings.HEAD
  - typings.awsSdk.awsSdkStrings.LEFT_HAND
  - typings.awsSdk.awsSdkStrings.RIGHT_HAND
  - java.lang.String
*/
type BodyPart = _BodyPart | java.lang.String

type BodyParts = js.Array[ProtectiveEquipmentBodyPart]

type Boolean = scala.Boolean

type BoundingBoxHeight = Double

type BoundingBoxWidth = Double

type CelebrityList = js.Array[Celebrity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ID
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type CelebrityRecognitionSortBy = _CelebrityRecognitionSortBy | java.lang.String

type CelebrityRecognitions = js.Array[CelebrityRecognition]

type ClientRequestToken = java.lang.String

type CollectionId = java.lang.String

type CollectionIdList = js.Array[CollectionId]

type CompareFacesMatchList = js.Array[CompareFacesMatch]

type CompareFacesUnmatchList = js.Array[ComparedFace]

type ComparedFaceList = js.Array[ComparedFace]

type ConnectedHomeLabel = java.lang.String

type ConnectedHomeLabels = js.Array[ConnectedHomeLabel]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
  - typings.awsSdk.awsSdkStrings.FreeOfAdultContent
  - java.lang.String
*/
type ContentClassifier = _ContentClassifier | java.lang.String

type ContentClassifiers = js.Array[ContentClassifier]

type ContentModerationDetections = js.Array[ContentModerationDetection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type ContentModerationSortBy = _ContentModerationSortBy | java.lang.String

type CustomLabels = js.Array[CustomLabel]

type DatasetArn = java.lang.String

type DatasetEntries = js.Array[DatasetEntry]

type DatasetEntry = java.lang.String

type DatasetLabel = java.lang.String

type DatasetLabelDescriptions = js.Array[DatasetLabelDescription]

type DatasetLabels = js.Array[DatasetLabel]

type DatasetMetadataList = js.Array[DatasetMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - java.lang.String
*/
type DatasetStatus = _DatasetStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.SERVICE_ERROR
  - typings.awsSdk.awsSdkStrings.CLIENT_ERROR
  - java.lang.String
*/
type DatasetStatusMessageCode = _DatasetStatusMessageCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRAIN
  - typings.awsSdk.awsSdkStrings.TEST
  - java.lang.String
*/
type DatasetType = _DatasetType | java.lang.String

type DateTime = js.Date

type Degree = Double

type DistributeDatasetMetadataList = js.Array[DistributeDataset]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HAPPY
  - typings.awsSdk.awsSdkStrings.SAD
  - typings.awsSdk.awsSdkStrings.ANGRY
  - typings.awsSdk.awsSdkStrings.CONFUSED
  - typings.awsSdk.awsSdkStrings.DISGUSTED
  - typings.awsSdk.awsSdkStrings.SURPRISED
  - typings.awsSdk.awsSdkStrings.CALM
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.FEAR
  - java.lang.String
*/
type EmotionName = _EmotionName | java.lang.String

type Emotions = js.Array[Emotion]

type EquipmentDetections = js.Array[EquipmentDetection]

type ExtendedPaginationToken = java.lang.String

type ExternalImageId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type FaceAttributes = _FaceAttributes | java.lang.String

type FaceDetailList = js.Array[FaceDetail]

type FaceDetections = js.Array[FaceDetection]

type FaceId = java.lang.String

type FaceIdList = js.Array[FaceId]

type FaceList = js.Array[Face]

type FaceMatchList = js.Array[FaceMatch]

type FaceModelVersionList = js.Array[String]

type FaceRecordList = js.Array[FaceRecord]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INDEX
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type FaceSearchSortBy = _FaceSearchSortBy | java.lang.String

type Float = Double

type FlowDefinitionArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Male_
  - typings.awsSdk.awsSdkStrings.Female_
  - java.lang.String
*/
type GenderType = _GenderType | java.lang.String

type GroundTruthBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type HasErrors = scala.Boolean

type HumanLoopActivationConditionsEvaluationResults = java.lang.String

type HumanLoopActivationReason = java.lang.String

type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]

type HumanLoopArn = java.lang.String

type HumanLoopName = java.lang.String

type ImageBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type ImageId = java.lang.String

type IndexFacesModelVersion = java.lang.String

type InferenceUnits = Double

type Instances = js.Array[Instance]

type IsLabeled = scala.Boolean

type JobId = java.lang.String

type JobTag = java.lang.String

type KinesisDataArn = java.lang.String

type KinesisVideoArn = java.lang.String

type KinesisVideoStreamFragmentNumber = java.lang.String

type KmsKeyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Male_
  - typings.awsSdk.awsSdkStrings.Female_
  - typings.awsSdk.awsSdkStrings.Nonbinary
  - typings.awsSdk.awsSdkStrings.Unlisted
  - java.lang.String
*/
type KnownGenderType = _KnownGenderType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type LabelDetectionSortBy = _LabelDetectionSortBy | java.lang.String

type LabelDetections = js.Array[LabelDetection]

type Labels = js.Array[Label]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.eyeLeft
  - typings.awsSdk.awsSdkStrings.eyeRight
  - typings.awsSdk.awsSdkStrings.nose
  - typings.awsSdk.awsSdkStrings.mouthLeft
  - typings.awsSdk.awsSdkStrings.mouthRight
  - typings.awsSdk.awsSdkStrings.leftEyeBrowLeft
  - typings.awsSdk.awsSdkStrings.leftEyeBrowRight
  - typings.awsSdk.awsSdkStrings.leftEyeBrowUp
  - typings.awsSdk.awsSdkStrings.rightEyeBrowLeft
  - typings.awsSdk.awsSdkStrings.rightEyeBrowRight
  - typings.awsSdk.awsSdkStrings.rightEyeBrowUp
  - typings.awsSdk.awsSdkStrings.leftEyeLeft
  - typings.awsSdk.awsSdkStrings.leftEyeRight
  - typings.awsSdk.awsSdkStrings.leftEyeUp
  - typings.awsSdk.awsSdkStrings.leftEyeDown
  - typings.awsSdk.awsSdkStrings.rightEyeLeft
  - typings.awsSdk.awsSdkStrings.rightEyeRight
  - typings.awsSdk.awsSdkStrings.rightEyeUp
  - typings.awsSdk.awsSdkStrings.rightEyeDown
  - typings.awsSdk.awsSdkStrings.noseLeft
  - typings.awsSdk.awsSdkStrings.noseRight
  - typings.awsSdk.awsSdkStrings.mouthUp
  - typings.awsSdk.awsSdkStrings.mouthDown
  - typings.awsSdk.awsSdkStrings.leftPupil
  - typings.awsSdk.awsSdkStrings.rightPupil
  - typings.awsSdk.awsSdkStrings.upperJawlineLeft
  - typings.awsSdk.awsSdkStrings.midJawlineLeft
  - typings.awsSdk.awsSdkStrings.chinBottom
  - typings.awsSdk.awsSdkStrings.midJawlineRight
  - typings.awsSdk.awsSdkStrings.upperJawlineRight
  - java.lang.String
*/
type LandmarkType = _LandmarkType | java.lang.String

type Landmarks = js.Array[Landmark]

type ListDatasetEntriesPageSize = Double

type ListDatasetLabelsPageSize = Double

type ListProjectPoliciesPageSize = Double

type MaxDurationInSecondsULong = Double

type MaxFaces = Double

type MaxFacesToIndex = Double

type MaxPixelThreshold = Double

type MaxResults = Double

type MinCoveragePercentage = Double

type ModerationLabels = js.Array[ModerationLabel]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROTATE_0
  - typings.awsSdk.awsSdkStrings.ROTATE_90
  - typings.awsSdk.awsSdkStrings.ROTATE_180
  - typings.awsSdk.awsSdkStrings.ROTATE_270
  - java.lang.String
*/
type OrientationCorrection = _OrientationCorrection | java.lang.String

type PageSize = Double

type PaginationToken = java.lang.String

type Parents = js.Array[Parent]

type Percent = Double

type PersonDetections = js.Array[PersonDetection]

type PersonIndex = Double

type PersonMatches = js.Array[PersonMatch]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INDEX
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - java.lang.String
*/
type PersonTrackingSortBy = _PersonTrackingSortBy | java.lang.String

type Polygon = js.Array[Point]

type ProjectArn = java.lang.String

type ProjectDescriptions = js.Array[ProjectDescription]

type ProjectName = java.lang.String

type ProjectNames = js.Array[ProjectName]

type ProjectPolicies = js.Array[ProjectPolicy]

type ProjectPolicyDocument = java.lang.String

type ProjectPolicyName = java.lang.String

type ProjectPolicyRevisionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ProjectStatus = _ProjectStatus | java.lang.String

type ProjectVersionArn = java.lang.String

type ProjectVersionDescriptions = js.Array[ProjectVersionDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.TRAINING_COMPLETED
  - typings.awsSdk.awsSdkStrings.TRAINING_FAILED
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.COPYING_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COPYING_COMPLETED
  - typings.awsSdk.awsSdkStrings.COPYING_FAILED
  - java.lang.String
*/
type ProjectVersionStatus = _ProjectVersionStatus | java.lang.String

type ProjectVersionsPageSize = Double

type ProjectsPageSize = Double

type ProtectiveEquipmentPersonIds = js.Array[UInteger]

type ProtectiveEquipmentPersons = js.Array[ProtectiveEquipmentPerson]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FACE_COVER
  - typings.awsSdk.awsSdkStrings.HAND_COVER
  - typings.awsSdk.awsSdkStrings.HEAD_COVER
  - java.lang.String
*/
type ProtectiveEquipmentType = _ProtectiveEquipmentType | java.lang.String

type ProtectiveEquipmentTypes = js.Array[ProtectiveEquipmentType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type QualityFilter = _QualityFilter | java.lang.String

type QueryString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXCEEDS_MAX_FACES
  - typings.awsSdk.awsSdkStrings.EXTREME_POSE
  - typings.awsSdk.awsSdkStrings.LOW_BRIGHTNESS
  - typings.awsSdk.awsSdkStrings.LOW_SHARPNESS
  - typings.awsSdk.awsSdkStrings.LOW_CONFIDENCE
  - typings.awsSdk.awsSdkStrings.SMALL_BOUNDING_BOX
  - typings.awsSdk.awsSdkStrings.LOW_FACE_QUALITY
  - java.lang.String
*/
type Reason = _Reason | java.lang.String

type Reasons = js.Array[Reason]

type RegionsOfInterest = js.Array[RegionOfInterest]

type RekognitionUniqueId = java.lang.String

type ResourceArn = java.lang.String

type RoleArn = java.lang.String

type S3Bucket = java.lang.String

type S3KeyPrefix = java.lang.String

type S3ObjectName = java.lang.String

type S3ObjectVersion = java.lang.String

type SNSTopicArn = java.lang.String

type SegmentConfidence = Double

type SegmentDetections = js.Array[SegmentDetection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TECHNICAL_CUE
  - typings.awsSdk.awsSdkStrings.SHOT
  - java.lang.String
*/
type SegmentType = _SegmentType | java.lang.String

type SegmentTypes = js.Array[SegmentType]

type SegmentTypesInfo = js.Array[SegmentTypeInfo]

type StartStreamProcessorSessionId = java.lang.String

type StatusMessage = java.lang.String

type StreamProcessorArn = java.lang.String

type StreamProcessorList = js.Array[StreamProcessor]

type StreamProcessorName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ConnectedHomeMinConfidence
  - typings.awsSdk.awsSdkStrings.RegionsOfInterest
  - java.lang.String
*/
type StreamProcessorParameterToDelete = _StreamProcessorParameterToDelete | java.lang.String

type StreamProcessorParametersToDelete = js.Array[StreamProcessorParameterToDelete]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type StreamProcessorStatus = _StreamProcessorStatus | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ColorBars
  - typings.awsSdk.awsSdkStrings.EndCredits
  - typings.awsSdk.awsSdkStrings.BlackFrames
  - typings.awsSdk.awsSdkStrings.OpeningCredits
  - typings.awsSdk.awsSdkStrings.StudioLogo
  - typings.awsSdk.awsSdkStrings.Slate_
  - typings.awsSdk.awsSdkStrings.Content
  - java.lang.String
*/
type TechnicalCueType = _TechnicalCueType | java.lang.String

type TextDetectionList = js.Array[TextDetection]

type TextDetectionResults = js.Array[TextDetectionResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINE
  - typings.awsSdk.awsSdkStrings.WORD
  - java.lang.String
*/
type TextTypes = _TextTypes | java.lang.String

type Timecode = java.lang.String

type Timestamp = Double

type UInteger = Double

type ULong = Double

type UnindexedFaces = js.Array[UnindexedFace]

type Url = java.lang.String

type Urls = js.Array[Url]

type VersionName = java.lang.String

type VersionNames = js.Array[VersionName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.LIMITED
  - java.lang.String
*/
type VideoColorRange = _VideoColorRange | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VideoJobStatus = _VideoJobStatus | java.lang.String

type VideoMetadataList = js.Array[VideoMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-06-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
