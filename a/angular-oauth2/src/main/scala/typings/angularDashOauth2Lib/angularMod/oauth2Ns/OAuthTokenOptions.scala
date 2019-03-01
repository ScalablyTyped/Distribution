package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenOptions extends js.Object {
  var secure: scala.Boolean
}

object OAuthTokenOptions {
  @scala.inline
  def apply(secure: scala.Boolean): OAuthTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[OAuthTokenOptions]
  }
}

