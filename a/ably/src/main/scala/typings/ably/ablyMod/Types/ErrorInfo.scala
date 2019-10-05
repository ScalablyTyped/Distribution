package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var code: Double
  var message: String
  var statusCode: Double
}

object ErrorInfo {
  @scala.inline
  def apply(code: Double, message: String, statusCode: Double): ErrorInfo = {
    val __obj = js.Dynamic.literal(code = code, message = message, statusCode = statusCode)
  
    __obj.asInstanceOf[ErrorInfo]
  }
}

