package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyGroup extends js.Object {
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var GroupId: js.UndefOr[idType] = js.native
  /**
    * The name (friendly name, not ARN) identifying the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.native
}

object PolicyGroup {
  @scala.inline
  def apply(GroupId: idType = null, GroupName: groupNameType = null): PolicyGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGroup]
  }
}

