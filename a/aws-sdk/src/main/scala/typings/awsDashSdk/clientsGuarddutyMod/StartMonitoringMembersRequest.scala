package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMonitoringMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts whose findings you want the master account to monitor.
    */
  var AccountIds: typings.awsDashSdk.clientsGuarddutyMod.AccountIds
  /**
    * The unique ID of the detector of the GuardDuty account whom you want to re-enable to monitor members' findings.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object StartMonitoringMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): StartMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds, DetectorId = DetectorId)
  
    __obj.asInstanceOf[StartMonitoringMembersRequest]
  }
}

