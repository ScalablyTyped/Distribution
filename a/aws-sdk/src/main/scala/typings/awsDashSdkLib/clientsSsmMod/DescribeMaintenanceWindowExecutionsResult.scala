package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the Maintenance Windows execution.
    */
  var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined
}

object DescribeMaintenanceWindowExecutionsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowExecutions: MaintenanceWindowExecutionList = null): DescribeMaintenanceWindowExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WindowExecutions != null) __obj.updateDynamic("WindowExecutions")(WindowExecutions)
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
  }
}

