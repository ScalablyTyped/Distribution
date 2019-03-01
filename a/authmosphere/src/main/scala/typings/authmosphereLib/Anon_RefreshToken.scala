package typings
package authmosphereLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RefreshToken extends js.Object {
  var refreshToken: java.lang.String
}

object Anon_RefreshToken {
  @scala.inline
  def apply(refreshToken: java.lang.String): Anon_RefreshToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[Anon_RefreshToken]
  }
}

