package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aud extends js.Object {
  var aud: java.lang.String
  var exp: scala.Double
  var iat: scala.Double
  var iss: java.lang.String
  var sub: java.lang.String
}

object Anon_Aud {
  @scala.inline
  def apply(
    aud: java.lang.String,
    exp: scala.Double,
    iat: scala.Double,
    iss: java.lang.String,
    sub: java.lang.String
  ): Anon_Aud = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aud")(aud)
    __obj.updateDynamic("exp")(exp)
    __obj.updateDynamic("iat")(iat)
    __obj.updateDynamic("iss")(iss)
    __obj.updateDynamic("sub")(sub)
    __obj.asInstanceOf[Anon_Aud]
  }
}

