package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMembersRequest extends js.Object {
  /**
    * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty account.
    */
  var AccountDetails: awsDashSdkLib.clientsGuarddutyMod.AccountDetails
  /**
    * The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
}

object CreateMembersRequest {
  @scala.inline
  def apply(AccountDetails: AccountDetails, DetectorId: DetectorId): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountDetails = AccountDetails, DetectorId = DetectorId)
  
    __obj.asInstanceOf[CreateMembersRequest]
  }
}

