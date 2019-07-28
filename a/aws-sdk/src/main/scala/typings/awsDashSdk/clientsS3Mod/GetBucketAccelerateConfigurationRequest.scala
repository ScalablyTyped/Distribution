package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAccelerateConfigurationRequest extends js.Object {
  /**
    * Name of the bucket for which the accelerate configuration is retrieved.
    */
  var Bucket: BucketName
}

object GetBucketAccelerateConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketAccelerateConfigurationRequest]
  }
}

