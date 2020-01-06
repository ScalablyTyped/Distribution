package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketCorsRequest extends js.Object {
  /**
    * Specifies the bucket impacted by the corsconfiguration.
    */
  var Bucket: BucketName = js.native
  /**
    * Describes the cross-origin access configuration for objects in an Amazon S3 bucket. For more information, see Enabling Cross-Origin Resource Sharing in the Amazon Simple Storage Service Developer Guide.
    */
  var CORSConfiguration: typings.awsDashSdk.clientsS3Mod.CORSConfiguration = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to verify that the request body was not corrupted in transit. For more information, go to RFC 1864. 
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.native
}

object PutBucketCorsRequest {
  @scala.inline
  def apply(Bucket: BucketName, CORSConfiguration: CORSConfiguration, ContentMD5: ContentMD5 = null): PutBucketCorsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketCorsRequest]
  }
}

