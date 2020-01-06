package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * Information about the maintenance windows.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.native
}

object DescribeMaintenanceWindowsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowIdentities: MaintenanceWindowIdentityList = null): DescribeMaintenanceWindowsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WindowIdentities != null) __obj.updateDynamic("WindowIdentities")(WindowIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowsResult]
  }
}

