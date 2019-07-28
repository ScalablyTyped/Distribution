package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptHandshakeResponse extends js.Object {
  /**
    * A structure that contains details about the accepted handshake.
    */
  var Handshake: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Handshake] = js.undefined
}

object AcceptHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): AcceptHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake)
    __obj.asInstanceOf[AcceptHandshakeResponse]
  }
}

