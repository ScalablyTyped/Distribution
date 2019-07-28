package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketNotificationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
  /**
    * 
    */
  var NotificationConfiguration: NotificationConfigurationDeprecated
}

object PutBucketNotificationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    NotificationConfiguration: NotificationConfigurationDeprecated,
    ContentMD5: ContentMD5 = null
  ): PutBucketNotificationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, NotificationConfiguration = NotificationConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketNotificationRequest]
  }
}

