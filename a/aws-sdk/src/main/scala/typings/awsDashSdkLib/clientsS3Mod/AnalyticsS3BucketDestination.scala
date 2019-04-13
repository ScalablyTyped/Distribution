package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsS3BucketDestination extends js.Object {
  /**
    * The Amazon resource name (ARN) of the bucket to which data is exported.
    */
  var Bucket: BucketName
  /**
    * The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.
    */
  var BucketAccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The file format used when exporting data to Amazon S3.
    */
  var Format: AnalyticsS3ExportFileFormat
  /**
    * The prefix to use when exporting data. The exported data begins with this prefix.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
}

object AnalyticsS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Format: AnalyticsS3ExportFileFormat,
    BucketAccountId: AccountId = null,
    Prefix: Prefix = null
  ): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Format = Format.asInstanceOf[js.Any])
    if (BucketAccountId != null) __obj.updateDynamic("BucketAccountId")(BucketAccountId)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
}

