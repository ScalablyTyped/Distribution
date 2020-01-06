package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelHandshakeResponse extends js.Object {
  /**
    * A structure that contains details about the handshake that you canceled.
    */
  var Handshake: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Handshake] = js.native
}

object CancelHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): CancelHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelHandshakeResponse]
  }
}

