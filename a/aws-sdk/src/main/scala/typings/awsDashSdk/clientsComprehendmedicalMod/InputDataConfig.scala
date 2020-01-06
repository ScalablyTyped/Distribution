package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDataConfig extends js.Object {
  /**
    * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint that you are calling. Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
    */
  var S3Bucket: typings.awsDashSdk.clientsComprehendmedicalMod.S3Bucket = js.native
  /**
    * The path to the input data files in the S3 bucket.
    */
  var S3Key: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.S3Key] = js.native
}

object InputDataConfig {
  @scala.inline
  def apply(S3Bucket: S3Bucket, S3Key: S3Key = null): InputDataConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
}

