package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutMailboxPermissionsRequest extends js.Object {
  /**
    * The identifier of the user, group, or resource for which to update mailbox permissions.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The identifier of the user, group, or resource to which to grant the permissions.
    */
  var GranteeId: WorkMailIdentifier
  /**
    * The identifier of the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
    */
  var PermissionValues: typings.awsDashSdk.clientsWorkmailMod.PermissionValues
}

object PutMailboxPermissionsRequest {
  @scala.inline
  def apply(
    EntityId: WorkMailIdentifier,
    GranteeId: WorkMailIdentifier,
    OrganizationId: OrganizationId,
    PermissionValues: PermissionValues
  ): PutMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId, GranteeId = GranteeId, OrganizationId = OrganizationId, PermissionValues = PermissionValues)
  
    __obj.asInstanceOf[PutMailboxPermissionsRequest]
  }
}

