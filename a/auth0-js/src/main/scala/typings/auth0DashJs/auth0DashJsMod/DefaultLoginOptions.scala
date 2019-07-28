package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLoginOptions extends LoginOptions {
  var audience: js.UndefOr[String] = js.undefined
  var realm: String
}

object DefaultLoginOptions {
  @scala.inline
  def apply(password: String, realm: String, username: String, audience: String = null, scope: String = null): DefaultLoginOptions = {
    val __obj = js.Dynamic.literal(password = password, realm = realm, username = username)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[DefaultLoginOptions]
  }
}

