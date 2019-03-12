package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  var command: java.lang.String
  // Properties
  var enabled: scala.Boolean
  var keystrokeArray: js.Array[java.lang.String]
  var keystrokeCount: scala.Double
  var keystrokes: java.lang.String
  var selector: java.lang.String
  var source: java.lang.String
  var specificity: scala.Double
  /**
    *  Compare another KeyBinding to this instance.
    *  Returns <= -1 if the argument is considered lesser or of lower priority.
    *  Returns 0 if this binding is equivalent to the argument.
    *  Returns >= 1 if the argument is considered greater or of higher priority.
    */
  def compare(other: KeyBinding): scala.Double
  // Comparison
  /** Determines whether the given keystroke matches any contained within this binding. */
  def matches(keystroke: java.lang.String): scala.Boolean
}

object KeyBinding {
  @scala.inline
  def apply(
    command: java.lang.String,
    compare: KeyBinding => scala.Double,
    enabled: scala.Boolean,
    keystrokeArray: js.Array[java.lang.String],
    keystrokeCount: scala.Double,
    keystrokes: java.lang.String,
    matches: java.lang.String => scala.Boolean,
    selector: java.lang.String,
    source: java.lang.String,
    specificity: scala.Double
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(command = command, compare = js.Any.fromFunction1(compare), enabled = enabled, keystrokeArray = keystrokeArray, keystrokeCount = keystrokeCount, keystrokes = keystrokes, matches = js.Any.fromFunction1(matches), selector = selector, source = source, specificity = specificity)
  
    __obj.asInstanceOf[KeyBinding]
  }
}

