package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossOriginLoginOptions extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var clientID: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var responseMode: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object CrossOriginLoginOptions {
  @scala.inline
  def apply(
    password: java.lang.String,
    audience: java.lang.String = null,
    clientID: java.lang.String = null,
    domain: java.lang.String = null,
    email: java.lang.String = null,
    nonce: java.lang.String = null,
    realm: java.lang.String = null,
    redirectUri: java.lang.String = null,
    responseMode: java.lang.String = null,
    responseType: java.lang.String = null,
    scope: java.lang.String = null,
    state: java.lang.String = null,
    username: java.lang.String = null
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

