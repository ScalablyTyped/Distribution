package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenRequest extends js.Object {
  var capability: String
  var clientId: js.UndefOr[String] = js.undefined
  var keyName: String
  var mac: String
  var nonce: String
  var timestamp: Double
  var ttl: js.UndefOr[Double] = js.undefined
}

object TokenRequest {
  @scala.inline
  def apply(
    capability: String,
    keyName: String,
    mac: String,
    nonce: String,
    timestamp: Double,
    clientId: String = null,
    ttl: Int | Double = null
  ): TokenRequest = {
    val __obj = js.Dynamic.literal(capability = capability, keyName = keyName, mac = mac, nonce = nonce, timestamp = timestamp)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequest]
  }
}

