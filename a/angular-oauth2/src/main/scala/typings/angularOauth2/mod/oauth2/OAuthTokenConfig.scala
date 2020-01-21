package typings.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenConfig extends js.Object {
  var name: String
  var options: js.Any
}

object OAuthTokenConfig {
  @scala.inline
  def apply(name: String, options: js.Any): OAuthTokenConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuthTokenConfig]
  }
}

