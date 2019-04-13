package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteAccountToOrganizationResponse extends js.Object {
  /**
    * A structure that contains details about the handshake that is created to support this invitation request.
    */
  var Handshake: js.UndefOr[Handshake] = js.undefined
}

object InviteAccountToOrganizationResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): InviteAccountToOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake)
    __obj.asInstanceOf[InviteAccountToOrganizationResponse]
  }
}

