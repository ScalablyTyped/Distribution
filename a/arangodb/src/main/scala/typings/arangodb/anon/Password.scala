package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var username: String
}

object Password {
  @scala.inline
  def apply(username: String, password: String = null): Password = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

