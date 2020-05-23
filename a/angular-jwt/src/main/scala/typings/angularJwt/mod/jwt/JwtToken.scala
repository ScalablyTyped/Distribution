package typings.angularJwt.mod.jwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtToken extends js.Object {
  var aud: js.UndefOr[String] = js.undefined
  var exp: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var iss: js.UndefOr[String] = js.undefined
  var jti: js.UndefOr[String] = js.undefined
  var nbf: js.UndefOr[Double] = js.undefined
  var sub: js.UndefOr[String] = js.undefined
  var unique_name: js.UndefOr[String] = js.undefined
}

object JwtToken {
  @scala.inline
  def apply(
    aud: String = null,
    exp: js.UndefOr[Double] = js.undefined,
    iat: js.UndefOr[Double] = js.undefined,
    iss: String = null,
    jti: String = null,
    nbf: js.UndefOr[Double] = js.undefined,
    sub: String = null,
    unique_name: String = null
  ): JwtToken = {
    val __obj = js.Dynamic.literal()
    if (aud != null) __obj.updateDynamic("aud")(aud.asInstanceOf[js.Any])
    if (!js.isUndefined(exp)) __obj.updateDynamic("exp")(exp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iat)) __obj.updateDynamic("iat")(iat.get.asInstanceOf[js.Any])
    if (iss != null) __obj.updateDynamic("iss")(iss.asInstanceOf[js.Any])
    if (jti != null) __obj.updateDynamic("jti")(jti.asInstanceOf[js.Any])
    if (!js.isUndefined(nbf)) __obj.updateDynamic("nbf")(nbf.get.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    if (unique_name != null) __obj.updateDynamic("unique_name")(unique_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtToken]
  }
}

