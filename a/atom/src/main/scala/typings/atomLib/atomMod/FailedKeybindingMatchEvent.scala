package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeybindingMatchEvent extends js.Object {
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: java.lang.String
}

object FailedKeybindingMatchEvent {
  @scala.inline
  def apply(keyboardEventTarget: stdLib.Element, keystrokes: java.lang.String): FailedKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget, keystrokes = keystrokes)
  
    __obj.asInstanceOf[FailedKeybindingMatchEvent]
  }
}

