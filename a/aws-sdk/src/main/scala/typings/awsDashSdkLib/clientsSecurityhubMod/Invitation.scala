package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends js.Object {
  /**
    * The account ID of the Security Hub master account that the invitation was sent from.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The ID of the invitation sent to the member account.
    */
  var InvitationId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp of when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current status of the association between member and master accounts.
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

