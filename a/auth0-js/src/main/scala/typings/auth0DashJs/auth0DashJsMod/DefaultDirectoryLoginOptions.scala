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
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[DefaultDirectoryLoginOptions]
  }
}

