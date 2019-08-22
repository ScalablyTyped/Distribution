package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartFaceSearchRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceSearch requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ClientRequestToken] = js.undefined
  /**
    * ID of the collection that contains the faces you want to search for.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId
  /**
    * The minimum confidence in the person match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.JobTag] = js.undefined
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the search. 
    */
  var NotificationChannel: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.NotificationChannel] = js.undefined
  /**
    * The video you want to search. The video must be stored in an Amazon S3 bucket. 
    */
  var Video: typings.awsDashSdk.clientsRekognitionMod.Video
}

object StartFaceSearchRequest {
  @scala.inline
  def apply(
    CollectionId: CollectionId,
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartFaceSearchRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId, Video = Video)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (!js.isUndefined(FaceMatchThreshold)) __obj.updateDynamic("FaceMatchThreshold")(FaceMatchThreshold)
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag)
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel)
    __obj.asInstanceOf[StartFaceSearchRequest]
  }
}

