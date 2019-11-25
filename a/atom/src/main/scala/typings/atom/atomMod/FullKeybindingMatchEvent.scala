package typings.atom.atomMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullKeybindingMatchEvent extends js.Object {
  /** The KeyBinding that the keystrokes matched. */
  var binding: KeyBinding
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String
}

object FullKeybindingMatchEvent {
  @scala.inline
  def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FullKeybindingMatchEvent]
  }
}

