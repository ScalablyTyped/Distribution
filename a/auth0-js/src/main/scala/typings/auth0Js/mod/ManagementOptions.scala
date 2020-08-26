package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementOptions extends js.Object {
  var audience: js.UndefOr[String] = js.native
  var clientId: js.UndefOr[String] = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var domain: String = js.native
  var scope: js.UndefOr[String] = js.native
  var telemetry: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[String] = js.native
  var tokenProvider: js.UndefOr[TokenProvider] = js.native
}

object ManagementOptions {
  @scala.inline
  def apply(domain: String): ManagementOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOptions]
  }
  @scala.inline
  implicit class ManagementOptionsOps[Self <: ManagementOptions] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTelemetry(value: Boolean): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setTokenProvider(value: TokenProvider): Self = this.set("tokenProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenProvider: Self = this.set("tokenProvider", js.undefined)
  }
  
}

