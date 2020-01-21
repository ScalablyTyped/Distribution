package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrCodeResponse extends js.Object {
  var errCode: Double
}

object ErrCodeResponse {
  @scala.inline
  def apply(errCode: Double): ErrCodeResponse = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrCodeResponse]
  }
}

