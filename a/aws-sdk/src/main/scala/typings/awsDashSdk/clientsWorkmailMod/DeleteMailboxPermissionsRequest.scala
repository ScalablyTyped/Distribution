package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMailboxPermissionsRequest extends js.Object {
  /**
    * The identifier of the member (user or group)that owns the mailbox.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier of the member (user or group) for which to delete granted permissions.
    */
  var GranteeId: WorkMailIdentifier = js.native
  /**
    * The identifier of the organization under which the member (user or group) exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
}

object DeleteMailboxPermissionsRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, GranteeId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], GranteeId = GranteeId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMailboxPermissionsRequest]
  }
}

