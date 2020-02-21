package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbSignUpOptions extends js.Object {
  /** name of the connection where the user will be created */
  var connection: String
  /** user email address */
  var email: String
  /** user password */
  var password: String
  var scope: js.UndefOr[String] = js.undefined
  /** additional signup attributes used for creating the user. Will be stored in `user_metadata` */
  var userMetadata: js.UndefOr[js.Any] = js.undefined
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
    userMetadata: js.Any = null,
    username: String = null
  ): DbSignUpOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (userMetadata != null) __obj.updateDynamic("userMetadata")(userMetadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbSignUpOptions]
  }
}

