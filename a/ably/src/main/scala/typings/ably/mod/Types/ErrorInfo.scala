package typings.ably.mod.Types

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

