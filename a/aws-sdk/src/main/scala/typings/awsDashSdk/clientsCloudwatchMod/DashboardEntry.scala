package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardArn] = js.native
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DashboardName] = js.native
  /**
    * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.LastModified] = js.native
  /**
    * The size of the dashboard, in bytes.
    */
  var Size: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Size] = js.native
}

object DashboardEntry {
  @scala.inline
  def apply(
    DashboardArn: DashboardArn = null,
    DashboardName: DashboardName = null,
    LastModified: LastModified = null,
    Size: Int | Double = null
  ): DashboardEntry = {
    val __obj = js.Dynamic.literal()
    if (DashboardArn != null) __obj.updateDynamic("DashboardArn")(DashboardArn.asInstanceOf[js.Any])
    if (DashboardName != null) __obj.updateDynamic("DashboardName")(DashboardName.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardEntry]
  }
}

