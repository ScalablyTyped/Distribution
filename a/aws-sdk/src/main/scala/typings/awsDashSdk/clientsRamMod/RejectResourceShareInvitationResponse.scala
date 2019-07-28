package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectResourceShareInvitationResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the invitation.
    */
  var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
}

object RejectResourceShareInvitationResponse {
  @scala.inline
  def apply(clientToken: String = null, resourceShareInvitation: ResourceShareInvitation = null): RejectResourceShareInvitationResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (resourceShareInvitation != null) __obj.updateDynamic("resourceShareInvitation")(resourceShareInvitation)
    __obj.asInstanceOf[RejectResourceShareInvitationResponse]
  }
}

