package typings.ably.mod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenParams extends js.Object {
  var capability: js.UndefOr[StringDictionary[js.Array[capabilityOp]] | String] = js.native
  var clientId: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object TokenParams {
  @scala.inline
  def apply(): TokenParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenParams]
  }
  @scala.inline
  implicit class TokenParamsOps[Self <: TokenParams] (val x: Self) extends AnyVal {
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
    def setCapability(value: StringDictionary[js.Array[capabilityOp]] | String): Self = this.set("capability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapability: Self = this.set("capability", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

