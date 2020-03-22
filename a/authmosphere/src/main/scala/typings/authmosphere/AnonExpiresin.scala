package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiresin extends js.Object {
  var access_token: String
  var expires_in: js.UndefOr[Double] = js.undefined
  var local_expiry: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[js.Array[String]] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object AnonExpiresin {
  @scala.inline
  def apply(
    access_token: String,
    expires_in: Int | Double = null,
    local_expiry: Int | Double = null,
    scope: js.Array[String] = null,
    token_type: String = null
  ): AnonExpiresin = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (local_expiry != null) __obj.updateDynamic("local_expiry")(local_expiry.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpiresin]
  }
}

