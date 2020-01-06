package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLifecycleConfigurationRequest extends js.Object {
  /**
    * The name of the bucket for which to set the configuration.
    */
  var Bucket: BucketName = js.native
  /**
    * Container for lifecycle rules. You can add as many as 1,000 rules.
    */
  var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] = js.native
}

object PutBucketLifecycleConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, LifecycleConfiguration: BucketLifecycleConfiguration = null): PutBucketLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (LifecycleConfiguration != null) __obj.updateDynamic("LifecycleConfiguration")(LifecycleConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
  }
}

