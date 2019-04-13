package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPublicAccessBlockRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to set.
    */
  var Bucket: BucketName
  /**
    * The MD5 hash of the PutPublicAccessBlock request body. 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" in the Amazon Simple Storage Service Developer Guide.
    */
  var PublicAccessBlockConfiguration: awsDashSdkLib.clientsS3Mod.PublicAccessBlockConfiguration
}

object PutPublicAccessBlockRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    PublicAccessBlockConfiguration: PublicAccessBlockConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, PublicAccessBlockConfiguration = PublicAccessBlockConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
}

