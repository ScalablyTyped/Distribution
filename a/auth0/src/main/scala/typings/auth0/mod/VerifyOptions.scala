package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var password: String
  var username: String
}

object VerifyOptions {
  @scala.inline
  def apply(password: String, username: String): VerifyOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}

