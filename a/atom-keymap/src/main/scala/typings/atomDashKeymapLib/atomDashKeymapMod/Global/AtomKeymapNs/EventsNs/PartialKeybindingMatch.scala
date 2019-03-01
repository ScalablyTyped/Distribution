package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialKeybindingMatch extends js.Object {
  /** DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: java.lang.String
  /** The KeyBindings that the keystrokes partially matched. */
  var partiallyMatchedBindings: js.Array[atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.KeyBinding]
}

object PartialKeybindingMatch {
  @scala.inline
  def apply(
    keyboardEventTarget: stdLib.Element,
    keystrokes: java.lang.String,
    partiallyMatchedBindings: js.Array[atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.KeyBinding]
  ): PartialKeybindingMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget)
    __obj.updateDynamic("keystrokes")(keystrokes)
    __obj.updateDynamic("partiallyMatchedBindings")(partiallyMatchedBindings)
    __obj.asInstanceOf[PartialKeybindingMatch]
  }
}

