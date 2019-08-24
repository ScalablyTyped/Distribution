package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTaskS3LocationRequest extends js.Object {
  /**
    * The destination S3 bucket.
    */
  var S3Bucket: String
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
}

object ExportTaskS3LocationRequest {
  @scala.inline
  def apply(S3Bucket: String, S3Prefix: String = null): ExportTaskS3LocationRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket)
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix)
    __obj.asInstanceOf[ExportTaskS3LocationRequest]
  }
}

