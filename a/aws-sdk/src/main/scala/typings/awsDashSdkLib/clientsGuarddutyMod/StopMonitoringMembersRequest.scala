package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopMonitoringMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts whose findings you want the master account to stop monitoring.
    */
  var AccountIds: awsDashSdkLib.clientsGuarddutyMod.AccountIds
  /**
    * The unique ID of the detector of the GuardDuty account that you want to stop from monitor members' findings.
    */
  var DetectorId: __string
}

object StopMonitoringMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: __string): StopMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds, DetectorId = DetectorId)
  
    __obj.asInstanceOf[StopMonitoringMembersRequest]
  }
}

