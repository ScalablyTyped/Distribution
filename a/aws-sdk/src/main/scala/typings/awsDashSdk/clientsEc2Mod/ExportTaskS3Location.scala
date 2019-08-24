package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTaskS3Location extends js.Object {
  /**
    * The destination S3 bucket.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
}

object ExportTaskS3Location {
  @scala.inline
  def apply(S3Bucket: String = null, S3Prefix: String = null): ExportTaskS3Location = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix)
    __obj.asInstanceOf[ExportTaskS3Location]
  }
}

