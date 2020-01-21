package typings.auth0.mod

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
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationClientOptions]
  }
}

