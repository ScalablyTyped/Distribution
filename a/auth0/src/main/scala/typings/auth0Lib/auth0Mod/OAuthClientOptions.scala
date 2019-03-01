package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClientOptions extends BaseClientOptions {
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
}

object OAuthClientOptions {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null
  ): OAuthClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUrl")(baseUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.asInstanceOf[OAuthClientOptions]
  }
}

