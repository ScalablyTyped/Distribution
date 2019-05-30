package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends js.Object {
  /**
    * The account ID of the Security Hub master account that sent the invitation. 
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The ID of the invitation that the Security Hub master account sent.
    */
  var InvitationId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp of when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current relationship status between the inviter and invitee accounts.
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
}

object Invitation {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    InvitationId: NonEmptyString = null,
    InvitedAt: Timestamp = null,
    MemberStatus: NonEmptyString = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId)
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt)
    if (MemberStatus != null) __obj.updateDynamic("MemberStatus")(MemberStatus)
    __obj.asInstanceOf[Invitation]
  }
}

