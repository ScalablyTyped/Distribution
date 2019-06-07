package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: awsDashSdkLib.clientsGuarddutyMod.AccountId
  /**
    * Member account's detector ID.
    */
  var DetectorId: js.UndefOr[DetectorId] = js.undefined
  /**
    * Member account's email address.
    */
  var Email: awsDashSdkLib.clientsGuarddutyMod.Email
  /**
    * Timestamp at which the invitation was sent
    */
  var InvitedAt: js.UndefOr[String] = js.undefined
  /**
    * Master account ID.
    */
  var MasterId: String
  /**
    * The status of the relationship between the member and the master.
    */
  var RelationshipStatus: String
  /**
    * Member last updated timestamp.
    */
  var UpdatedAt: String
}

object Member {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Email: Email,
    MasterId: String,
    RelationshipStatus: String,
    UpdatedAt: String,
    DetectorId: DetectorId = null,
    InvitedAt: String = null
  ): Member = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, Email = Email, MasterId = MasterId, RelationshipStatus = RelationshipStatus, UpdatedAt = UpdatedAt)
    if (DetectorId != null) __obj.updateDynamic("DetectorId")(DetectorId)
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt)
    __obj.asInstanceOf[Member]
  }
}

