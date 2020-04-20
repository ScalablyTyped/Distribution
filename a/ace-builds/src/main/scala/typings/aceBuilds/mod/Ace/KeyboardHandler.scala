package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardHandler extends js.Object {
  var handleKeyboard: js.Function
}

object KeyboardHandler {
  @scala.inline
  def apply(handleKeyboard: js.Function): KeyboardHandler = {
    val __obj = js.Dynamic.literal(handleKeyboard = handleKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardHandler]
  }
}

