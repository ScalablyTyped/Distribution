package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDirectoryLoginOptions extends LoginOptions {
  var audience: js.UndefOr[java.lang.String] = js.undefined
}

object DefaultDirectoryLoginOptions {
  @scala.inline
  def apply(
    password: java.lang.String,
    username: java.lang.String,
    audience: java.lang.String = null,
    scope: java.lang.String = null
  ): DefaultDirectoryLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[DefaultDirectoryLoginOptions]
  }
}

