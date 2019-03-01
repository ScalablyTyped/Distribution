package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeybindingMatch extends js.Object {
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: java.lang.String
}

object FailedKeybindingMatch {
  @scala.inline
  def apply(keyboardEventTarget: stdLib.Element, keystrokes: java.lang.String): FailedKeybindingMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyboardEventTarget")(keyboardEventTarget)
    __obj.updateDynamic("keystrokes")(keystrokes)
    __obj.asInstanceOf[FailedKeybindingMatch]
  }
}

