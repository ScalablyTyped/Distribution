package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsername extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var username: String
}

object AnonUsername {
  @scala.inline
  def apply(username: String, password: String = null): AnonUsername = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUsername]
  }
}

