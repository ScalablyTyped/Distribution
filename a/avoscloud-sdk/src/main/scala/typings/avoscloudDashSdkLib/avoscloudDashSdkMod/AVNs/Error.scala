package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: ErrorCode
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: ErrorCode, message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Error]
  }
}

