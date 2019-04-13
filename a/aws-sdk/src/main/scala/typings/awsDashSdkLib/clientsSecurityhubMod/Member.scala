package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  /**
    * The AWS account ID of a Security Hub member account.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The email of a Security Hub member account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Time stamp at which the member account was invited to Security Hub.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The AWS account ID of the master Security Hub account to this member account.
    */
  var MasterId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The status of the relationship between the member account and its master account. 
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Time stamp at which this member account was updated.
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

