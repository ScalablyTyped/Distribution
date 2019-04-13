package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelHandshakeResponse extends js.Object {
  /**
    * A structure that contains details about the handshake that you canceled.
    */
  var Handshake: js.UndefOr[Handshake] = js.undefined
}

object CancelHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): CancelHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake)
    __obj.asInstanceOf[CancelHandshakeResponse]
  }
}

