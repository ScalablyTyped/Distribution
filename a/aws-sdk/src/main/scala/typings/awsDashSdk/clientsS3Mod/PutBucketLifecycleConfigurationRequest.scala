package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLifecycleConfigurationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] = js.undefined
}

object PutBucketLifecycleConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, LifecycleConfiguration: BucketLifecycleConfiguration = null): PutBucketLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (LifecycleConfiguration != null) __obj.updateDynamic("LifecycleConfiguration")(LifecycleConfiguration)
    __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
  }
}

