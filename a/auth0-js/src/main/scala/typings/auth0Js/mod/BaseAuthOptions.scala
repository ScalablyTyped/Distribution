package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAuthOptions extends js.Object {
  var __instate: js.UndefOr[String] = js.native
  var _csrf: js.UndefOr[String] = js.native
  var audience: js.UndefOr[String] = js.native
  var clientID: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var redirectUri: js.UndefOr[String] = js.native
  var responseType: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object BaseAuthOptions {
  @scala.inline
  def apply(): BaseAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAuthOptions]
  }
  @scala.inline
  implicit class BaseAuthOptionsOps[Self <: BaseAuthOptions] (val x: Self) extends AnyVal {
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
    def set__instate(value: String): Self = this.set("__instate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__instate: Self = this.set("__instate", js.undefined)
    @scala.inline
    def set_csrf(value: String): Self = this.set("_csrf", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_csrf: Self = this.set("_csrf", js.undefined)
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

