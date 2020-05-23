package typings.atomKeymap.mod.global.AtomKeymap.Events

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddedKeystrokeResolver extends js.Object {
  /**
    *  The raw DOM 3 `KeyboardEvent` being resolved. See the DOM API documentation
    *  for more details.
    */
  var event: KeyboardEvent
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
  var keystroke: String
  /** The OS-specific name of the current keyboard layout. */
  var layoutName: String
}

object AddedKeystrokeResolver {
  @scala.inline
  def apply(event: KeyboardEvent, keymap: js.Object, keystroke: String, layoutName: String): AddedKeystrokeResolver = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], keystroke = keystroke.asInstanceOf[js.Any], layoutName = layoutName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedKeystrokeResolver]
  }
}

