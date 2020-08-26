package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/clientconfigi
@js.native
trait ClientConfigI extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var redirectURI: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var usePopup: js.UndefOr[Boolean] = js.native
}

object ClientConfigI {
  @scala.inline
  def apply(): ClientConfigI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfigI]
  }
  @scala.inline
  implicit class ClientConfigIOps[Self <: ClientConfigI] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setRedirectURI(value: String): Self = this.set("redirectURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectURI: Self = this.set("redirectURI", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUsePopup(value: Boolean): Self = this.set("usePopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePopup: Self = this.set("usePopup", js.undefined)
  }
  
}

