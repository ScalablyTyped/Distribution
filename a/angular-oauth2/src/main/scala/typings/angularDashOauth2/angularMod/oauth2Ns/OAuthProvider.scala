package typings.angularDashOauth2.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthProvider extends js.Object {
  def configure(params: OAuthConfig): OAuthConfig
}

object OAuthProvider {
  @scala.inline
  def apply(configure: OAuthConfig => OAuthConfig): OAuthProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
  
    __obj.asInstanceOf[OAuthProvider]
  }
}

