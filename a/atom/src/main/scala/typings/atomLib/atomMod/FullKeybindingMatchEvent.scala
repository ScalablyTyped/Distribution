package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullKeybindingMatchEvent extends js.Object {
  /** The KeyBinding that the keystrokes matched. */
  var binding: KeyBinding
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: java.lang.String
}

object FullKeybindingMatchEvent {
  @scala.inline
  def apply(binding: KeyBinding, keyboardEventTarget: stdLib.Element, keystrokes: java.lang.String): FullKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(binding = binding, keyboardEventTarget = keyboardEventTarget, keystrokes = keystrokes)
  
    __obj.asInstanceOf[FullKeybindingMatchEvent]
  }
}

