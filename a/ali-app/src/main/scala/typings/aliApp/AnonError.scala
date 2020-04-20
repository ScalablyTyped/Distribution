package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  /**
  				 * 识别错误码
  				 */
  var error: String
  /**
  				 * 识别错误消息
  				 */
  var errorMessage: String
}

object AnonError {
  @scala.inline
  def apply(error: String, errorMessage: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

