package typings.argon2DashBrowser.argon2DashBrowserMod

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
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Argon2Error]
  }
}

