package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenConfig extends js.Object {
  var name: java.lang.String
  var options: js.Any
}

object OAuthTokenConfig {
  @scala.inline
  def apply(name: java.lang.String, options: js.Any): OAuthTokenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[OAuthTokenConfig]
  }
}

