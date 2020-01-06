package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedRoleRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string = js.native
}

object GetAssociatedRoleRequest {
  @scala.inline
  def apply(GroupId: __string): GetAssociatedRoleRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAssociatedRoleRequest]
  }
}

