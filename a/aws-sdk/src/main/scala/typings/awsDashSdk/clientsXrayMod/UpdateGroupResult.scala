package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupResult extends js.Object {
  /**
    * The group that was updated. Contains the name of the group that was updated, the ARN of the group that was updated, and the updated filter expression assigned to the group.
    */
  var Group: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Group] = js.undefined
}

object UpdateGroupResult {
  @scala.inline
  def apply(Group: Group = null): UpdateGroupResult = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[UpdateGroupResult]
  }
}

