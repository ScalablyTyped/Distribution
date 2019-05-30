package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowScheduleRequest extends js.Object {
  /**
    * Filters used to limit the range of results. For example, you can limit maintenance window executions to only those scheduled before or after a certain date and time.
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The type of resource you want to retrieve information about. For example, "INSTANCE".
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
  /**
    * The instance ID or key/value pair to retrieve information about.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The ID of the maintenance window to retrieve information about.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}

object DescribeMaintenanceWindowScheduleRequest {
  @scala.inline
  def apply(
    Filters: PatchOrchestratorFilterList = null,
    MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResourceType: MaintenanceWindowResourceType = null,
    Targets: Targets = null,
    WindowId: MaintenanceWindowId = null
  ): DescribeMaintenanceWindowScheduleRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleRequest]
  }
}

