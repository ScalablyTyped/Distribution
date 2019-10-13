package typings.atomDashKeymap.atomDashKeymapMod._Global_.AtomKeymap.Events

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeybindingMatch extends js.Object {
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: String
}

object FailedKeybindingMatch {
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String): FailedKeybindingMatch = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget, keystrokes = keystrokes)
  
    __obj.asInstanceOf[FailedKeybindingMatch]
  }
}

