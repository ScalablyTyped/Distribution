package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketRequestPaymentRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * 
    */
  var RequestPaymentConfiguration: awsDashSdkLib.clientsS3Mod.RequestPaymentConfiguration
}

object PutBucketRequestPaymentRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    RequestPaymentConfiguration: RequestPaymentConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutBucketRequestPaymentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, RequestPaymentConfiguration = RequestPaymentConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketRequestPaymentRequest]
  }
}

