package typings.auth0DashJs.auth0DashJsMod

import typings.auth0DashJs.auth0DashJsStrings.login
import typings.auth0DashJs.auth0DashJsStrings.signUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckSessionOptions extends AuthorizeOptions {
  /**
  	 * optional parameter for auth0 to use postMessage to communicate between the silent callback and the SPA.
  	 */
  var usePostMessage: js.UndefOr[Boolean] = js.undefined
}

object CheckSessionOptions {
  @scala.inline
  def apply(
    accessType: String = null,
    appState: js.Any = null,
    approvalPrompt: String = null,
    audience: String = null,
    clientID: String = null,
    connection: String = null,
    domain: String = null,
    language: String = null,
    login_hint: String = null,
    mode: login | signUp = null,
    nonce: String = null,
    prompt: String = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    scope: String = null,
    state: String = null,
    usePostMessage: js.UndefOr[Boolean] = js.undefined
  ): CheckSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (appState != null) __obj.updateDynamic("appState")(appState.asInstanceOf[js.Any])
    if (approvalPrompt != null) __obj.updateDynamic("approvalPrompt")(approvalPrompt.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(usePostMessage)) __obj.updateDynamic("usePostMessage")(usePostMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckSessionOptions]
  }
}

