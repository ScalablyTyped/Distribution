package typings.angularDashOauth2.angularMod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenOptions extends js.Object {
  var secure: Boolean
}

object OAuthTokenOptions {
  @scala.inline
  def apply(secure: Boolean): OAuthTokenOptions = {
    val __obj = js.Dynamic.literal(secure = secure)
  
    __obj.asInstanceOf[OAuthTokenOptions]
  }
}

