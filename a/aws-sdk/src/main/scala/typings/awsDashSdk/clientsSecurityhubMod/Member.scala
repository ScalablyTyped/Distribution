package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  /**
    * The AWS account ID of the member account.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.AccountId] = js.undefined
  /**
    * The email address of the member account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A timestamp for the date and time when the invitation was sent to the member account.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The AWS account ID of the Security Hub master account associated with this member account.
    */
  var MasterId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The status of the relationship between the member account and its master account. 
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp for the date and time when the member account was updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    Email: NonEmptyString = null,
    InvitedAt: Timestamp = null,
    MasterId: NonEmptyString = null,
    MemberStatus: NonEmptyString = null,
    UpdatedAt: Timestamp = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt)
    if (MasterId != null) __obj.updateDynamic("MasterId")(MasterId)
    if (MemberStatus != null) __obj.updateDynamic("MemberStatus")(MemberStatus)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    __obj.asInstanceOf[Member]
  }
}

