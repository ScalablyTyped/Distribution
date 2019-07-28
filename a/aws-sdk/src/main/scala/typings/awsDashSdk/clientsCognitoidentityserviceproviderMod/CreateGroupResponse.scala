package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupResponse extends js.Object {
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.undefined
}

object CreateGroupResponse {
  @scala.inline
  def apply(Group: GroupType = null): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[CreateGroupResponse]
  }
}

