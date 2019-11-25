package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDirectoryLoginOptions extends LoginOptions {
  var audience: js.UndefOr[String] = js.undefined
}

object DefaultDirectoryLoginOptions {
  @scala.inline
  def apply(password: String, username: String, audience: String = null, scope: String = null): DefaultDirectoryLoginOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDirectoryLoginOptions]
  }
}

