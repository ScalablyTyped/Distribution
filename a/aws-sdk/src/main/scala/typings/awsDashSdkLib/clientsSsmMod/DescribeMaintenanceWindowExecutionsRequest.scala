package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowExecutionsRequest extends js.Object {
  /**
    * Each entry in the array is a structure containing: Key (string, between 1 and 128 characters) Values (array of strings, each string is between 1 and 256 characters) The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as 2016-11-04T05:00:00Z.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID of the maintenance window whose executions should be retrieved.
    */
  var WindowId: MaintenanceWindowId
}

object DescribeMaintenanceWindowExecutionsRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    Filters: MaintenanceWindowFilterList = null,
    MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowExecutionsRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
  }
}

