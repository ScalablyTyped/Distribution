package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPasswordUsername extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var username: String
}

object AnonPasswordUsername {
  @scala.inline
  def apply(username: String, password: String = null): AnonPasswordUsername = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPasswordUsername]
  }
}

