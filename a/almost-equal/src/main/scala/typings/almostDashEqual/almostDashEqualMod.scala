package typings.almostDashEqual

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("almost-equal", JSImport.Namespace)
@js.native
object almostDashEqualMod extends js.Object {
  val DBL_EPSILON: Double = js.native
  val FLT_EPSILON: Double = js.native
  def apply(value: Double, other: Double): Boolean = js.native
  def apply(value: Double, other: Double, absoluteTolerance: Double): Boolean = js.native
  def apply(value: Double, other: Double, absoluteTolerance: Double, relativeTolerance: Double): Boolean = js.native
}

