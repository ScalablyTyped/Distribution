package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInvitationRequest extends js.Object {
  /**
    * The ID of the invitation sent from the Security Hub master account.
    */
  var InvitationId: NonEmptyString = js.native
  /**
    * The account ID of the Security Hub master account that sent the invitation.
    */
  var MasterId: NonEmptyString = js.native
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(InvitationId: NonEmptyString, MasterId: NonEmptyString): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
}

