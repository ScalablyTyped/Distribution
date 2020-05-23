package typings.atomKeymap.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
   // e.g. 'ctrl-x ctrl-s'
  var command: js.UndefOr[String] = js.undefined
  var keystrokes: js.UndefOr[String] = js.undefined
   // e.g. 'editor:backspace'
  var target: js.UndefOr[Element] = js.undefined
}

object Command {
  @scala.inline
  def apply(command: String = null, keystrokes: String = null, target: Element = null): Command = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (keystrokes != null) __obj.updateDynamic("keystrokes")(keystrokes.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

