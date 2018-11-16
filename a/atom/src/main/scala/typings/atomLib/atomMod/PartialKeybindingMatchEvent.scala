package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PartialKeybindingMatchEvent extends js.Object {
  /** DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that matched the binding. */
  var keystrokes: java.lang.String
  /** The KeyBindings that the keystrokes partially matched. */
  var partiallyMatchedBindings: js.Array[KeyBinding]
}

