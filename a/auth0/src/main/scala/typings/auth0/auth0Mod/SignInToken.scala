package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignInToken extends js.Object {
  var access_token: String
  var expiry: Double
  var id_token: js.UndefOr[String] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object SignInToken {
  @scala.inline
  def apply(access_token: String, expiry: Double, id_token: String = null, token_type: String = null): SignInToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInToken]
  }
}

