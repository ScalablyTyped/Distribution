package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLifecycleRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName = js.native
  /**
    * 
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.native
  /**
    * 
    */
  var LifecycleConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LifecycleConfiguration] = js.native
}

object PutBucketLifecycleRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ContentMD5: ContentMD5 = null,
    LifecycleConfiguration: LifecycleConfiguration = null
  ): PutBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (LifecycleConfiguration != null) __obj.updateDynamic("LifecycleConfiguration")(LifecycleConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleRequest]
  }
}

