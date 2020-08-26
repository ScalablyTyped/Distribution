package typings.arangodb.oauth1Mod

import typings.arangodb.arangodbStrings.PLAINTEXT
import typings.arangodb.arangodbStrings.`HMAC-SHA1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth1Options extends js.Object {
  var accessTokenEndpoint: String = js.native
  var activeUserEndpoint: js.UndefOr[String] = js.native
  var authEndpoint: String = js.native
  var clientId: String = js.native
  var clientSecret: String = js.native
  var requestTokenEndpoint: String = js.native
  var signatureMethod: js.UndefOr[`HMAC-SHA1` | PLAINTEXT] = js.native
}

object OAuth1Options {
  @scala.inline
  def apply(
    accessTokenEndpoint: String,
    authEndpoint: String,
    clientId: String,
    clientSecret: String,
    requestTokenEndpoint: String
  ): OAuth1Options = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], requestTokenEndpoint = requestTokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth1Options]
  }
  @scala.inline
  implicit class OAuth1OptionsOps[Self <: OAuth1Options] (val x: Self) extends AnyVal {
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
    def setAccessTokenEndpoint(value: String): Self = this.set("accessTokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthEndpoint(value: String): Self = this.set("authEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestTokenEndpoint(value: String): Self = this.set("requestTokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveUserEndpoint(value: String): Self = this.set("activeUserEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveUserEndpoint: Self = this.set("activeUserEndpoint", js.undefined)
    @scala.inline
    def setSignatureMethod(value: `HMAC-SHA1` | PLAINTEXT): Self = this.set("signatureMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureMethod: Self = this.set("signatureMethod", js.undefined)
  }
  
}

