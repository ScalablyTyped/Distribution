package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInvitationRequest extends js.Object {
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * This value is used to validate the master account to the member account.
    */
  var InvitationId: String
  /**
    * The account ID of the master GuardDuty account whose invitation you're accepting.
    */
  var MasterId: String
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, InvitationId: String, MasterId: String): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, InvitationId = InvitationId, MasterId = MasterId)
  
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
}

