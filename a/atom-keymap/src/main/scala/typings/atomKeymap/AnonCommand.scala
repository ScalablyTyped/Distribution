package typings.atomKeymap

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommand extends js.Object {
   // e.g. 'ctrl-x ctrl-s'
  var command: js.UndefOr[String] = js.undefined
  var keystrokes: js.UndefOr[String] = js.undefined
   // e.g. 'editor:backspace'
  var target: js.UndefOr[Element] = js.undefined
}

object AnonCommand {
  @scala.inline
  def apply(command: String = null, keystrokes: String = null, target: Element = null): AnonCommand = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (keystrokes != null) __obj.updateDynamic("keystrokes")(keystrokes.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommand]
  }
}

