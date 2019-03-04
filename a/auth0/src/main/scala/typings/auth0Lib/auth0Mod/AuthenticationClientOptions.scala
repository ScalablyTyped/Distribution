package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationClientOptions extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var domain: java.lang.String
}

object AuthenticationClientOptions {
  @scala.inline
  def apply(domain: java.lang.String, clientId: java.lang.String = null, clientSecret: java.lang.String = null): AuthenticationClientOptions = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.asInstanceOf[AuthenticationClientOptions]
  }
}

