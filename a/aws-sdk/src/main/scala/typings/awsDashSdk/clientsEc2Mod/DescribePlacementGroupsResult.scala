package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlacementGroupsResult extends js.Object {
  /**
    * Information about the placement groups.
    */
  var PlacementGroups: js.UndefOr[PlacementGroupList] = js.undefined
}

object DescribePlacementGroupsResult {
  @scala.inline
  def apply(PlacementGroups: PlacementGroupList = null): DescribePlacementGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (PlacementGroups != null) __obj.updateDynamic("PlacementGroups")(PlacementGroups)
    __obj.asInstanceOf[DescribePlacementGroupsResult]
  }
}

