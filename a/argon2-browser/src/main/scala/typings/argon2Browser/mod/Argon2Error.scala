package typings.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2Error extends js.Object {
  var code: Double
  var message: String
}

object Argon2Error {
  @scala.inline
  def apply(code: Double, message: String): Argon2Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Argon2Error]
  }
}

