package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaError extends js.Object {
  var message: String
  var `type`: MediaErrorType
}

object MediaError {
  @scala.inline
  def apply(message: String, `type`: MediaErrorType): MediaError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
}

