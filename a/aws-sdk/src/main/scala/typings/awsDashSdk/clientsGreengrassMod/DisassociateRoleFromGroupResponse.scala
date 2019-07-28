package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateRoleFromGroupResponse extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the role was disassociated from the group.
    */
  var DisassociatedAt: js.UndefOr[__string] = js.undefined
}

object DisassociateRoleFromGroupResponse {
  @scala.inline
  def apply(DisassociatedAt: __string = null): DisassociateRoleFromGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DisassociatedAt != null) __obj.updateDynamic("DisassociatedAt")(DisassociatedAt)
    __obj.asInstanceOf[DisassociateRoleFromGroupResponse]
  }
}

