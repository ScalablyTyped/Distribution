package typings.almostEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("almost-equal", JSImport.Namespace)
  @js.native
  def apply(value: Double, other: Double): Boolean = js.native
  @JSImport("almost-equal", JSImport.Namespace)
  @js.native
  def apply(
    value: Double,
    other: Double,
    absoluteTolerance: js.UndefOr[scala.Nothing],
    relativeTolerance: Double
  ): Boolean = js.native
  @JSImport("almost-equal", JSImport.Namespace)
  @js.native
  def apply(value: Double, other: Double, absoluteTolerance: Double): Boolean = js.native
  @JSImport("almost-equal", JSImport.Namespace)
  @js.native
  def apply(value: Double, other: Double, absoluteTolerance: Double, relativeTolerance: Double): Boolean = js.native
  
  @JSImport("almost-equal", "DBL_EPSILON")
  @js.native
  val DBL_EPSILON: Double = js.native
  
  @JSImport("almost-equal", "FLT_EPSILON")
  @js.native
  val FLT_EPSILON: Double = js.native
}
