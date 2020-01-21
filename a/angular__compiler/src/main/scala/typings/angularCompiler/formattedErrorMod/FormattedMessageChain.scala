package typings.angularCompiler.formattedErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedMessageChain extends js.Object {
  var message: String
  var next: js.UndefOr[FormattedMessageChain] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
}

object FormattedMessageChain {
  @scala.inline
  def apply(message: String, next: FormattedMessageChain = null, position: Position = null): FormattedMessageChain = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedMessageChain]
  }
}

