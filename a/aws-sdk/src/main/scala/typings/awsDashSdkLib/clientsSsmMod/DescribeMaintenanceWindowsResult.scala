package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information about the maintenance windows.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.undefined
}

object DescribeMaintenanceWindowsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowIdentities: MaintenanceWindowIdentityList = null): DescribeMaintenanceWindowsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WindowIdentities != null) __obj.updateDynamic("WindowIdentities")(WindowIdentities)
    __obj.asInstanceOf[DescribeMaintenanceWindowsResult]
  }
}

