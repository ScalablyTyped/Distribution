package typings.atomDashKeymap.atomDashKeymapMod.Global.AtomKeymap.Events

import typings.atomDashKeymap.atomDashKeymapMod.Global.AtomKeymap.KeyBinding
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialKeybindingMatch extends js.Object {
  /** DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String
  /** The KeyBindings that the keystrokes partially matched. */
  var partiallyMatchedBindings: js.Array[KeyBinding]
}

object PartialKeybindingMatch {
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String, partiallyMatchedBindings: js.Array[KeyBinding]): PartialKeybindingMatch = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget, keystrokes = keystrokes, partiallyMatchedBindings = partiallyMatchedBindings)
  
    __obj.asInstanceOf[PartialKeybindingMatch]
  }
}

