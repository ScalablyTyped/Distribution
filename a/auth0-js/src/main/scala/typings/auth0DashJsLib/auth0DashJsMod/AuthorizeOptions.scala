package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends js.Object {
  var accessType: js.UndefOr[java.lang.String] = js.undefined
  var approvalPrompt: js.UndefOr[java.lang.String] = js.undefined
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var clientID: js.UndefOr[java.lang.String] = js.undefined
  var connection: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var login_hint: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[
    auth0DashJsLib.auth0DashJsLibStrings.login | auth0DashJsLib.auth0DashJsLibStrings.signUp
  ] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var responseMode: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    accessType: java.lang.String = null,
    approvalPrompt: java.lang.String = null,
    audience: java.lang.String = null,
    clientID: java.lang.String = null,
    connection: java.lang.String = null,
    domain: java.lang.String = null,
    language: java.lang.String = null,
    login_hint: java.lang.String = null,
    mode: auth0DashJsLib.auth0DashJsLibStrings.login | auth0DashJsLib.auth0DashJsLibStrings.signUp = null,
    nonce: java.lang.String = null,
    prompt: java.lang.String = null,
    redirectUri: java.lang.String = null,
    responseMode: java.lang.String = null,
    responseType: java.lang.String = null,
    scope: java.lang.String = null,
    state: java.lang.String = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (accessType != null) __obj.updateDynamic("accessType")(accessType)
    if (approvalPrompt != null) __obj.updateDynamic("approvalPrompt")(approvalPrompt)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (clientID != null) __obj.updateDynamic("clientID")(clientID)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (language != null) __obj.updateDynamic("language")(language)
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

