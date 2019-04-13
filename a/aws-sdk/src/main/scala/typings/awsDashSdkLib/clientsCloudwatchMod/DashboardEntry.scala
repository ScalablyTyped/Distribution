package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[DashboardArn] = js.undefined
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[DashboardName] = js.undefined
  /**
    * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var LastModified: js.UndefOr[LastModified] = js.undefined
  /**
    * The size of the dashboard, in bytes.
    */
  var Size: js.UndefOr[Size] = js.undefined
}

object DashboardEntry {
  @scala.inline
  def apply(
    DashboardArn: DashboardArn = null,
    DashboardName: DashboardName = null,
    LastModified: LastModified = null,
    Size: js.UndefOr[Size] = js.undefined
  ): DashboardEntry = {
    val __obj = js.Dynamic.literal()
    if (DashboardArn != null) __obj.updateDynamic("DashboardArn")(DashboardArn)
    if (DashboardName != null) __obj.updateDynamic("DashboardName")(DashboardName)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[DashboardEntry]
  }
}

