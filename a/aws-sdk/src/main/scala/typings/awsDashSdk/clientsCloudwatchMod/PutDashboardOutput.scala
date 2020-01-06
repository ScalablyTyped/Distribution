package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDashboardOutput extends js.Object {
  /**
    * If the input for PutDashboard was correct and the dashboard was successfully created or modified, this result is empty. If this result includes only warning messages, then the input was valid enough for the dashboard to be created or modified, but some elements of the dashboard may not render. If this result includes error messages, the input was not valid and the operation failed.
    */
  var DashboardValidationMessages: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardValidationMessages] = js.native
}

object PutDashboardOutput {
  @scala.inline
  def apply(DashboardValidationMessages: DashboardValidationMessages = null): PutDashboardOutput = {
    val __obj = js.Dynamic.literal()
    if (DashboardValidationMessages != null) __obj.updateDynamic("DashboardValidationMessages")(DashboardValidationMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDashboardOutput]
  }
}

