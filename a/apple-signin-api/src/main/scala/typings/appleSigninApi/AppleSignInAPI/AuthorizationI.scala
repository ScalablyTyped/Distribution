package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/authorizationi
trait AuthorizationI extends js.Object {
  var code: String
  var id_token: String
  var nonce: js.UndefOr[String] = js.undefined
  var state: String
}

object AuthorizationI {
  @scala.inline
  def apply(code: String, id_token: String, state: String, nonce: String = null): AuthorizationI = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationI]
  }
}

