package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDashboardOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardArn] = js.undefined
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. For more information about the DashboardBody syntax, see CloudWatch-Dashboard-Body-Structure. 
    */
  var DashboardBody: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardBody] = js.undefined
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardName] = js.undefined
}

object GetDashboardOutput {
  @scala.inline
  def apply(
    DashboardArn: DashboardArn = null,
    DashboardBody: DashboardBody = null,
    DashboardName: DashboardName = null
  ): GetDashboardOutput = {
    val __obj = js.Dynamic.literal()
    if (DashboardArn != null) __obj.updateDynamic("DashboardArn")(DashboardArn)
    if (DashboardBody != null) __obj.updateDynamic("DashboardBody")(DashboardBody)
    if (DashboardName != null) __obj.updateDynamic("DashboardName")(DashboardName)
    __obj.asInstanceOf[GetDashboardOutput]
  }
}

