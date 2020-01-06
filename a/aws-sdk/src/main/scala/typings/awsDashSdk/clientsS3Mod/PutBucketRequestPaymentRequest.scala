package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketRequestPaymentRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.native
  /**
    * Container for Payer.
    */
  var RequestPaymentConfiguration: typings.awsDashSdk.clientsS3Mod.RequestPaymentConfiguration = js.native
}

object PutBucketRequestPaymentRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    RequestPaymentConfiguration: RequestPaymentConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutBucketRequestPaymentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketRequestPaymentRequest]
  }
}

