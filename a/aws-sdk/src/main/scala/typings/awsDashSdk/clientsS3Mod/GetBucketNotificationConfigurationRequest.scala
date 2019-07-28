package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketNotificationConfigurationRequest extends js.Object {
  /**
    * Name of the bucket to get the notification configuration for.
    */
  var Bucket: BucketName
}

object GetBucketNotificationConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketNotificationConfigurationRequest]
  }
}

