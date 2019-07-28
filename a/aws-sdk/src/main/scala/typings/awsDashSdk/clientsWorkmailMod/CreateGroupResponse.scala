package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupResponse extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
}

object CreateGroupResponse {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier = null): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    __obj.asInstanceOf[CreateGroupResponse]
  }
}

