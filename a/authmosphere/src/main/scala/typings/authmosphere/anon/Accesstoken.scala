package typings.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends js.Object {
  var access_token: String
  var expires_in: js.UndefOr[Double] = js.undefined
  var local_expiry: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[js.Array[String]] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object Accesstoken {
  @scala.inline
  def apply(
    access_token: String,
    expires_in: js.UndefOr[Double] = js.undefined,
    local_expiry: js.UndefOr[Double] = js.undefined,
    scope: js.Array[String] = null,
    token_type: String = null
  ): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    if (!js.isUndefined(expires_in)) __obj.updateDynamic("expires_in")(expires_in.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_expiry)) __obj.updateDynamic("local_expiry")(local_expiry.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

