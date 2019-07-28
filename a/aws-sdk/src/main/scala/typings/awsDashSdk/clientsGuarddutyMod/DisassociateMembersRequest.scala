package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to disassociate from master.
    */
  var AccountIds: typings.awsDashSdk.clientsGuarddutyMod.AccountIds
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from master.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object DisassociateMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds, DetectorId = DetectorId)
  
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
}

