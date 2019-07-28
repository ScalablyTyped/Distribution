package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationStateResult extends js.Object {
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var ApplicationStatus: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.ApplicationStatus] = js.undefined
  /**
    * The timestamp when the application status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.undefined
}

object DescribeApplicationStateResult {
  @scala.inline
  def apply(ApplicationStatus: ApplicationStatus = null, LastUpdatedTime: UpdateDateTime = null): DescribeApplicationStateResult = {
    val __obj = js.Dynamic.literal()
    if (ApplicationStatus != null) __obj.updateDynamic("ApplicationStatus")(ApplicationStatus.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    __obj.asInstanceOf[DescribeApplicationStateResult]
  }
}

