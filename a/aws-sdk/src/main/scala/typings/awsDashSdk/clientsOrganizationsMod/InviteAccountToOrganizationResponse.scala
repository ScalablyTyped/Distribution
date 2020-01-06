package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccountToOrganizationResponse extends js.Object {
  /**
    * A structure that contains details about the handshake that is created to support this invitation request.
    */
  var Handshake: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Handshake] = js.native
}

object InviteAccountToOrganizationResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): InviteAccountToOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAccountToOrganizationResponse]
  }
}

