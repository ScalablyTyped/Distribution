package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossOriginLoginOptions extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var clientID: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var password: String
  var realm: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var responseMode: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object CrossOriginLoginOptions {
  @scala.inline
  def apply(
    password: String,
    audience: String = null,
    clientID: String = null,
    domain: String = null,
    email: String = null,
    nonce: String = null,
    realm: String = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    scope: String = null,
    state: String = null,
    username: String = null
  ): CrossOriginLoginOptions = {
    val __obj = js.Dynamic.literal(password = password)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (clientID != null) __obj.updateDynamic("clientID")(clientID)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (email != null) __obj.updateDynamic("email")(email)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[CrossOriginLoginOptions]
  }
}

