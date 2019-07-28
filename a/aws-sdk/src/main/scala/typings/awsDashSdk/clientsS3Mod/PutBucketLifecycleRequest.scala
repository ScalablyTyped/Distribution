package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLifecycleRequest extends js.Object {
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
  var LifecycleConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LifecycleConfiguration] = js.undefined
}

object PutBucketLifecycleRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ContentMD5: ContentMD5 = null,
    LifecycleConfiguration: LifecycleConfiguration = null
  ): PutBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (LifecycleConfiguration != null) __obj.updateDynamic("LifecycleConfiguration")(LifecycleConfiguration)
    __obj.asInstanceOf[PutBucketLifecycleRequest]
  }
}

