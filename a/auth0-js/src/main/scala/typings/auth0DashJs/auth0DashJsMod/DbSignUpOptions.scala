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
}

object DbSignUpOptions {
  @scala.inline
  def apply(
    connection: String,
    email: String,
    password: String,
    scope: String = null,
    user_metadata: js.Any = null
  ): DbSignUpOptions = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, password = password)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    __obj.asInstanceOf[DbSignUpOptions]
  }
}

