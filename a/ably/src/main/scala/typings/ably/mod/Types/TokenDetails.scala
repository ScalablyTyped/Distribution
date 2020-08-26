package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenDetails extends js.Object {
  var capability: String = js.native
  var clientId: js.UndefOr[String] = js.native
  var expires: Double = js.native
  var issued: Double = js.native
  var token: String = js.native
}

object TokenDetails {
  @scala.inline
  def apply(capability: String, expires: Double, issued: Double, token: String): TokenDetails = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDetails]
  }
  @scala.inline
  implicit class TokenDetailsOps[Self <: TokenDetails] (val x: Self) extends AnyVal {
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssued(value: Double): Self = this.set("issued", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
  }
  
}

