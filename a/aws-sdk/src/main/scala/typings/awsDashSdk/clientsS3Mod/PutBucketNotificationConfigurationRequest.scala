package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketNotificationConfigurationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var NotificationConfiguration: typings.awsDashSdk.clientsS3Mod.NotificationConfiguration
}

object PutBucketNotificationConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, NotificationConfiguration: NotificationConfiguration): PutBucketNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, NotificationConfiguration = NotificationConfiguration)
  
    __obj.asInstanceOf[PutBucketNotificationConfigurationRequest]
  }
}

