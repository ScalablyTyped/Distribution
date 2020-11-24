package typings.almostEqual

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("almost-equal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(value: Double, other: Double): Boolean = js.native
  def apply(
    value: Double,
    other: Double,
    absoluteTolerance: js.UndefOr[scala.Nothing],
    relativeTolerance: Double
  ): Boolean = js.native
  def apply(value: Double, other: Double, absoluteTolerance: Double): Boolean = js.native
  def apply(value: Double, other: Double, absoluteTolerance: Double, relativeTolerance: Double): Boolean = js.native
  
  val DBL_EPSILON: Double = js.native
  
  val FLT_EPSILON: Double = js.native
}
