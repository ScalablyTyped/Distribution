package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddedKeystrokeResolver extends js.Object {
  /**
    *  The raw DOM 3 `KeyboardEvent` being resolved. See the DOM API documentation
    *  for more details.
    */
  var event: stdLib.KeyboardEvent
  /**
    *  An object mapping DOM 3 `KeyboardEvent.code` values to objects with the
    *  typed character for that key in each modifier state, based on the current
    *  operating system layout.
    */
  var keymap: js.Object
  /**
    *  The currently resolved keystroke string. If your function returns a falsy
    *  value, this is how Atom will resolve your keystroke.
    */
  var keystroke: java.lang.String
  /** The OS-specific name of the current keyboard layout. */
  var layoutName: java.lang.String
}

object AddedKeystrokeResolver {
  @scala.inline
  def apply(
    event: stdLib.KeyboardEvent,
    keymap: js.Object,
    keystroke: java.lang.String,
    layoutName: java.lang.String
  ): AddedKeystrokeResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("keymap")(keymap)
    __obj.updateDynamic("keystroke")(keystroke)
    __obj.updateDynamic("layoutName")(layoutName)
    __obj.asInstanceOf[AddedKeystrokeResolver]
  }
}

