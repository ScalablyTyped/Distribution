package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclineHandshakeResponse extends js.Object {
  /**
    * A structure that contains details about the declined handshake. The state is updated to show the value DECLINED.
    */
  var Handshake: js.UndefOr[Handshake] = js.undefined
}

object DeclineHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): DeclineHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake)
    __obj.asInstanceOf[DeclineHandshakeResponse]
  }
}

