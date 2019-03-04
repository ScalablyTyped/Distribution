package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions extends js.Object {
  var password: java.lang.String
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object LoginOptions {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String, scope: java.lang.String = null): LoginOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[LoginOptions]
  }
}

