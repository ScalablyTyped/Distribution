package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowTargetsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the targets in the maintenance window.
    */
  var Targets: js.UndefOr[MaintenanceWindowTargetList] = js.undefined
}

object DescribeMaintenanceWindowTargetsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Targets: MaintenanceWindowTargetList = null): DescribeMaintenanceWindowTargetsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[DescribeMaintenanceWindowTargetsResult]
  }
}

