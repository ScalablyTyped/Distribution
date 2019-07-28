package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPersonTrackingRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartPersonTracking requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ClientRequestToken] = js.undefined
  /**
    * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple Notification Service topic. 
    */
  var JobTag: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.JobTag] = js.undefined
  /**
    * The Amazon SNS topic ARN you want Amazon Rekognition Video to publish the completion status of the people detection operation to.
    */
  var NotificationChannel: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.NotificationChannel] = js.undefined
  /**
    * The video in which you want to detect people. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typings.awsDashSdk.clientsRekognitionMod.Video
}

object StartPersonTrackingRequest {
  @scala.inline
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartPersonTrackingRequest = {
    val __obj = js.Dynamic.literal(Video = Video)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartPersonTrackingRequest]
  }
}

