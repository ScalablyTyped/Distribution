package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var Video: awsDashSdkLib.clientsRekognitionMod.Video
}

object StartCelebrityRecognitionRequest {
  @scala.inline
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartCelebrityRecognitionRequest = {
    val __obj = js.Dynamic.literal(Video = Video)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartCelebrityRecognitionRequest]
  }
}

