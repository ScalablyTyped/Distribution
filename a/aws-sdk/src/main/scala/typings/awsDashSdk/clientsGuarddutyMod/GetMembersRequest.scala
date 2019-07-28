package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to describe.
    */
  var AccountIds: typings.awsDashSdk.clientsGuarddutyMod.AccountIds
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to retrieve.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object GetMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds, DetectorId = DetectorId)
  
    __obj.asInstanceOf[GetMembersRequest]
  }
}

