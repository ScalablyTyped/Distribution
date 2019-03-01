package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesstoken extends js.Object {
  var access_token: java.lang.String
  var expires_in: js.UndefOr[scala.Double] = js.undefined
  var local_expiry: js.UndefOr[scala.Double] = js.undefined
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var token_type: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accesstoken {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_in: scala.Int | scala.Double = null,
    local_expiry: scala.Int | scala.Double = null,
    scope: js.Array[java.lang.String] = null,
    token_type: java.lang.String = null
  ): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (local_expiry != null) __obj.updateDynamic("local_expiry")(local_expiry.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

