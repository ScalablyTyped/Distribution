package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnConnectionStatus extends js.Object {
  /**
    * The state of the client connection.
    */
  var Code: js.UndefOr[ClientVpnConnectionStatusCode] = js.undefined
  /**
    * A message about the status of the client connection, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object ClientVpnConnectionStatus {
  @scala.inline
  def apply(Code: ClientVpnConnectionStatusCode = null, Message: String = null): ClientVpnConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ClientVpnConnectionStatus]
  }
}

