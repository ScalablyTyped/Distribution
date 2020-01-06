package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketNotificationConfigurationRequest extends js.Object {
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  var NotificationConfiguration: typings.awsDashSdk.clientsS3Mod.NotificationConfiguration = js.native
}

object PutBucketNotificationConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, NotificationConfiguration: NotificationConfiguration): PutBucketNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketNotificationConfigurationRequest]
  }
}

