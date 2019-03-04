package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemError extends js.Object {
  var message: java.lang.String
  var `type`: SystemErrorType
}

object SystemError {
  @scala.inline
  def apply(message: java.lang.String, `type`: SystemErrorType): SystemError = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SystemError]
  }
}

