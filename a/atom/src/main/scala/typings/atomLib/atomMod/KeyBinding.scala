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

