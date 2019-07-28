package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserHierarchyStructureResponse extends js.Object {
  /**
    * A HierarchyStructure object.
    */
  var HierarchyStructure: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyStructure] = js.undefined
}

object DescribeUserHierarchyStructureResponse {
  @scala.inline
  def apply(HierarchyStructure: HierarchyStructure = null): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    if (HierarchyStructure != null) __obj.updateDynamic("HierarchyStructure")(HierarchyStructure)
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
}

