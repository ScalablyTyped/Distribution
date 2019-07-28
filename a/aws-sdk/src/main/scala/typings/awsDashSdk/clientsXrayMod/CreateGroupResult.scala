package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupResult extends js.Object {
  /**
    * The group that was created. Contains the name of the group that was created, the ARN of the group that was generated based on the group name, and the filter expression that was assigned to the group.
    */
  var Group: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Group] = js.undefined
}

object CreateGroupResult {
  @scala.inline
  def apply(Group: Group = null): CreateGroupResult = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[CreateGroupResult]
  }
}

