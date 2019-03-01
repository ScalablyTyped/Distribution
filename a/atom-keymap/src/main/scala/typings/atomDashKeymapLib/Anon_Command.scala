package typings
package atomDashKeymapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Command extends js.Object {
   // e.g. 'ctrl-x ctrl-s'
  var command: js.UndefOr[java.lang.String] = js.undefined
  var keystrokes: js.UndefOr[java.lang.String] = js.undefined
   // e.g. 'editor:backspace'
  var target: js.UndefOr[stdLib.Element] = js.undefined
}

object Anon_Command {
  @scala.inline
  def apply(
    command: java.lang.String = null,
    keystrokes: java.lang.String = null,
    target: stdLib.Element = null
  ): Anon_Command = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (keystrokes != null) __obj.updateDynamic("keystrokes")(keystrokes)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Command]
  }
}

