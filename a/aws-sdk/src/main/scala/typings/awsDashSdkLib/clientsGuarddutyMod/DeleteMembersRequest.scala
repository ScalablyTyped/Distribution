package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to delete.
    */
  var AccountIds: awsDashSdkLib.clientsGuarddutyMod.AccountIds
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to delete.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
}

object DeleteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds, DetectorId = DetectorId)
  
    __obj.asInstanceOf[DeleteMembersRequest]
  }
}

