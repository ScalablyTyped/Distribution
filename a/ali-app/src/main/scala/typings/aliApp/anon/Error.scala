package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /**
    * 识别错误码
    */
  var error: String
  /**
    * 识别错误消息
    */
  var errorMessage: String
}

object Error {
  @scala.inline
  def apply(error: String, errorMessage: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

