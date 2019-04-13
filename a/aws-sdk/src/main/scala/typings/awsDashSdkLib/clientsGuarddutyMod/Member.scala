package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var AccountId: awsDashSdkLib.clientsGuarddutyMod.AccountId
  var DetectorId: js.UndefOr[DetectorId] = js.undefined
  /**
    * Member account's email address.
    */
  var Email: awsDashSdkLib.clientsGuarddutyMod.Email
  /**
    * Timestamp at which the invitation was sent
    */
  var InvitedAt: js.UndefOr[InvitedAt] = js.undefined
  var MasterId: awsDashSdkLib.clientsGuarddutyMod.MasterId
  /**
    * The status of the relationship between the member and the master.
    */
  var RelationshipStatus: __string
  var UpdatedAt: awsDashSdkLib.clientsGuarddutyMod.UpdatedAt
}

object Member {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Email: Email,
    MasterId: MasterId,
    RelationshipStatus: __string,
    UpdatedAt: UpdatedAt,
    DetectorId: DetectorId = null,
    InvitedAt: InvitedAt = null
  ): Member = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, Email = Email, MasterId = MasterId, RelationshipStatus = RelationshipStatus, UpdatedAt = UpdatedAt)
    if (DetectorId != null) __obj.updateDynamic("DetectorId")(DetectorId)
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt)
    __obj.asInstanceOf[Member]
  }
}

