package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationClientOptions extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var domain: String
}

object AuthenticationClientOptions {
  @scala.inline
  def apply(domain: String, clientId: String = null, clientSecret: String = null): AuthenticationClientOptions = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.asInstanceOf[AuthenticationClientOptions]
  }
}

