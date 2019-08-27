package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInvitationRequest extends js.Object {
  /**
    * The ID of the invitation sent from the Security Hub master account.
    */
  var InvitationId: NonEmptyString
  /**
    * The account ID of the Security Hub master account that sent the invitation.
    */
  var MasterId: NonEmptyString
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(InvitationId: NonEmptyString, MasterId: NonEmptyString): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId, MasterId = MasterId)
  
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
}

