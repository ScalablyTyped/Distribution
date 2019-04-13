package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserHierarchyGroupResponse extends js.Object {
  /**
    * Returns a HierarchyGroup object.
    */
  var HierarchyGroup: js.UndefOr[HierarchyGroup] = js.undefined
}

object DescribeUserHierarchyGroupResponse {
  @scala.inline
  def apply(HierarchyGroup: HierarchyGroup = null): DescribeUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (HierarchyGroup != null) __obj.updateDynamic("HierarchyGroup")(HierarchyGroup)
    __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
  }
}

