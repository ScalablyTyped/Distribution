package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var Video: awsDashSdkLib.clientsRekognitionMod.Video
}

object StartFaceDetectionRequest {
  @scala.inline
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    FaceAttributes: FaceAttributes = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartFaceDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (FaceAttributes != null) __obj.updateDynamic("FaceAttributes")(FaceAttributes.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartFaceDetectionRequest]
  }
}

