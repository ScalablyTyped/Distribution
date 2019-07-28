package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMailboxPermissionsRequest extends js.Object {
  /**
    * The identifier of the member (user or group)that owns the mailbox.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The identifier of the member (user or group) for which to delete granted permissions.
    */
  var GranteeId: WorkMailIdentifier
  /**
    * The identifier of the organization under which the member (user or group) exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object DeleteMailboxPermissionsRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, GranteeId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId, GranteeId = GranteeId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DeleteMailboxPermissionsRequest]
  }
}

