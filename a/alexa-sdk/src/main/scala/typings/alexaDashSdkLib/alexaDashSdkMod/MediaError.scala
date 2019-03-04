package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaError extends js.Object {
  var message: java.lang.String
  var `type`: MediaErrorType
}

object MediaError {
  @scala.inline
  def apply(message: java.lang.String, `type`: MediaErrorType): MediaError = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaError]
  }
}

