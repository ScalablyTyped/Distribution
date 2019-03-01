package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthProvider extends js.Object {
  def configure(params: OAuthConfig): OAuthConfig
}

object OAuthProvider {
  @scala.inline
  def apply(configure: js.Function1[OAuthConfig, OAuthConfig]): OAuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(configure)
    __obj.asInstanceOf[OAuthProvider]
  }
}

