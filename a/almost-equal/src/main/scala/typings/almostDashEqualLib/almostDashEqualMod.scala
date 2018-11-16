package typings
package almostDashEqualLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("almost-equal", JSImport.Namespace)
@js.native
object almostDashEqualMod extends js.Object {
  val DBL_EPSILON: scala.Double = js.native
  val FLT_EPSILON: scala.Double = js.native
  def apply(value: scala.Double, other: scala.Double): scala.Boolean = js.native
  def apply(value: scala.Double, other: scala.Double, absoluteTolerance: scala.Double): scala.Boolean = js.native
  def apply(
    value: scala.Double,
    other: scala.Double,
    absoluteTolerance: scala.Double,
    relativeTolerance: scala.Double
  ): scala.Boolean = js.native
}

