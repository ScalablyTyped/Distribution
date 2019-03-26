package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/rekognition", "Rekognition")
@js.native
object RekognitionNs extends js.Object {
  trait AgeRange extends js.Object {
    /**
      * The highest estimated age.
      */
    var High: js.UndefOr[UInteger] = js.undefined
    /**
      * The lowest estimated age.
      */
    var Low: js.UndefOr[UInteger] = js.undefined
  }
  
  trait Beard extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the face has beard or not.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait BoundingBox extends js.Object {
    /**
      * Height of the bounding box as a ratio of the overall image height.
      */
    var Height: js.UndefOr[Float] = js.undefined
    /**
      * Left coordinate of the bounding box as a ratio of overall image width.
      */
    var Left: js.UndefOr[Float] = js.undefined
    /**
      * Top coordinate of the bounding box as a ratio of overall image height.
      */
    var Top: js.UndefOr[Float] = js.undefined
    /**
      * Width of the bounding box as a ratio of the overall image width.
      */
    var Width: js.UndefOr[Float] = js.undefined
  }
  
  trait Celebrity extends js.Object {
    /**
      * Provides information about the celebrity's face, such as its location on the image.
      */
    var Face: js.UndefOr[ComparedFace] = js.undefined
    /**
      * A unique identifier for the celebrity. 
      */
    var Id: js.UndefOr[RekognitionUniqueId] = js.undefined
    /**
      * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
      */
    var MatchConfidence: js.UndefOr[Percent] = js.undefined
    /**
      * The name of the celebrity.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * An array of URLs pointing to additional information about the celebrity. If there is no additional information about the celebrity, this list is empty.
      */
    var Urls: js.UndefOr[Urls] = js.undefined
  }
  
  trait CelebrityDetail extends js.Object {
    /**
      * Bounding box around the body of a celebrity.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity. 
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Face details for the recognized celebrity.
      */
    var Face: js.UndefOr[FaceDetail] = js.undefined
    /**
      * The unique identifier for the celebrity. 
      */
    var Id: js.UndefOr[RekognitionUniqueId] = js.undefined
    /**
      * The name of the celebrity.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * An array of URLs pointing to additional celebrity information. 
      */
    var Urls: js.UndefOr[Urls] = js.undefined
  }
  
  trait CelebrityRecognition extends js.Object {
    /**
      * Information about a recognized celebrity.
      */
    var Celebrity: js.UndefOr[CelebrityDetail] = js.undefined
    /**
      * The time, in milliseconds from the start of the video, that the celebrity was recognized.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CompareFacesMatch extends js.Object {
    /**
      * Provides face metadata (bounding box and confidence that the bounding box actually contains a face).
      */
    var Face: js.UndefOr[ComparedFace] = js.undefined
    /**
      * Level of confidence that the faces match.
      */
    var Similarity: js.UndefOr[Percent] = js.undefined
  }
  
  trait CompareFacesRequest extends js.Object {
    /**
      * The minimum level of confidence in the face matches that a match must meet to be included in the FaceMatches array.
      */
    var SimilarityThreshold: js.UndefOr[Percent] = js.undefined
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var SourceImage: Image
    /**
      * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var TargetImage: Image
  }
  
  trait CompareFacesResponse extends js.Object {
    /**
      * An array of faces in the target image that match the source image face. Each CompareFacesMatch object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity score for the face in the bounding box and the face in the source image.
      */
    var FaceMatches: js.UndefOr[CompareFacesMatchList] = js.undefined
    /**
      * The face in the source image that was used for comparison.
      */
    var SourceImageFace: js.UndefOr[ComparedSourceImageFace] = js.undefined
    /**
      * The value of SourceImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
      */
    var SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    /**
      * The value of TargetImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
      */
    var TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    /**
      * An array of faces in the target image that did not match the source image face.
      */
    var UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList] = js.undefined
  }
  
  trait ComparedFace extends js.Object {
    /**
      * Bounding box of the face.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Level of confidence that what the bounding box contains is a face.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * An array of facial landmarks.
      */
    var Landmarks: js.UndefOr[Landmarks] = js.undefined
    /**
      * Indicates the pose of the face as determined by its pitch, roll, and yaw.
      */
    var Pose: js.UndefOr[Pose] = js.undefined
    /**
      * Identifies face image brightness and sharpness. 
      */
    var Quality: js.UndefOr[ImageQuality] = js.undefined
  }
  
  trait ComparedSourceImageFace extends js.Object {
    /**
      * Bounding box of the face.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Confidence level that the selected bounding box contains a face.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
  }
  
  trait ContentModerationDetection extends js.Object {
    /**
      * The moderation label detected by in the stored video.
      */
    var ModerationLabel: js.UndefOr[ModerationLabel] = js.undefined
    /**
      * Time, in milliseconds from the beginning of the video, that the moderation label was detected.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait CreateCollectionRequest extends js.Object {
    /**
      * ID for the collection that you are creating.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
  }
  
  trait CreateCollectionResponse extends js.Object {
    /**
      * Amazon Resource Name (ARN) of the collection. You can use this to manage permissions on your resources. 
      */
    var CollectionArn: js.UndefOr[String] = js.undefined
    /**
      * Version number of the face detection model associated with the collection you are creating.
      */
    var FaceModelVersion: js.UndefOr[String] = js.undefined
    /**
      * HTTP status code indicating the result of the operation.
      */
    var StatusCode: js.UndefOr[UInteger] = js.undefined
  }
  
  trait CreateStreamProcessorRequest extends js.Object {
    /**
      * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter name is StreamProcessorInput.
      */
    var Input: StreamProcessorInput
    /**
      * An identifier you assign to the stream processor. You can use Name to manage the stream processor. For example, you can get the current status of the stream processor by calling DescribeStreamProcessor. Name is idempotent. 
      */
    var Name: StreamProcessorName
    /**
      * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS CLI, the parameter name is StreamProcessorOutput.
      */
    var Output: StreamProcessorOutput
    /**
      * ARN of the IAM role that allows access to the stream processor.
      */
    var RoleArn: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RoleArn
    /**
      * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
      */
    var Settings: StreamProcessorSettings
  }
  
  trait CreateStreamProcessorResponse extends js.Object {
    /**
      * ARN for the newly create stream processor.
      */
    var StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
  }
  
  trait DeleteCollectionRequest extends js.Object {
    /**
      * ID of the collection to delete.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
  }
  
  trait DeleteCollectionResponse extends js.Object {
    /**
      * HTTP status code that indicates the result of the operation.
      */
    var StatusCode: js.UndefOr[UInteger] = js.undefined
  }
  
  trait DeleteFacesRequest extends js.Object {
    /**
      * Collection from which to remove the specific faces.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
    /**
      * An array of face IDs to delete.
      */
    var FaceIds: FaceIdList
  }
  
  trait DeleteFacesResponse extends js.Object {
    /**
      * An array of strings (face IDs) of the faces that were deleted.
      */
    var DeletedFaces: js.UndefOr[FaceIdList] = js.undefined
  }
  
  trait DeleteStreamProcessorRequest extends js.Object {
    /**
      * The name of the stream processor you want to delete.
      */
    var Name: StreamProcessorName
  }
  
  trait DeleteStreamProcessorResponse extends js.Object
  
  trait DescribeCollectionRequest extends js.Object {
    /**
      * The ID of the collection to describe.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
  }
  
  trait DescribeCollectionResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the collection.
      */
    var CollectionARN: js.UndefOr[String] = js.undefined
    /**
      * The number of milliseconds since the Unix epoch time until the creation of the collection. The Unix epoch time is 00:00:00 Coordinated Universal Time (UTC), Thursday, 1 January 1970.
      */
    var CreationTimestamp: js.UndefOr[DateTime] = js.undefined
    /**
      * The number of faces that are indexed into the collection. To index faces into a collection, use IndexFaces.
      */
    var FaceCount: js.UndefOr[ULong] = js.undefined
    /**
      * The version of the face model that's used by the collection for face detection. For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
      */
    var FaceModelVersion: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeStreamProcessorRequest extends js.Object {
    /**
      * Name of the stream processor for which you want information.
      */
    var Name: StreamProcessorName
  }
  
  trait DescribeStreamProcessorResponse extends js.Object {
    /**
      * Date and time the stream processor was created
      */
    var CreationTimestamp: js.UndefOr[DateTime] = js.undefined
    /**
      * Kinesis video stream that provides the source streaming video.
      */
    var Input: js.UndefOr[StreamProcessorInput] = js.undefined
    /**
      * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves from a running state to a failed state, or when the user starts or stops the stream processor.
      */
    var LastUpdateTimestamp: js.UndefOr[DateTime] = js.undefined
    /**
      * Name of the stream processor. 
      */
    var Name: js.UndefOr[StreamProcessorName] = js.undefined
    /**
      * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
      */
    var Output: js.UndefOr[StreamProcessorOutput] = js.undefined
    /**
      * ARN of the IAM role that allows access to the stream processor.
      */
    var RoleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
      */
    var Settings: js.UndefOr[StreamProcessorSettings] = js.undefined
    /**
      * Current status of the stream processor.
      */
    var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
    /**
      * Detailed status message about the stream processor.
      */
    var StatusMessage: js.UndefOr[String] = js.undefined
    /**
      * ARN of the stream processor.
      */
    var StreamProcessorArn: js.UndefOr[StreamProcessorArn] = js.undefined
  }
  
  trait DetectFacesRequest extends js.Object {
    /**
      * An array of facial attributes you want to be returned. This can be the default list of attributes or all attributes. If you don't specify a value for Attributes or if you specify ["DEFAULT"], the API returns the following subset of facial attributes: BoundingBox, Confidence, Pose, Quality, and Landmarks. If you provide ["ALL"], all facial attributes are returned, but the operation takes longer to complete. If you provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case, all attributes). 
      */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
  }
  
  trait DetectFacesResponse extends js.Object {
    /**
      * Details of each face found in the image. 
      */
    var FaceDetails: js.UndefOr[FaceDetailList] = js.undefined
    /**
      * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
      */
    var OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
  }
  
  trait DetectLabelsRequest extends js.Object {
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded. If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
    /**
      * Maximum number of labels you want the service to return in the response. The service returns the specified number of highest confidence labels. 
      */
    var MaxLabels: js.UndefOr[UInteger] = js.undefined
    /**
      * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with confidence lower than this specified value. If MinConfidence is not specified, the operation returns labels with a confidence values greater than or equal to 55 percent.
      */
    var MinConfidence: js.UndefOr[Percent] = js.undefined
  }
  
  trait DetectLabelsResponse extends js.Object {
    /**
      * Version number of the label detection model that was used to detect labels.
      */
    var LabelModelVersion: js.UndefOr[String] = js.undefined
    /**
      * An array of labels for the real-world objects detected. 
      */
    var Labels: js.UndefOr[Labels] = js.undefined
    /**
      * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
      */
    var OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
  }
  
  trait DetectModerationLabelsRequest extends js.Object {
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
    /**
      * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with a confidence level lower than this specified value. If you don't specify MinConfidence, the operation returns labels with confidence values greater than or equal to 50 percent.
      */
    var MinConfidence: js.UndefOr[Percent] = js.undefined
  }
  
  trait DetectModerationLabelsResponse extends js.Object {
    /**
      * Array of detected Moderation labels and the time, in millseconds from the start of the video, they were detected.
      */
    var ModerationLabels: js.UndefOr[ModerationLabels] = js.undefined
    /**
      * Version number of the moderation detection model that was used to detect unsafe content.
      */
    var ModerationModelVersion: js.UndefOr[String] = js.undefined
  }
  
  trait DetectTextRequest extends js.Object {
    /**
      * The input image as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Rekognition operations, you can't pass image bytes.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
  }
  
  trait DetectTextResponse extends js.Object {
    /**
      * An array of text that was detected in the input image.
      */
    var TextDetections: js.UndefOr[TextDetectionList] = js.undefined
  }
  
  trait Emotion extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Type of emotion detected.
      */
    var Type: js.UndefOr[EmotionName] = js.undefined
  }
  
  trait EyeOpen extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the eyes on the face are open.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait Eyeglasses extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the face is wearing eye glasses or not.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait Face extends js.Object {
    /**
      * Bounding box of the face.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Confidence level that the bounding box contains a face (and not a different object such as a tree).
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Identifier that you assign to all the faces in the input image.
      */
    var ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined
    /**
      * Unique identifier that Amazon Rekognition assigns to the face.
      */
    var FaceId: js.UndefOr[FaceId] = js.undefined
    /**
      * Unique identifier that Amazon Rekognition assigns to the input image.
      */
    var ImageId: js.UndefOr[ImageId] = js.undefined
  }
  
  trait FaceDetail extends js.Object {
    /**
      * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the highest estimated age.
      */
    var AgeRange: js.UndefOr[AgeRange] = js.undefined
    /**
      * Indicates whether or not the face has a beard, and the confidence level in the determination.
      */
    var Beard: js.UndefOr[Beard] = js.undefined
    /**
      * Bounding box of the face. Default attribute.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default attribute.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and ANGRY. 
      */
    var Emotions: js.UndefOr[Emotions] = js.undefined
    /**
      * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
      */
    var Eyeglasses: js.UndefOr[Eyeglasses] = js.undefined
    /**
      * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
      */
    var EyesOpen: js.UndefOr[EyeOpen] = js.undefined
    /**
      * Gender of the face and the confidence level in the determination.
      */
    var Gender: js.UndefOr[Gender] = js.undefined
    /**
      * Indicates the location of landmarks on the face. Default attribute.
      */
    var Landmarks: js.UndefOr[Landmarks] = js.undefined
    /**
      * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
      */
    var MouthOpen: js.UndefOr[MouthOpen] = js.undefined
    /**
      * Indicates whether or not the face has a mustache, and the confidence level in the determination.
      */
    var Mustache: js.UndefOr[Mustache] = js.undefined
    /**
      * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
      */
    var Pose: js.UndefOr[Pose] = js.undefined
    /**
      * Identifies image brightness and sharpness. Default attribute.
      */
    var Quality: js.UndefOr[ImageQuality] = js.undefined
    /**
      * Indicates whether or not the face is smiling, and the confidence level in the determination.
      */
    var Smile: js.UndefOr[Smile] = js.undefined
    /**
      * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
      */
    var Sunglasses: js.UndefOr[Sunglasses] = js.undefined
  }
  
  trait FaceDetection extends js.Object {
    /**
      * The face properties for the detected face.
      */
    var Face: js.UndefOr[FaceDetail] = js.undefined
    /**
      * Time, in milliseconds from the start of the video, that the face was detected.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait FaceMatch extends js.Object {
    /**
      * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image ID that you assigned.
      */
    var Face: js.UndefOr[Face] = js.undefined
    /**
      * Confidence in the match of this face with the input face.
      */
    var Similarity: js.UndefOr[Percent] = js.undefined
  }
  
  trait FaceRecord extends js.Object {
    /**
      * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
      */
    var Face: js.UndefOr[Face] = js.undefined
    /**
      * Structure containing attributes of the face that the algorithm detected.
      */
    var FaceDetail: js.UndefOr[FaceDetail] = js.undefined
  }
  
  trait FaceSearchSettings extends js.Object {
    /**
      * The ID of a collection that contains faces that you want to search for.
      */
    var CollectionId: js.UndefOr[CollectionId] = js.undefined
    /**
      * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 70. 0 is the lowest confidence. 100 is the highest confidence.
      */
    var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
  }
  
  trait Gender extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Gender of the face.
      */
    var Value: js.UndefOr[GenderType] = js.undefined
  }
  
  trait Geometry extends js.Object {
    /**
      * An axis-aligned coarse representation of the detected text's location on the image.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Within the bounding box, a fine-grained polygon around the detected text.
      */
    var Polygon: js.UndefOr[Polygon] = js.undefined
  }
  
  trait GetCelebrityInfoRequest extends js.Object {
    /**
      * The ID for the celebrity. You get the celebrity ID from a call to the RecognizeCelebrities operation, which recognizes celebrities in an image. 
      */
    var Id: RekognitionUniqueId
  }
  
  trait GetCelebrityInfoResponse extends js.Object {
    /**
      * The name of the celebrity.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * An array of URLs pointing to additional celebrity information. 
      */
    var Urls: js.UndefOr[Urls] = js.undefined
  }
  
  trait GetCelebrityRecognitionRequest extends js.Object {
    /**
      * Job identifier for the required celebrity recognition analysis. You can get the job identifer from a call to StartCelebrityRecognition.
      */
    var JobId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.JobId
    /**
      * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there is more recognized celebrities to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of celebrities. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Sort to use for celebrities returned in Celebrities field. Specify ID to sort by the celebrity identifier, specify TIMESTAMP to sort by the time the celebrity was recognized.
      */
    var SortBy: js.UndefOr[CelebrityRecognitionSortBy] = js.undefined
  }
  
  trait GetCelebrityRecognitionResponse extends js.Object {
    /**
      * Array of celebrities recognized in the video.
      */
    var Celebrities: js.UndefOr[CelebrityRecognitions] = js.undefined
    /**
      * The current status of the celebrity recognition job.
      */
    var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of celebrities.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * If the job fails, StatusMessage provides a descriptive error message.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
      */
    var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  }
  
  trait GetContentModerationRequest extends js.Object {
    /**
      * The identifier for the content moderation job. Use JobId to identify the job in a subsequent call to GetContentModeration.
      */
    var JobId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.JobId
    /**
      * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a pagination token in the response. You can use this pagination token to retrieve the next set of content moderation labels.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Sort to use for elements in the ModerationLabelDetections array. Use TIMESTAMP to sort array elements by the time labels are detected. Use NAME to alphabetically group elements for a label together. Within each label group, the array element are sorted by detection confidence. The default sort is by TIMESTAMP.
      */
    var SortBy: js.UndefOr[ContentModerationSortBy] = js.undefined
  }
  
  trait GetContentModerationResponse extends js.Object {
    /**
      * The current status of the content moderation job.
      */
    var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
    /**
      * The detected moderation labels and the time(s) they were detected.
      */
    var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.undefined
    /**
      * Version number of the moderation detection model that was used to detect unsafe content.
      */
    var ModerationModelVersion: js.UndefOr[String] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of moderation labels. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * If the job fails, StatusMessage provides a descriptive error message.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
      */
    var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  }
  
  trait GetFaceDetectionRequest extends js.Object {
    /**
      * Unique identifier for the face detection job. The JobId is returned from StartFaceDetection.
      */
    var JobId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.JobId
    /**
      * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there are more faces to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of faces.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait GetFaceDetectionResponse extends js.Object {
    /**
      * An array of faces detected in the video. Each element contains a detected face's details and the time, in milliseconds from the start of the video, the face was detected. 
      */
    var Faces: js.UndefOr[FaceDetections] = js.undefined
    /**
      * The current status of the face detection job.
      */
    var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * If the job fails, StatusMessage provides a descriptive error message.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition video operation.
      */
    var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  }
  
  trait GetFaceSearchRequest extends js.Object {
    /**
      * The job identifer for the search request. You get the job identifier from an initial call to StartFaceSearch.
      */
    var JobId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.JobId
    /**
      * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there is more search results to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of search results. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Sort to use for grouping faces in the response. Use TIMESTAMP to group faces by the time that they are recognized. Use INDEX to sort by recognized faces. 
      */
    var SortBy: js.UndefOr[FaceSearchSortBy] = js.undefined
  }
  
  trait GetFaceSearchResponse extends js.Object {
    /**
      * The current status of the face search job.
      */
    var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of search results. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * An array of persons, PersonMatch, in the video whose face(s) match the face(s) in an Amazon Rekognition collection. It also includes time information for when persons are matched in the video. You specify the input collection in an initial call to StartFaceSearch. Each Persons element includes a time the person was matched, face match details (FaceMatches) for matching faces in the collection, and person information (Person) for the matched person. 
      */
    var Persons: js.UndefOr[PersonMatches] = js.undefined
    /**
      * If the job fails, StatusMessage provides a descriptive error message.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation. 
      */
    var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  }
  
  trait GetLabelDetectionRequest extends js.Object {
    /**
      * Job identifier for the label detection operation for which you want results returned. You get the job identifer from an initial call to StartlabelDetection.
      */
    var JobId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.JobId
    /**
      * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of labels. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Sort to use for elements in the Labels array. Use TIMESTAMP to sort array elements by the time labels are detected. Use NAME to alphabetically group elements for a label together. Within each label group, the array element are sorted by detection confidence. The default sort is by TIMESTAMP.
      */
    var SortBy: js.UndefOr[LabelDetectionSortBy] = js.undefined
  }
  
  trait GetLabelDetectionResponse extends js.Object {
    /**
      * The current status of the label detection job.
      */
    var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
    /**
      * Version number of the label detection model that was used to detect labels.
      */
    var LabelModelVersion: js.UndefOr[String] = js.undefined
    /**
      * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds from the start of the video, that the label was detected. 
      */
    var Labels: js.UndefOr[LabelDetections] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of labels.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * If the job fails, StatusMessage provides a descriptive error message.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition video operation.
      */
    var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  }
  
  trait GetPersonTrackingRequest extends js.Object {
    /**
      * The identifier for a job that tracks persons in a video. You get the JobId from a call to StartPersonTracking. 
      */
    var JobId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.JobId
    /**
      * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of persons. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Sort to use for elements in the Persons array. Use TIMESTAMP to sort array elements by the time persons are detected. Use INDEX to sort by the tracked persons. If you sort by INDEX, the array elements for each person are sorted by detection confidence. The default sort is by TIMESTAMP.
      */
    var SortBy: js.UndefOr[PersonTrackingSortBy] = js.undefined
  }
  
  trait GetPersonTrackingResponse extends js.Object {
    /**
      * The current status of the person tracking job.
      */
    var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of persons. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An array element will exist for each time a person's path is tracked. 
      */
    var Persons: js.UndefOr[PersonDetections] = js.undefined
    /**
      * If the job fails, StatusMessage provides a descriptive error message.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
      */
    var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
  }
  
  trait Image extends js.Object {
    /**
      * Blob of image bytes up to 5 MBs.
      */
    var Bytes: js.UndefOr[ImageBlob] = js.undefined
    /**
      * Identifies an S3 object as the image source.
      */
    var S3Object: js.UndefOr[S3Object] = js.undefined
  }
  
  trait ImageQuality extends js.Object {
    /**
      * Value representing brightness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a brighter face image.
      */
    var Brightness: js.UndefOr[Float] = js.undefined
    /**
      * Value representing sharpness of the face. The service returns a value between 0 and 100 (inclusive). A higher value indicates a sharper face image.
      */
    var Sharpness: js.UndefOr[Float] = js.undefined
  }
  
  trait IndexFacesRequest extends js.Object {
    /**
      * The ID of an existing collection to which you want to add the faces that are detected in the input images.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
    /**
      * An array of facial attributes that you want to be returned. This can be the default list of attributes or all attributes. If you don't specify a value for Attributes or if you specify ["DEFAULT"], the API returns the following subset of facial attributes: BoundingBox, Confidence, Pose, Quality, and Landmarks. If you provide ["ALL"], all facial attributes are returned, but the operation takes longer to complete. If you provide both, ["ALL", "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case, all attributes). 
      */
    var DetectionAttributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The ID you want to assign to all the faces detected in the image.
      */
    var ExternalImageId: js.UndefOr[ExternalImageId] = js.undefined
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes isn't supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
    /**
      * The maximum number of faces to index. The value of MaxFaces must be greater than or equal to 1. IndexFaces returns no more than 100 detected faces in an image, even if you specify a larger value for MaxFaces. If IndexFaces detects more faces than the value of MaxFaces, the faces with the lowest quality are filtered out first. If there are still more faces than the value of MaxFaces, the faces with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of MaxFaces). Information about the unindexed faces is available in the UnindexedFaces array.  The faces that are returned by IndexFaces are sorted by the largest face bounding box size to the smallest size, in descending order.  MaxFaces can be used with a collection associated with any version of the face model.
      */
    var MaxFaces: js.UndefOr[MaxFacesToIndex] = js.undefined
    /**
      * A filter that specifies how much filtering is done to identify faces that are detected with low quality. Filtered faces aren't indexed. If you specify AUTO, filtering prioritizes the identification of faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you specify NONE, no filtering is performed. The default value is AUTO. To use quality filtering, the collection you are using must be associated with version 3 of the face model.
      */
    var QualityFilter: js.UndefOr[QualityFilter] = js.undefined
  }
  
  trait IndexFacesResponse extends js.Object {
    /**
      * The version number of the face detection model that's associated with the input collection (CollectionId).
      */
    var FaceModelVersion: js.UndefOr[String] = js.undefined
    /**
      * An array of faces detected and added to the collection. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. 
      */
    var FaceRecords: js.UndefOr[FaceRecordList] = js.undefined
    /**
      * If your collection is associated with a face detection model that's later than version 3.0, the value of OrientationCorrection is always null and no orientation information is returned. If your collection is associated with a face detection model that's version 3.0 or earlier, the following applies:   If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction - the bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. The value of OrientationCorrection is null.   If the image doesn't contain orientation information in its Exif metadata, Amazon Rekognition returns an estimated orientation (ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270). Amazon Rekognition doesn’t perform image correction for images. The bounding box coordinates aren't translated and represent the object locations before the image is rotated.   Bounding box information is returned in the FaceRecords array. You can get the version of the face detection model by calling DescribeCollection. 
      */
    var OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    /**
      * An array of faces that were detected in the image but weren't indexed. They weren't indexed because the quality filter identified them as low quality, or the MaxFaces request parameter filtered them out. To use the quality filter, you specify the QualityFilter request parameter.
      */
    var UnindexedFaces: js.UndefOr[UnindexedFaces] = js.undefined
  }
  
  trait Instance extends js.Object {
    /**
      * The position of the label instance on the image.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
  }
  
  trait KinesisDataStream extends js.Object {
    /**
      * ARN of the output Amazon Kinesis Data Streams stream.
      */
    var Arn: js.UndefOr[KinesisDataArn] = js.undefined
  }
  
  trait KinesisVideoStream extends js.Object {
    /**
      * ARN of the Kinesis video stream stream that streams the source video.
      */
    var Arn: js.UndefOr[KinesisVideoArn] = js.undefined
  }
  
  trait Label extends js.Object {
    /**
      * Level of confidence.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * If Label represents an object, Instances contains the bounding boxes for each instance of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture, apparel or pets.
      */
    var Instances: js.UndefOr[Instances] = js.undefined
    /**
      * The name (label) of the object or scene.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The parent labels for a label. The response includes all ancestor labels.
      */
    var Parents: js.UndefOr[Parents] = js.undefined
  }
  
  trait LabelDetection extends js.Object {
    /**
      * Details about the detected label.
      */
    var Label: js.UndefOr[Label] = js.undefined
    /**
      * Time, in milliseconds from the start of the video, that the label was detected.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait Landmark extends js.Object {
    /**
      * Type of landmark.
      */
    var Type: js.UndefOr[LandmarkType] = js.undefined
    /**
      * The x-coordinate from the top left of the landmark expressed as the ratio of the width of the image. For example, if the image is 700 x 200 and the x-coordinate of the landmark is at 350 pixels, this value is 0.5. 
      */
    var X: js.UndefOr[Float] = js.undefined
    /**
      * The y-coordinate from the top left of the landmark expressed as the ratio of the height of the image. For example, if the image is 700 x 200 and the y-coordinate of the landmark is at 100 pixels, this value is 0.5.
      */
    var Y: js.UndefOr[Float] = js.undefined
  }
  
  trait ListCollectionsRequest extends js.Object {
    /**
      * Maximum number of collection IDs to return. 
      */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
      * Pagination token from the previous response.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListCollectionsResponse extends js.Object {
    /**
      * An array of collection IDs.
      */
    var CollectionIds: js.UndefOr[CollectionIdList] = js.undefined
    /**
      * Version numbers of the face detection models associated with the collections in the array CollectionIds. For example, the value of FaceModelVersions[2] is the version number for the face detection model used by the collection in CollectionId[2].
      */
    var FaceModelVersions: js.UndefOr[FaceModelVersionList] = js.undefined
    /**
      * If the result is truncated, the response provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListFacesRequest extends js.Object {
    /**
      * ID of the collection from which to list the faces.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
    /**
      * Maximum number of faces to return.
      */
    var MaxResults: js.UndefOr[PageSize] = js.undefined
    /**
      * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a pagination token in the response. You can use this pagination token to retrieve the next set of faces.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListFacesResponse extends js.Object {
    /**
      * Version number of the face detection model associated with the input collection (CollectionId).
      */
    var FaceModelVersion: js.UndefOr[String] = js.undefined
    /**
      * An array of Face objects. 
      */
    var Faces: js.UndefOr[FaceList] = js.undefined
    /**
      * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListStreamProcessorsRequest extends js.Object {
    /**
      * Maximum number of stream processors you want Amazon Rekognition Video to return in the response. The default is 1000. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous response was incomplete (because there are more stream processors to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of stream processors. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListStreamProcessorsResponse extends js.Object {
    /**
      * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of stream processors. 
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * List of stream processors that you have created.
      */
    var StreamProcessors: js.UndefOr[StreamProcessorList] = js.undefined
  }
  
  trait ModerationLabel extends js.Object {
    /**
      * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified. If you don't specify the MinConfidence parameter in the call to DetectModerationLabels, the operation returns labels with a confidence value greater than or equal to 50 percent.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * The label name for the type of content detected in the image.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The name for the parent label. Labels at the top level of the hierarchy have the parent label "".
      */
    var ParentName: js.UndefOr[String] = js.undefined
  }
  
  trait MouthOpen extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the mouth on the face is open or not.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait Mustache extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the face has mustache or not.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait NotificationChannel extends js.Object {
    /**
      * The ARN of an IAM role that gives Amazon Rekognition publishing permissions to the Amazon SNS topic. 
      */
    var RoleArn: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RoleArn
    /**
      * The Amazon SNS topic to which Amazon Rekognition to posts the completion status.
      */
    var SNSTopicArn: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SNSTopicArn
  }
  
  trait Parent extends js.Object {
    /**
      * The name of the parent label.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait PersonDetail extends js.Object {
    /**
      * Bounding box around the detected person.
      */
    var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * Face details for the detected person.
      */
    var Face: js.UndefOr[FaceDetail] = js.undefined
    /**
      * Identifier for the person detected person within a video. Use to keep track of the person throughout the video. The identifier is not stored by Amazon Rekognition.
      */
    var Index: js.UndefOr[PersonIndex] = js.undefined
  }
  
  trait PersonDetection extends js.Object {
    /**
      * Details about a person whose path was tracked in a video.
      */
    var Person: js.UndefOr[PersonDetail] = js.undefined
    /**
      * The time, in milliseconds from the start of the video, that the person's path was tracked.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait PersonMatch extends js.Object {
    /**
      * Information about the faces in the input collection that match the face of a person in the video.
      */
    var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
    /**
      * Information about the matched person.
      */
    var Person: js.UndefOr[PersonDetail] = js.undefined
    /**
      * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait Point extends js.Object {
    /**
      * The value of the X coordinate for a point on a Polygon.
      */
    var X: js.UndefOr[Float] = js.undefined
    /**
      * The value of the Y coordinate for a point on a Polygon.
      */
    var Y: js.UndefOr[Float] = js.undefined
  }
  
  trait Pose extends js.Object {
    /**
      * Value representing the face rotation on the pitch axis.
      */
    var Pitch: js.UndefOr[Degree] = js.undefined
    /**
      * Value representing the face rotation on the roll axis.
      */
    var Roll: js.UndefOr[Degree] = js.undefined
    /**
      * Value representing the face rotation on the yaw axis.
      */
    var Yaw: js.UndefOr[Degree] = js.undefined
  }
  
  trait RecognizeCelebritiesRequest extends js.Object {
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
  }
  
  trait RecognizeCelebritiesResponse extends js.Object {
    /**
      * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an image.
      */
    var CelebrityFaces: js.UndefOr[CelebrityList] = js.undefined
    /**
      * The orientation of the input image (counterclockwise direction). If your application displays the image, you can use this value to correct the orientation. The bounding box coordinates returned in CelebrityFaces and UnrecognizedFaces represent face locations before the image orientation is corrected.   If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value of OrientationCorrection is null. The CelebrityFaces and UnrecognizedFaces bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata.  
      */
    var OrientationCorrection: js.UndefOr[OrientationCorrection] = js.undefined
    /**
      * Details about each unrecognized face in the image.
      */
    var UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.undefined
  }
  
  trait S3Object extends js.Object {
    /**
      * Name of the S3 bucket.
      */
    var Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * S3 object key name.
      */
    var Name: js.UndefOr[S3ObjectName] = js.undefined
    /**
      * If the bucket is versioning enabled, you can specify the object version. 
      */
    var Version: js.UndefOr[S3ObjectVersion] = js.undefined
  }
  
  trait SearchFacesByImageRequest extends js.Object {
    /**
      * ID of the collection to search.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
    /**
      * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%.
      */
    var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
    /**
      * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
      */
    var Image: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Image
    /**
      * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
      */
    var MaxFaces: js.UndefOr[MaxFaces] = js.undefined
  }
  
  trait SearchFacesByImageResponse extends js.Object {
    /**
      * An array of faces that match the input face, along with the confidence in the match.
      */
    var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
    /**
      * Version number of the face detection model associated with the input collection (CollectionId).
      */
    var FaceModelVersion: js.UndefOr[String] = js.undefined
    /**
      * The bounding box around the face in the input image that Amazon Rekognition used for the search.
      */
    var SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.undefined
    /**
      * The level of confidence that the searchedFaceBoundingBox, contains a face.
      */
    var SearchedFaceConfidence: js.UndefOr[Percent] = js.undefined
  }
  
  trait SearchFacesRequest extends js.Object {
    /**
      * ID of the collection the face belongs to.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
    /**
      * ID of a face to find matches for in the collection.
      */
    var FaceId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.FaceId
    /**
      * Optional value specifying the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%.
      */
    var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
    /**
      * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
      */
    var MaxFaces: js.UndefOr[MaxFaces] = js.undefined
  }
  
  trait SearchFacesResponse extends js.Object {
    /**
      * An array of faces that matched the input face, along with the confidence in the match.
      */
    var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
    /**
      * Version number of the face detection model associated with the input collection (CollectionId).
      */
    var FaceModelVersion: js.UndefOr[String] = js.undefined
    /**
      * ID of the face that was searched for matches in a collection.
      */
    var SearchedFaceId: js.UndefOr[FaceId] = js.undefined
  }
  
  trait Smile extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the face is smiling or not.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait StartCelebrityRecognitionRequest extends js.Object {
    /**
      * Idempotent token used to identify the start request. If you use the same token with multiple StartCelebrityRecognition requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the celebrity recognition analysis to.
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    /**
      * The video in which you want to recognize celebrities. The video must be stored in an Amazon S3 bucket.
      */
    var Video: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Video
  }
  
  trait StartCelebrityRecognitionResponse extends js.Object {
    /**
      * The identifier for the celebrity recognition analysis job. Use JobId to identify the job in a subsequent call to GetCelebrityRecognition.
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartContentModerationRequest extends js.Object {
    /**
      * Idempotent token used to identify the start request. If you use the same token with multiple StartContentModeration requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content labels with a confidence level lower than this specified value. If you don't specify MinConfidence, GetContentModeration returns labels with confidence values greater than or equal to 50 percent.
      */
    var MinConfidence: js.UndefOr[Percent] = js.undefined
    /**
      * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the content moderation analysis to.
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    /**
      * The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
      */
    var Video: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Video
  }
  
  trait StartContentModerationResponse extends js.Object {
    /**
      * The identifier for the content moderation analysis job. Use JobId to identify the job in a subsequent call to GetContentModeration.
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartFaceDetectionRequest extends js.Object {
    /**
      * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The face attributes you want returned.  DEFAULT - The following subset of facial attributes are returned: BoundingBox, Confidence, Pose, Quality and Landmarks.   ALL - All facial attributes are returned.
      */
    var FaceAttributes: js.UndefOr[FaceAttributes] = js.undefined
    /**
      * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the face detection operation.
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    /**
      * The video in which you want to detect faces. The video must be stored in an Amazon S3 bucket.
      */
    var Video: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Video
  }
  
  trait StartFaceDetectionResponse extends js.Object {
    /**
      * The identifier for the face detection job. Use JobId to identify the job in a subsequent call to GetFaceDetection.
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartFaceSearchRequest extends js.Object {
    /**
      * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceSearch requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * ID of the collection that contains the faces you want to search for.
      */
    var CollectionId: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CollectionId
    /**
      * The minimum confidence in the person match to return. For example, don't return any matches where confidence in matches is less than 70%. 
      */
    var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
    /**
      * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the search. 
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    /**
      * The video you want to search. The video must be stored in an Amazon S3 bucket. 
      */
    var Video: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Video
  }
  
  trait StartFaceSearchResponse extends js.Object {
    /**
      * The identifier for the search job. Use JobId to identify the job in a subsequent call to GetFaceSearch. 
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartLabelDetectionRequest extends js.Object {
    /**
      * Idempotent token used to identify the start request. If you use the same token with multiple StartLabelDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected label. Confidence represents how certain Amazon Rekognition is that a label is correctly identified.0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any labels with a confidence level lower than this specified value. If you don't specify MinConfidence, the operation returns labels with confidence values greater than or equal to 50 percent.
      */
    var MinConfidence: js.UndefOr[Percent] = js.undefined
    /**
      * The Amazon SNS topic ARN you want Amazon Rekognition Video to publish the completion status of the label detection operation to. 
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    /**
      * The video in which you want to detect labels. The video must be stored in an Amazon S3 bucket.
      */
    var Video: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Video
  }
  
  trait StartLabelDetectionResponse extends js.Object {
    /**
      * The identifier for the label detection job. Use JobId to identify the job in a subsequent call to GetLabelDetection. 
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartPersonTrackingRequest extends js.Object {
    /**
      * Idempotent token used to identify the start request. If you use the same token with multiple StartPersonTracking requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
      */
    var JobTag: js.UndefOr[JobTag] = js.undefined
    /**
      * The Amazon SNS topic ARN you want Amazon Rekognition Video to publish the completion status of the people detection operation to.
      */
    var NotificationChannel: js.UndefOr[NotificationChannel] = js.undefined
    /**
      * The video in which you want to detect people. The video must be stored in an Amazon S3 bucket.
      */
    var Video: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.Video
  }
  
  trait StartPersonTrackingResponse extends js.Object {
    /**
      * The identifier for the person detection job. Use JobId to identify the job in a subsequent call to GetPersonTracking.
      */
    var JobId: js.UndefOr[JobId] = js.undefined
  }
  
  trait StartStreamProcessorRequest extends js.Object {
    /**
      * The name of the stream processor to start processing.
      */
    var Name: StreamProcessorName
  }
  
  trait StartStreamProcessorResponse extends js.Object
  
  trait StopStreamProcessorRequest extends js.Object {
    /**
      * The name of a stream processor created by CreateStreamProcessor.
      */
    var Name: StreamProcessorName
  }
  
  trait StopStreamProcessorResponse extends js.Object
  
  trait StreamProcessor extends js.Object {
    /**
      * Name of the Amazon Rekognition stream processor. 
      */
    var Name: js.UndefOr[StreamProcessorName] = js.undefined
    /**
      * Current status of the Amazon Rekognition stream processor.
      */
    var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
  }
  
  trait StreamProcessorInput extends js.Object {
    /**
      * The Kinesis video stream input stream for the source streaming video.
      */
    var KinesisVideoStream: js.UndefOr[KinesisVideoStream] = js.undefined
  }
  
  trait StreamProcessorOutput extends js.Object {
    /**
      * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition stream processor streams the analysis results.
      */
    var KinesisDataStream: js.UndefOr[KinesisDataStream] = js.undefined
  }
  
  trait StreamProcessorSettings extends js.Object {
    /**
      * Face search settings to use on a streaming video. 
      */
    var FaceSearch: js.UndefOr[FaceSearchSettings] = js.undefined
  }
  
  trait Sunglasses extends js.Object {
    /**
      * Level of confidence in the determination.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * Boolean value that indicates whether the face is wearing sunglasses or not.
      */
    var Value: js.UndefOr[Boolean] = js.undefined
  }
  
  trait TextDetection extends js.Object {
    /**
      * The confidence that Amazon Rekognition has in the accuracy of the detected text and the accuracy of the geometry points around the detected text.
      */
    var Confidence: js.UndefOr[Percent] = js.undefined
    /**
      * The word or line of text recognized by Amazon Rekognition. 
      */
    var DetectedText: js.UndefOr[String] = js.undefined
    /**
      * The location of the detected text on the image. Includes an axis aligned coarse bounding box surrounding the text and a finer grain polygon for more accurate spatial information.
      */
    var Geometry: js.UndefOr[Geometry] = js.undefined
    /**
      * The identifier for the detected text. The identifier is only unique for a single call to DetectText. 
      */
    var Id: js.UndefOr[UInteger] = js.undefined
    /**
      * The Parent identifier for the detected text identified by the value of ID. If the type of detected text is LINE, the value of ParentId is Null. 
      */
    var ParentId: js.UndefOr[UInteger] = js.undefined
    /**
      * The type of text that was detected.
      */
    var Type: js.UndefOr[TextTypes] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.    If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
      */
    def compareFaces(): awsDashSdkLib.libRequestMod.Request[CompareFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def compareFaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompareFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompareFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.    If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
      */
    def compareFaces(params: CompareFacesRequest): awsDashSdkLib.libRequestMod.Request[CompareFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def compareFaces(
      params: CompareFacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompareFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompareFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action.
      */
    def createCollection(): awsDashSdkLib.libRequestMod.Request[CreateCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCollection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCollectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action.
      */
    def createCollection(params: CreateCollectionRequest): awsDashSdkLib.libRequestMod.Request[CreateCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCollection(
      params: CreateCollectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCollectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data Streams. You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream. You also specify the face recognition criteria in Settings. For example, the collection containing faces that you want to recognize. Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling StartStreamProcessor with the Name field.  After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing. You can delete the stream processor by calling DeleteStreamProcessor.
      */
    def createStreamProcessor(): awsDashSdkLib.libRequestMod.Request[CreateStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamProcessor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data Streams. You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream. You also specify the face recognition criteria in Settings. For example, the collection containing faces that you want to recognize. Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling StartStreamProcessor with the Name field.  After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing. You can delete the stream processor by calling DeleteStreamProcessor.
      */
    def createStreamProcessor(params: CreateStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamProcessor(
      params: CreateStreamProcessorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see delete-collection-procedure. This operation requires permissions to perform the rekognition:DeleteCollection action.
      */
    def deleteCollection(): awsDashSdkLib.libRequestMod.Request[DeleteCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCollection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCollectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see delete-collection-procedure. This operation requires permissions to perform the rekognition:DeleteCollection action.
      */
    def deleteCollection(params: DeleteCollectionRequest): awsDashSdkLib.libRequestMod.Request[DeleteCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCollection(
      params: DeleteCollectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCollectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
      */
    def deleteFaces(): awsDashSdkLib.libRequestMod.Request[DeleteFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
      */
    def deleteFaces(params: DeleteFacesRequest): awsDashSdkLib.libRequestMod.Request[DeleteFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFaces(
      params: DeleteFacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
      */
    def deleteStreamProcessor(): awsDashSdkLib.libRequestMod.Request[DeleteStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStreamProcessor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
      */
    def deleteStreamProcessor(params: DeleteStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[DeleteStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStreamProcessor(
      params: DeleteStreamProcessorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
      */
    def describeCollection(): awsDashSdkLib.libRequestMod.Request[DescribeCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCollection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCollectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
      */
    def describeCollection(params: DescribeCollectionRequest): awsDashSdkLib.libRequestMod.Request[DescribeCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCollection(
      params: DescribeCollectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCollectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCollectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information about a stream processor created by CreateStreamProcessor. You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
      */
    def describeStreamProcessor(): awsDashSdkLib.libRequestMod.Request[DescribeStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStreamProcessor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information about a stream processor created by CreateStreamProcessor. You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
      */
    def describeStreamProcessor(params: DescribeStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[DescribeStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStreamProcessor(
      params: DescribeStreamProcessorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), gender, presence of beard, sunglasses, and so on.  The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
      */
    def detectFaces(): awsDashSdkLib.libRequestMod.Request[DetectFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectFaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), gender, presence of beard, sunglasses, and so on.  The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
      */
    def detectFaces(params: DetectFacesRequest): awsDashSdkLib.libRequestMod.Request[DetectFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectFaces(
      params: DetectFacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.   DetectLabels does not support the detection of activities. However, activity detection is supported for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer Guide.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and the level of confidence that the image contains the object. For example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object.   {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  In the preceding example, the operation returns one label for each of the three objects. The operation can also return multiple labels for the same object in the image. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip. In response, the API returns an array of labels. In addition, the response also includes the orientation correction. Optionally, you can specify MinConfidence to control the confidence threshold for the labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of labels returned.   If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.   DetectLabels returns bounding boxes for instances of common object labels in an array of Instance objects. An Instance object contains a BoundingBox object, for the location of the label on the image. It also includes the confidence by which the bounding box was detected.  DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each ancestor is a unique label in the response. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
      */
    def detectLabels(): awsDashSdkLib.libRequestMod.Request[DetectLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectLabels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.   DetectLabels does not support the detection of activities. However, activity detection is supported for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer Guide.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and the level of confidence that the image contains the object. For example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object.   {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  In the preceding example, the operation returns one label for each of the three objects. The operation can also return multiple labels for the same object in the image. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip. In response, the API returns an array of labels. In addition, the response also includes the orientation correction. Optionally, you can specify MinConfidence to control the confidence threshold for the labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of labels returned.   If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.   DetectLabels returns bounding boxes for instances of common object labels in an array of Instance objects. An Instance object contains a BoundingBox object, for the location of the label on the image. It also includes the confidence by which the bounding box was detected.  DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each ancestor is a unique label in the response. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
      */
    def detectLabels(params: DetectLabelsRequest): awsDashSdkLib.libRequestMod.Request[DetectLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectLabels(
      params: DetectLabelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
      */
    def detectModerationLabels(): awsDashSdkLib.libRequestMod.Request[DetectModerationLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectModerationLabels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectModerationLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectModerationLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
      */
    def detectModerationLabels(params: DetectModerationLabelsRequest): awsDashSdkLib.libRequestMod.Request[DetectModerationLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectModerationLabels(
      params: DetectModerationLabelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectModerationLabelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectModerationLabelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of TextDetection elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText can detect up to 50 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see DetectText in the Amazon Rekognition Developer Guide.
      */
    def detectText(): awsDashSdkLib.libRequestMod.Request[DetectTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectText(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectTextResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of TextDetection elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText can detect up to 50 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see DetectText in the Amazon Rekognition Developer Guide.
      */
    def detectText(params: DetectTextRequest): awsDashSdkLib.libRequestMod.Request[DetectTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectText(
      params: DetectTextRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectTextResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
      */
    def getCelebrityInfo(): awsDashSdkLib.libRequestMod.Request[GetCelebrityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCelebrityInfo(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCelebrityInfoResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCelebrityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
      */
    def getCelebrityInfo(params: GetCelebrityInfoRequest): awsDashSdkLib.libRequestMod.Request[GetCelebrityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCelebrityInfo(
      params: GetCelebrityInfoRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCelebrityInfoResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCelebrityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by StartCelebrityRecognition. Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to StartCelebrityRecognition which returns a job identifier (JobId). When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains information about the celebrity in a CelebrityDetail object and the time, Timestamp, the celebrity was detected.    GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
      */
    def getCelebrityRecognition(): awsDashSdkLib.libRequestMod.Request[GetCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCelebrityRecognition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCelebrityRecognitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by StartCelebrityRecognition. Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to StartCelebrityRecognition which returns a job identifier (JobId). When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains information about the celebrity in a CelebrityDetail object and the time, Timestamp, the celebrity was detected.    GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
      */
    def getCelebrityRecognition(params: GetCelebrityRecognitionRequest): awsDashSdkLib.libRequestMod.Request[GetCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCelebrityRecognition(
      params: GetCelebrityRecognitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCelebrityRecognitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the content moderation analysis results for a Amazon Rekognition Video analysis started by StartContentModeration. Content moderation analysis of a video is an asynchronous operation. You start analysis by calling StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected content moderation labels, and the time they are detected, in an array, ModerationLabels, of ContentModerationDetection objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
      */
    def getContentModeration(): awsDashSdkLib.libRequestMod.Request[GetContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContentModeration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContentModerationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the content moderation analysis results for a Amazon Rekognition Video analysis started by StartContentModeration. Content moderation analysis of a video is an asynchronous operation. You start analysis by calling StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected content moderation labels, and the time they are detected, in an array, ModerationLabels, of ContentModerationDetection objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
      */
    def getContentModeration(params: GetContentModerationRequest): awsDashSdkLib.libRequestMod.Request[GetContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContentModeration(
      params: GetContentModerationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContentModerationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection. Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling StartFaceDetection which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
      */
    def getFaceDetection(): awsDashSdkLib.libRequestMod.Request[GetFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFaceDetection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFaceDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection. Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling StartFaceDetection which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
      */
    def getFaceDetection(params: GetFaceDetectionRequest): awsDashSdkLib.libRequestMod.Request[GetFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFaceDetection(
      params: GetFaceDetectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFaceDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of PersonMatch objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
      */
    def getFaceSearch(): awsDashSdkLib.libRequestMod.Request[GetFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFaceSearch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFaceSearchResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of PersonMatch objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
      */
    def getFaceSearch(params: GetFaceSearchRequest): awsDashSdkLib.libRequestMod.Request[GetFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFaceSearch(
      params: GetFaceSearchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFaceSearchResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.  The label detection operation is started by a call to StartLabelDetection which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and the time the label was detected in the video. The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected labels, and the version of the label model used for detection. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.
      */
    def getLabelDetection(): awsDashSdkLib.libRequestMod.Request[GetLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLabelDetection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLabelDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.  The label detection operation is started by a call to StartLabelDetection which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and the time the label was detected in the video. The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected labels, and the version of the label model used for detection. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.
      */
    def getLabelDetection(params: GetLabelDetectionRequest): awsDashSdkLib.libRequestMod.Request[GetLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLabelDetection(
      params: GetLabelDetectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLabelDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking. The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
      */
    def getPersonTracking(): awsDashSdkLib.libRequestMod.Request[GetPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPersonTracking(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPersonTrackingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking. The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
      */
    def getPersonTracking(params: GetPersonTrackingRequest): awsDashSdkLib.libRequestMod.Request[GetPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPersonTracking(
      params: GetPersonTrackingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPersonTrackingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the SearchFaces and SearchFacesByImage operations. For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call DescribeCollection.  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call DescribeCollection and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageID for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the ListFaces operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. By default, IndexFaces filters detected faces. You can also explicitly filter detected faces by specifying AUTO for the value of QualityFilter. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model. To get the version of the face model associated with a collection, call DescribeCollection.   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, FaceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request all facial attributes (by using the detectionAttributes parameter), Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth) and other facial attributes like gender. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
      */
    def indexFaces(): awsDashSdkLib.libRequestMod.Request[IndexFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def indexFaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IndexFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IndexFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the SearchFaces and SearchFacesByImage operations. For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call DescribeCollection.  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call DescribeCollection and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageID for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the ListFaces operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. By default, IndexFaces filters detected faces. You can also explicitly filter detected faces by specifying AUTO for the value of QualityFilter. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model. To get the version of the face model associated with a collection, call DescribeCollection.   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, FaceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request all facial attributes (by using the detectionAttributes parameter), Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth) and other facial attributes like gender. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
      */
    def indexFaces(params: IndexFacesRequest): awsDashSdkLib.libRequestMod.Request[IndexFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def indexFaces(
      params: IndexFacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IndexFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IndexFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing Collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
      */
    def listCollections(): awsDashSdkLib.libRequestMod.Request[ListCollectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCollections(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCollectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCollectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing Collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
      */
    def listCollections(params: ListCollectionsRequest): awsDashSdkLib.libRequestMod.Request[ListCollectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCollections(
      params: ListCollectionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCollectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCollectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
      */
    def listFaces(): awsDashSdkLib.libRequestMod.Request[ListFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
      */
    def listFaces(params: ListFacesRequest): awsDashSdkLib.libRequestMod.Request[ListFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFaces(
      params: ListFacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of stream processors that you have created with CreateStreamProcessor. 
      */
    def listStreamProcessors(): awsDashSdkLib.libRequestMod.Request[ListStreamProcessorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreamProcessors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamProcessorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamProcessorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of stream processors that you have created with CreateStreamProcessor. 
      */
    def listStreamProcessors(params: ListStreamProcessorsRequest): awsDashSdkLib.libRequestMod.Request[ListStreamProcessorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreamProcessors(
      params: ListStreamProcessorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamProcessorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamProcessorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the GetCelebrityInfo operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
      */
    def recognizeCelebrities(): awsDashSdkLib.libRequestMod.Request[RecognizeCelebritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def recognizeCelebrities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RecognizeCelebritiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RecognizeCelebritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the GetCelebrityInfo operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
      */
    def recognizeCelebrities(params: RecognizeCelebritiesRequest): awsDashSdkLib.libRequestMod.Request[RecognizeCelebritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def recognizeCelebrities(
      params: RecognizeCelebritiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RecognizeCelebritiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RecognizeCelebritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
      */
    def searchFaces(): awsDashSdkLib.libRequestMod.Request[SearchFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchFaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
      */
    def searchFaces(params: SearchFacesRequest): awsDashSdkLib.libRequestMod.Request[SearchFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchFaces(
      params: SearchFacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchFacesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchFacesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the face IDs returned in subsequent calls to the SearchFaces operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFacesByImage action.
      */
    def searchFacesByImage(): awsDashSdkLib.libRequestMod.Request[SearchFacesByImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchFacesByImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchFacesByImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchFacesByImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the face IDs returned in subsequent calls to the SearchFaces operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFacesByImage action.
      */
    def searchFacesByImage(params: SearchFacesByImageRequest): awsDashSdkLib.libRequestMod.Request[SearchFacesByImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchFacesByImage(
      params: SearchFacesByImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchFacesByImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchFacesByImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
      */
    def startCelebrityRecognition(): awsDashSdkLib.libRequestMod.Request[StartCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startCelebrityRecognition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartCelebrityRecognitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
      */
    def startCelebrityRecognition(params: StartCelebrityRecognitionRequest): awsDashSdkLib.libRequestMod.Request[StartCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startCelebrityRecognition(
      params: StartCelebrityRecognitionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartCelebrityRecognitionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartCelebrityRecognitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Starts asynchronous detection of explicit or suggestive adult content in a stored video. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When content moderation analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
      */
    def startContentModeration(): awsDashSdkLib.libRequestMod.Request[StartContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startContentModeration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartContentModerationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Starts asynchronous detection of explicit or suggestive adult content in a stored video. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When content moderation analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
      */
    def startContentModeration(params: StartContentModerationRequest): awsDashSdkLib.libRequestMod.Request[StartContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startContentModeration(
      params: StartContentModerationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartContentModerationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartContentModerationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
      */
    def startFaceDetection(): awsDashSdkLib.libRequestMod.Request[StartFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFaceDetection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFaceDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
      */
    def startFaceDetection(params: StartFaceDetectionRequest): awsDashSdkLib.libRequestMod.Request[StartFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFaceDetection(
      params: StartFaceDetectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFaceDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFaceDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see procedure-person-search-videos.
      */
    def startFaceSearch(): awsDashSdkLib.libRequestMod.Request[StartFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFaceSearch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFaceSearchResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see procedure-person-search-videos.
      */
    def startFaceSearch(params: StartFaceSearchRequest): awsDashSdkLib.libRequestMod.Request[StartFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFaceSearch(
      params: StartFaceSearchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFaceSearchResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFaceSearchResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection. 
      */
    def startLabelDetection(): awsDashSdkLib.libRequestMod.Request[StartLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startLabelDetection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartLabelDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection. 
      */
    def startLabelDetection(params: StartLabelDetectionRequest): awsDashSdkLib.libRequestMod.Request[StartLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startLabelDetection(
      params: StartLabelDetectionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartLabelDetectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartLabelDetectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.
      */
    def startPersonTracking(): awsDashSdkLib.libRequestMod.Request[StartPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startPersonTracking(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartPersonTrackingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.
      */
    def startPersonTracking(params: StartPersonTrackingRequest): awsDashSdkLib.libRequestMod.Request[StartPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startPersonTracking(
      params: StartPersonTrackingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartPersonTrackingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartPersonTrackingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor.
      */
    def startStreamProcessor(): awsDashSdkLib.libRequestMod.Request[StartStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startStreamProcessor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor.
      */
    def startStreamProcessor(params: StartStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[StartStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startStreamProcessor(
      params: StartStreamProcessorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a running stream processor that was created by CreateStreamProcessor.
      */
    def stopStreamProcessor(): awsDashSdkLib.libRequestMod.Request[StopStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStreamProcessor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a running stream processor that was created by CreateStreamProcessor.
      */
    def stopStreamProcessor(params: StopStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[StopStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStreamProcessor(
      params: StopStreamProcessorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopStreamProcessorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopStreamProcessorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UnindexedFace extends js.Object {
    /**
      * The structure that contains attributes of a face that IndexFacesdetected, but didn't index. 
      */
    var FaceDetail: js.UndefOr[FaceDetail] = js.undefined
    /**
      * An array of reasons that specify why a face wasn't indexed.    EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from the camera.   EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the MaxFaces input parameter for IndexFaces.   LOW_BRIGHTNESS - The image is too dark.   LOW_SHARPNESS - The image is too blurry.   LOW_CONFIDENCE - The face was detected with a low confidence.   SMALL_BOUNDING_BOX - The bounding box around the face is too small.  
      */
    var Reasons: js.UndefOr[Reasons] = js.undefined
  }
  
  trait Video extends js.Object {
    /**
      * The Amazon S3 bucket name and file name for the video.
      */
    var S3Object: js.UndefOr[S3Object] = js.undefined
  }
  
  trait VideoMetadata extends js.Object {
    /**
      * Type of compression used in the analyzed video. 
      */
    var Codec: js.UndefOr[String] = js.undefined
    /**
      * Length of the video in milliseconds.
      */
    var DurationMillis: js.UndefOr[ULong] = js.undefined
    /**
      * Format of the analyzed video. Possible values are MP4, MOV and AVI. 
      */
    var Format: js.UndefOr[String] = js.undefined
    /**
      * Vertical pixel dimension of the video.
      */
    var FrameHeight: js.UndefOr[ULong] = js.undefined
    /**
      * Number of frames per second in the video.
      */
    var FrameRate: js.UndefOr[Float] = js.undefined
    /**
      * Horizontal pixel dimension of the video.
      */
    var FrameWidth: js.UndefOr[ULong] = js.undefined
  }
  
  trait _Attribute extends js.Object
  
  trait _CelebrityRecognitionSortBy extends js.Object
  
  trait _ContentModerationSortBy extends js.Object
  
  trait _EmotionName extends js.Object
  
  trait _FaceAttributes extends js.Object
  
  trait _FaceSearchSortBy extends js.Object
  
  trait _GenderType extends js.Object
  
  trait _LabelDetectionSortBy extends js.Object
  
  trait _LandmarkType extends js.Object
  
  trait _OrientationCorrection extends js.Object
  
  trait _PersonTrackingSortBy extends js.Object
  
  trait _QualityFilter extends js.Object
  
  trait _Reason extends js.Object
  
  trait _StreamProcessorStatus extends js.Object
  
  trait _TextTypes extends js.Object
  
  trait _VideoJobStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
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
  type ImageBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsRekognitionMod.Blob | java.lang.String
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

