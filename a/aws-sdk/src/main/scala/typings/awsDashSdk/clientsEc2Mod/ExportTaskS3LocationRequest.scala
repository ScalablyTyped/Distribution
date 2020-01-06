package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskS3LocationRequest extends js.Object {
  /**
    * The destination S3 bucket.
    */
  var S3Bucket: String = js.native
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}

object ExportTaskS3LocationRequest {
  @scala.inline
  def apply(S3Bucket: String, S3Prefix: String = null): ExportTaskS3LocationRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskS3LocationRequest]
  }
}

