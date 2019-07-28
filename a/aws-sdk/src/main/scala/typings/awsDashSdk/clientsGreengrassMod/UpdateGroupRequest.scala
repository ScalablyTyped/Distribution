package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object UpdateGroupRequest {
  @scala.inline
  def apply(GroupId: __string, Name: __string = null): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

