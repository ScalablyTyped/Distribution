package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessLoginOptions extends BaseAuthOptions {
  var connection: String
  var email: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var verificationCode: String
}

object PasswordlessLoginOptions {
  @scala.inline
  def apply(
    connection: String,
    verificationCode: String,
    __instate: String = null,
    _csrf: String = null,
    audience: String = null,
    clientID: String = null,
    email: String = null,
    nonce: String = null,
    phoneNumber: String = null,
    redirectUri: String = null,
    responseType: String = null,
    scope: String = null,
    state: String = null
  ): PasswordlessLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    if (__instate != null) __obj.updateDynamic("__instate")(__instate.asInstanceOf[js.Any])
    if (_csrf != null) __obj.updateDynamic("_csrf")(_csrf.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessLoginOptions]
  }
}

