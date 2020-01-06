package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptResourceShareInvitationResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * Information about the invitation.
    */
  var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.native
}

object AcceptResourceShareInvitationResponse {
  @scala.inline
  def apply(clientToken: String = null, resourceShareInvitation: ResourceShareInvitation = null): AcceptResourceShareInvitationResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (resourceShareInvitation != null) __obj.updateDynamic("resourceShareInvitation")(resourceShareInvitation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptResourceShareInvitationResponse]
  }
}

