package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketAccelerateConfigurationRequest extends js.Object {
  /**
    * Specifies the Accelerate Configuration you want to set for the bucket.
    */
  var AccelerateConfiguration: typings.awsDashSdk.clientsS3Mod.AccelerateConfiguration
  /**
    * Name of the bucket for which the accelerate configuration is set.
    */
  var Bucket: BucketName
}

object PutBucketAccelerateConfigurationRequest {
  @scala.inline
  def apply(AccelerateConfiguration: AccelerateConfiguration, Bucket: BucketName): PutBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration, Bucket = Bucket)
  
    __obj.asInstanceOf[PutBucketAccelerateConfigurationRequest]
  }
}

