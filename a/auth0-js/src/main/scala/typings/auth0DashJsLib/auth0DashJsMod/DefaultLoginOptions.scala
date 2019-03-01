package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLoginOptions extends LoginOptions {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var realm: java.lang.String
}

object DefaultLoginOptions {
  @scala.inline
  def apply(
    password: java.lang.String,
    realm: java.lang.String,
    username: java.lang.String,
    audience: java.lang.String = null,
    scope: java.lang.String = null
  ): DefaultLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("realm")(realm)
    __obj.updateDynamic("username")(username)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[DefaultLoginOptions]
  }
}

