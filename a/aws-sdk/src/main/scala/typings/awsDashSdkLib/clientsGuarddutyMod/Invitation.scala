package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends js.Object {
  /**
    * Inviter account ID
    */
  var AccountId: js.UndefOr[__string] = js.undefined
  /**
    * This value is used to validate the inviter account to the member account.
    */
  var InvitationId: js.UndefOr[InvitationId] = js.undefined
  /**
    * Timestamp at which the invitation was sent
    */
  var InvitedAt: js.UndefOr[InvitedAt] = js.undefined
  /**
    * The status of the relationship between the inviter and invitee accounts.
    */
  var RelationshipStatus: js.UndefOr[__string] = js.undefined
}

object Invitation {
  @scala.inline
  def apply(
    AccountId: __string = null,
    InvitationId: InvitationId = null,
    InvitedAt: InvitedAt = null,
    RelationshipStatus: __string = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId)
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt)
    if (RelationshipStatus != null) __obj.updateDynamic("RelationshipStatus")(RelationshipStatus)
    __obj.asInstanceOf[Invitation]
  }
}

