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
    compare: js.Function1[KeyBinding, scala.Double],
    enabled: scala.Boolean,
    keystrokeArray: js.Array[java.lang.String],
    keystrokeCount: scala.Double,
    keystrokes: java.lang.String,
    matches: js.Function1[java.lang.String, scala.Boolean],
    selector: java.lang.String,
    source: java.lang.String,
    specificity: scala.Double
  ): KeyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("compare")(compare)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("keystrokeArray")(keystrokeArray)
    __obj.updateDynamic("keystrokeCount")(keystrokeCount)
    __obj.updateDynamic("keystrokes")(keystrokes)
    __obj.updateDynamic("matches")(matches)
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("specificity")(specificity)
    __obj.asInstanceOf[KeyBinding]
  }
}

