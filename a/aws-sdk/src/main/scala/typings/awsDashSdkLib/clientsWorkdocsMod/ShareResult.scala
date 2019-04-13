package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareResult extends js.Object {
  /**
    * The ID of the invited user.
    */
  var InviteePrincipalId: js.UndefOr[IdType] = js.undefined
  /**
    * The ID of the principal.
    */
  var PrincipalId: js.UndefOr[IdType] = js.undefined
  /**
    * The role.
    */
  var Role: js.UndefOr[RoleType] = js.undefined
  /**
    * The ID of the resource that was shared.
    */
  var ShareId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The status.
    */
  var Status: js.UndefOr[ShareStatusType] = js.undefined
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[MessageType] = js.undefined
}

object ShareResult {
  @scala.inline
  def apply(
    InviteePrincipalId: IdType = null,
    PrincipalId: IdType = null,
    Role: RoleType = null,
    ShareId: ResourceIdType = null,
    Status: ShareStatusType = null,
    StatusMessage: MessageType = null
  ): ShareResult = {
    val __obj = js.Dynamic.literal()
    if (InviteePrincipalId != null) __obj.updateDynamic("InviteePrincipalId")(InviteePrincipalId)
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId)
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (ShareId != null) __obj.updateDynamic("ShareId")(ShareId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ShareResult]
  }
}

