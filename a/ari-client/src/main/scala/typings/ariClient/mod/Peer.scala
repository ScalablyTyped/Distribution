package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Peer extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var cause: js.UndefOr[String] = js.undefined
  /* Properties */
  var peer_status: String
  var port: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[String] = js.undefined
}

object Peer {
  @scala.inline
  def apply(
    peer_status: String,
    address: String = null,
    cause: String = null,
    port: String = null,
    time: String = null
  ): Peer = {
    val __obj = js.Dynamic.literal(peer_status = peer_status.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
}

