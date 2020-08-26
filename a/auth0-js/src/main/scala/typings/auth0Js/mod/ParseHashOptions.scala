package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseHashOptions extends js.Object {
  /** indicates that you want to allow IdP-Initiated flows. See {@link https://auth0.com/docs/protocols/saml/idp-initiated-sso#lock-auth0-js} */
  var __enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.native
  var _idTokenVerification: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object ParseHashOptions {
  @scala.inline
  def apply(): ParseHashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseHashOptions]
  }
  @scala.inline
  implicit class ParseHashOptionsOps[Self <: ParseHashOptions] (val x: Self) extends AnyVal {
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
    def set__enableIdPInitiatedLogin(value: Boolean): Self = this.set("__enableIdPInitiatedLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__enableIdPInitiatedLogin: Self = this.set("__enableIdPInitiatedLogin", js.undefined)
    @scala.inline
    def set_idTokenVerification(value: Boolean): Self = this.set("_idTokenVerification", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_idTokenVerification: Self = this.set("_idTokenVerification", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

