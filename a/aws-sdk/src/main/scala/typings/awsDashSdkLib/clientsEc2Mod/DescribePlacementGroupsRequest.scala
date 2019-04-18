package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlacementGroupsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The filters.    group-name - The name of the placement group.    state - The state of the placement group (pending | available | deleting | deleted).    strategy - The strategy of the placement group (cluster | spread | partition).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The names of the placement groups. Default: Describes all your placement groups, or only those otherwise specified.
    */
  var GroupNames: js.UndefOr[PlacementGroupStringList] = js.undefined
}

object DescribePlacementGroupsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    GroupNames: PlacementGroupStringList = null
  ): DescribePlacementGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (GroupNames != null) __obj.updateDynamic("GroupNames")(GroupNames)
    __obj.asInstanceOf[DescribePlacementGroupsRequest]
  }
}

