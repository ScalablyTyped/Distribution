package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
  				 * 识别错误码
  				 */
  var error: String
  /**
  				 * 识别错误消息
  				 */
  var errorMessage: String
}

object Anon_Error {
  @scala.inline
  def apply(error: String, errorMessage: String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

