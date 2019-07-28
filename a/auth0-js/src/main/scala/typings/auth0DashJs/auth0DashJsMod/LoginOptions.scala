package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions extends js.Object {
  var password: String
  var scope: js.UndefOr[String] = js.undefined
  var username: String
}

object LoginOptions {
  @scala.inline
  def apply(password: String, username: String, scope: String = null): LoginOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[LoginOptions]
  }
}

