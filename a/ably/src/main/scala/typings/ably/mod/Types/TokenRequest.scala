package typings.ably.mod.Types

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
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequest]
  }
}

