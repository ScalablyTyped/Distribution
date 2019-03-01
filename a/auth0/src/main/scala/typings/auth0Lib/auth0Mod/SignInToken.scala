package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignInToken extends js.Object {
  var access_token: java.lang.String
  var expiry: scala.Double
  var id_token: js.UndefOr[java.lang.String] = js.undefined
  var token_type: js.UndefOr[java.lang.String] = js.undefined
}

object SignInToken {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expiry: scala.Double,
    id_token: java.lang.String = null,
    token_type: java.lang.String = null
  ): SignInToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("expiry")(expiry)
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[SignInToken]
  }
}

