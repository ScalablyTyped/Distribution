package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteMembersRequest extends js.Object {
  /**
    * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
    */
  var AccountIds: typings.awsDashSdk.clientsGuarddutyMod.AccountIds
  /**
    * The unique ID of the detector of the GuardDuty account with which you want to invite members.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * A boolean value that specifies whether you want to disable email notification to the accounts that you’re inviting to GuardDuty as members.
    */
  var DisableEmailNotification: js.UndefOr[Boolean] = js.undefined
  /**
    * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object InviteMembersRequest {
  @scala.inline
  def apply(
    AccountIds: AccountIds,
    DetectorId: DetectorId,
    DisableEmailNotification: js.UndefOr[Boolean] = js.undefined,
    Message: String = null
  ): InviteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds, DetectorId = DetectorId)
    if (!js.isUndefined(DisableEmailNotification)) __obj.updateDynamic("DisableEmailNotification")(DisableEmailNotification)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[InviteMembersRequest]
  }
}

