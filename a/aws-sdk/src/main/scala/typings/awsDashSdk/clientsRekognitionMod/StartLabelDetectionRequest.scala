package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLabelDetectionRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartLabelDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ClientRequestToken] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.JobTag] = js.native
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected label. Confidence represents how certain Amazon Rekognition is that a label is correctly identified.0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any labels with a confidence level lower than this specified value. If you don't specify MinConfidence, the operation returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
  /**
    * The Amazon SNS topic ARN you want Amazon Rekognition Video to publish the completion status of the label detection operation to. 
    */
  var NotificationChannel: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.NotificationChannel] = js.native
  /**
    * The video in which you want to detect labels. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typings.awsDashSdk.clientsRekognitionMod.Video = js.native
}

object StartLabelDetectionRequest {
  @scala.inline
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    MinConfidence: Int | Double = null,
    NotificationChannel: NotificationChannel = null
  ): StartLabelDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag.asInstanceOf[js.Any])
    if (MinConfidence != null) __obj.updateDynamic("MinConfidence")(MinConfidence.asInstanceOf[js.Any])
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLabelDetectionRequest]
  }
}

