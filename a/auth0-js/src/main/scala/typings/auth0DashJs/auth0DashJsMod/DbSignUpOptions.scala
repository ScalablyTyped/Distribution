package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbSignUpOptions extends js.Object {
  var connection: String
  var email: String
  var password: String
  var scope: js.UndefOr[String] = js.undefined
  var user_metadata: js.UndefOr[js.Any] = js.undefined
  /** User desired username. Required if you use a database connection and you have enabled `Requires Username` */
  var username: js.UndefOr[String] = js.undefined
}

object DbSignUpOptions {
  @scala.inline
  def apply(
    connection: String,
    email: String,
    password: String,
    scope: String = null,
    user_metadata: js.Any = null,
    username: String = null
  ): DbSignUpOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbSignUpOptions]
  }
}

