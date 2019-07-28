package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupResponse extends js.Object {
  /**
    * A structure containing details about the new group.
    */
  var Group: typings.awsDashSdk.clientsIamMod.Group
}

object CreateGroupResponse {
  @scala.inline
  def apply(Group: Group): CreateGroupResponse = {
    val __obj = js.Dynamic.literal(Group = Group)
  
    __obj.asInstanceOf[CreateGroupResponse]
  }
}

