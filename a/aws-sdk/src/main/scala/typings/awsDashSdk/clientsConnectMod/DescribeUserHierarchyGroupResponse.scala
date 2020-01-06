package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyGroupResponse extends js.Object {
  /**
    * Information about the hierarchy group.
    */
  var HierarchyGroup: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyGroup] = js.native
}

object DescribeUserHierarchyGroupResponse {
  @scala.inline
  def apply(HierarchyGroup: HierarchyGroup = null): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (HierarchyGroup != null) __obj.updateDynamic("HierarchyGroup")(HierarchyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
}

