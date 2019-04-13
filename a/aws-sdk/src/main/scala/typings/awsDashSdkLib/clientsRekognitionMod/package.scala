package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRekognitionMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type Attribute = _Attribute | java.lang.String
  type Attributes = js.Array[Attribute]
  type Boolean = scala.Boolean
  type CelebrityList = js.Array[Celebrity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ID
    - awsDashSdkLib.awsDashSdkLibStrings.TIMESTAMP
    - java.lang.String
  */
  type CelebrityRecognitionSortBy = _CelebrityRecognitionSortBy | java.lang.String
  type CelebrityRecognitions = js.Array[CelebrityRecognition]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CollectionId = java.lang.String
  type CollectionIdList = js.Array[CollectionId]
  type CompareFacesMatchList = js.Array[CompareFacesMatch]
  type CompareFacesUnmatchList = js.Array[ComparedFace]
  type ComparedFaceList = js.Array[ComparedFace]
  type ContentModerationDetections = js.Array[ContentModerationDetection]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.TIMESTAMP
    - java.lang.String
  */
  type ContentModerationSortBy = _ContentModerationSortBy | java.lang.String
  type DateTime = stdLib.Date
  type Degree = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HAPPY
    - awsDashSdkLib.awsDashSdkLibStrings.SAD
    - awsDashSdkLib.awsDashSdkLibStrings.ANGRY
    - awsDashSdkLib.awsDashSdkLibStrings.CONFUSED
    - awsDashSdkLib.awsDashSdkLibStrings.DISGUSTED
    - awsDashSdkLib.awsDashSdkLibStrings.SURPRISED
    - awsDashSdkLib.awsDashSdkLibStrings.CALM
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type EmotionName = _EmotionName | java.lang.String
  type Emotions = js.Array[Emotion]
  type ExternalImageId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
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
    - awsDashSdkLib.awsDashSdkLibStrings.INDEX
    - awsDashSdkLib.awsDashSdkLibStrings.TIMESTAMP
    - java.lang.String
  */
  type FaceSearchSortBy = _FaceSearchSortBy | java.lang.String
  type Float = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Male
    - awsDashSdkLib.awsDashSdkLibStrings.Female
    - java.lang.String
  */
  type GenderType = _GenderType | java.lang.String
  type ImageBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ImageId = java.lang.String
  type Instances = js.Array[Instance]
  type JobId = java.lang.String
  type JobTag = java.lang.String
  type KinesisDataArn = java.lang.String
  type KinesisVideoArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.TIMESTAMP
    - java.lang.String
  */
  type LabelDetectionSortBy = _LabelDetectionSortBy | java.lang.String
  type LabelDetections = js.Array[LabelDetection]
  type Labels = js.Array[Label]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.eyeLeft
    - awsDashSdkLib.awsDashSdkLibStrings.eyeRight
    - awsDashSdkLib.awsDashSdkLibStrings.nose
    - awsDashSdkLib.awsDashSdkLibStrings.mouthLeft
    - awsDashSdkLib.awsDashSdkLibStrings.mouthRight
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeBrowLeft
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeBrowRight
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeBrowUp
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeBrowLeft
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeBrowRight
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeBrowUp
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeLeft
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeRight
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeUp
    - awsDashSdkLib.awsDashSdkLibStrings.leftEyeDown
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeLeft
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeRight
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeUp
    - awsDashSdkLib.awsDashSdkLibStrings.rightEyeDown
    - awsDashSdkLib.awsDashSdkLibStrings.noseLeft
    - awsDashSdkLib.awsDashSdkLibStrings.noseRight
    - awsDashSdkLib.awsDashSdkLibStrings.mouthUp
    - awsDashSdkLib.awsDashSdkLibStrings.mouthDown
    - awsDashSdkLib.awsDashSdkLibStrings.leftPupil
    - awsDashSdkLib.awsDashSdkLibStrings.rightPupil
    - awsDashSdkLib.awsDashSdkLibStrings.upperJawlineLeft
    - awsDashSdkLib.awsDashSdkLibStrings.midJawlineLeft
    - awsDashSdkLib.awsDashSdkLibStrings.chinBottom
    - awsDashSdkLib.awsDashSdkLibStrings.midJawlineRight
    - awsDashSdkLib.awsDashSdkLibStrings.upperJawlineRight
    - java.lang.String
  */
  type LandmarkType = _LandmarkType | java.lang.String
  type Landmarks = js.Array[Landmark]
  type MaxFaces = scala.Double
  type MaxFacesToIndex = scala.Double
  type MaxResults = scala.Double
  type ModerationLabels = js.Array[ModerationLabel]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ROTATE_0
    - awsDashSdkLib.awsDashSdkLibStrings.ROTATE_90
    - awsDashSdkLib.awsDashSdkLibStrings.ROTATE_180
    - awsDashSdkLib.awsDashSdkLibStrings.ROTATE_270
    - java.lang.String
  */
  type OrientationCorrection = _OrientationCorrection | java.lang.String
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Parents = js.Array[Parent]
  type Percent = scala.Double
  type PersonDetections = js.Array[PersonDetection]
  type PersonIndex = scala.Double
  type PersonMatches = js.Array[PersonMatch]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INDEX
    - awsDashSdkLib.awsDashSdkLibStrings.TIMESTAMP
    - java.lang.String
  */
  type PersonTrackingSortBy = _PersonTrackingSortBy | java.lang.String
  type Polygon = js.Array[Point]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.AUTO
    - java.lang.String
  */
  type QualityFilter = _QualityFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EXCEEDS_MAX_FACES
    - awsDashSdkLib.awsDashSdkLibStrings.EXTREME_POSE
    - awsDashSdkLib.awsDashSdkLibStrings.LOW_BRIGHTNESS
    - awsDashSdkLib.awsDashSdkLibStrings.LOW_SHARPNESS
    - awsDashSdkLib.awsDashSdkLibStrings.LOW_CONFIDENCE
    - awsDashSdkLib.awsDashSdkLibStrings.SMALL_BOUNDING_BOX
    - java.lang.String
  */
  type Reason = _Reason | java.lang.String
  type Reasons = js.Array[Reason]
  type RekognitionUniqueId = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  type StatusMessage = java.lang.String
  type StreamProcessorArn = java.lang.String
  type StreamProcessorList = js.Array[StreamProcessor]
  type StreamProcessorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - java.lang.String
  */
  type StreamProcessorStatus = _StreamProcessorStatus | java.lang.String
  type String = java.lang.String
  type TextDetectionList = js.Array[TextDetection]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LINE
    - awsDashSdkLib.awsDashSdkLibStrings.WORD
    - java.lang.String
  */
  type TextTypes = _TextTypes | java.lang.String
  type Timestamp = scala.Double
  type UInteger = scala.Double
  type ULong = scala.Double
  type UnindexedFaces = js.Array[UnindexedFace]
  type Url = java.lang.String
  type Urls = js.Array[Url]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type VideoJobStatus = _VideoJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-06-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
