package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportS3Location extends js.Object {
  /**
    * The S3 bucket name of the output reports.
    */
  var BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The path of the business report.
    */
  var Path: js.UndefOr[BusinessReportS3Path] = js.native
}

object BusinessReportS3Location {
  @scala.inline
  def apply(BucketName: CustomerS3BucketName = null, Path: BusinessReportS3Path = null): BusinessReportS3Location = {
    val __obj = js.Dynamic.literal()
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessReportS3Location]
  }
}

