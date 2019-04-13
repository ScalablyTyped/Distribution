package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyGroupSummary extends js.Object {
  /**
    * The ARN for the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The identifier of the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.undefined
  /**
    * The name of the hierarchy group.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.undefined
}

object HierarchyGroupSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: HierarchyGroupId = null, Name: HierarchyGroupName = null): HierarchyGroupSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[HierarchyGroupSummary]
  }
}

