package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAuthOptions extends js.Object {
  var __instate: js.UndefOr[String] = js.undefined
  var _csrf: js.UndefOr[String] = js.undefined
  var audience: js.UndefOr[String] = js.undefined
  var clientID: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object BaseAuthOptions {
  @scala.inline
  def apply(
    __instate: String = null,
    _csrf: String = null,
    audience: String = null,
    clientID: String = null,
    nonce: String = null,
    redirectUri: String = null,
    responseType: String = null,
    scope: String = null,
    state: String = null
  ): BaseAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (__instate != null) __obj.updateDynamic("__instate")(__instate.asInstanceOf[js.Any])
    if (_csrf != null) __obj.updateDynamic("_csrf")(_csrf.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAuthOptions]
  }
}

