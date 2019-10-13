package typings.atomDashKeymap.atomDashKeymapMod._Global_.AtomKeymap.Events

import typings.atomDashKeymap.atomDashKeymapMod._Global_.AtomKeymap.KeyBinding
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullKeybindingMatch extends js.Object {
  /** The KeyBinding that the keystrokes matched. */
  var binding: KeyBinding
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String
}

object FullKeybindingMatch {
  @scala.inline
  def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatch = {
    val __obj = js.Dynamic.literal(binding = binding, keyboardEventTarget = keyboardEventTarget, keystrokes = keystrokes)
  
    __obj.asInstanceOf[FullKeybindingMatch]
  }
}

