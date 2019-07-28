package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Information about the maintenance window targets and tasks an instance is associated with.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.undefined
}

object DescribeMaintenanceWindowsForTargetResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowIdentities: MaintenanceWindowsForTargetList = null): DescribeMaintenanceWindowsForTargetResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WindowIdentities != null) __obj.updateDynamic("WindowIdentities")(WindowIdentities)
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
  }
}

