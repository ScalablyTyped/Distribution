package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenRequest extends js.Object {
  var capability: String = js.native
  var clientId: js.UndefOr[String] = js.native
  var keyName: String = js.native
  var mac: String = js.native
  var nonce: String = js.native
  var timestamp: Double = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object TokenRequest {
  @scala.inline
  def apply(capability: String, keyName: String, mac: String, nonce: String, timestamp: Double): TokenRequest = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequest]
  }
  @scala.inline
  implicit class TokenRequestOps[Self <: TokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapability(value: String): Self = this.set("capability", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

