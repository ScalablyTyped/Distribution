package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectInvitationInput extends js.Object {
  /**
    * The unique identifier of the invitation to reject.
    */
  var InvitationId: ResourceIdString
}

object RejectInvitationInput {
  @scala.inline
  def apply(InvitationId: ResourceIdString): RejectInvitationInput = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId)
  
    __obj.asInstanceOf[RejectInvitationInput]
  }
}

