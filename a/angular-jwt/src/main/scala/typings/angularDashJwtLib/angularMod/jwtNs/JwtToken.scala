package typings
package angularDashJwtLib.angularMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtToken extends js.Object {
  var aud: js.UndefOr[java.lang.String] = js.undefined
  var exp: js.UndefOr[scala.Double] = js.undefined
  var iat: js.UndefOr[scala.Double] = js.undefined
  var iss: js.UndefOr[java.lang.String] = js.undefined
  var jti: js.UndefOr[java.lang.String] = js.undefined
  var nbf: js.UndefOr[scala.Double] = js.undefined
  var sub: js.UndefOr[java.lang.String] = js.undefined
  var unique_name: js.UndefOr[java.lang.String] = js.undefined
}

object JwtToken {
  @scala.inline
  def apply(
    aud: java.lang.String = null,
    exp: scala.Int | scala.Double = null,
    iat: scala.Int | scala.Double = null,
    iss: java.lang.String = null,
    jti: java.lang.String = null,
    nbf: scala.Int | scala.Double = null,
    sub: java.lang.String = null,
    unique_name: java.lang.String = null
  ): JwtToken = {
    val __obj = js.Dynamic.literal()
    if (aud != null) __obj.updateDynamic("aud")(aud)
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (iss != null) __obj.updateDynamic("iss")(iss)
    if (jti != null) __obj.updateDynamic("jti")(jti)
    if (nbf != null) __obj.updateDynamic("nbf")(nbf.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub)
    if (unique_name != null) __obj.updateDynamic("unique_name")(unique_name)
    __obj.asInstanceOf[JwtToken]
  }
}

