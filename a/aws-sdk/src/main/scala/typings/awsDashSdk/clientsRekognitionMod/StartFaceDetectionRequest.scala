package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFaceDetectionRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ClientRequestToken] = js.native
  /**
    * The face attributes you want returned.  DEFAULT - The following subset of facial attributes are returned: BoundingBox, Confidence, Pose, Quality and Landmarks.   ALL - All facial attributes are returned.
    */
  var FaceAttributes: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.FaceAttributes] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.JobTag] = js.native
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the face detection operation.
    */
  var NotificationChannel: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.NotificationChannel] = js.native
  /**
    * The video in which you want to detect faces. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typings.awsDashSdk.clientsRekognitionMod.Video = js.native
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
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (FaceAttributes != null) __obj.updateDynamic("FaceAttributes")(FaceAttributes.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag.asInstanceOf[js.Any])
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceDetectionRequest]
  }
}

