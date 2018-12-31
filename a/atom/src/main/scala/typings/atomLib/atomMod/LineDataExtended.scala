package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDataExtended extends LineData {
  /** Boolean that is true if a fold may be created here. */
  var foldable: scala.Boolean
  /** Number the maximum number of digits necessary to represent any known screen row. */
  var maxDigits: scala.Double
  /** Boolean if this screen row is the soft-wrapped continuation of the same buffer row. */
  var softWrapped: scala.Boolean
}

