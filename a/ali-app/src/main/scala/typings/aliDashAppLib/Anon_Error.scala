package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
  				 * 识别错误码
  				 */
  var error: java.lang.String
  /**
  				 * 识别错误消息
  				 */
  var errorMessage: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(error: java.lang.String, errorMessage: java.lang.String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

