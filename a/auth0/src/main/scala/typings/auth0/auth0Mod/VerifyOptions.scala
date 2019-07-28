package typings.auth0.auth0Mod

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
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[VerifyOptions]
  }
}

