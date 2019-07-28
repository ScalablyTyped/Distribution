package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessReportS3Location extends js.Object {
  /**
    * The S3 bucket name of the output reports.
    */
  var BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
  /**
    * The path of the business report.
    */
  var Path: js.UndefOr[BusinessReportS3Path] = js.undefined
}

object BusinessReportS3Location {
  @scala.inline
  def apply(BucketName: CustomerS3BucketName = null, Path: BusinessReportS3Path = null): BusinessReportS3Location = {
    val __obj = js.Dynamic.literal()
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[BusinessReportS3Location]
  }
}

