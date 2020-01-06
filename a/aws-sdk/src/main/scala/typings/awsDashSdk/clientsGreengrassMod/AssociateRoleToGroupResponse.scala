package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRoleToGroupResponse extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the role ARN was associated with the group.
    */
  var AssociatedAt: js.UndefOr[__string] = js.native
}

object AssociateRoleToGroupResponse {
  @scala.inline
  def apply(AssociatedAt: __string = null): AssociateRoleToGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRoleToGroupResponse]
  }
}

