package typings.almostEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: Double, other: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(value: Double, other: Double, absoluteTolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], absoluteTolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(value: Double, other: Double, absoluteTolerance: Double, relativeTolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], absoluteTolerance.asInstanceOf[js.Any], relativeTolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(value: Double, other: Double, absoluteTolerance: Unit, relativeTolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], absoluteTolerance.asInstanceOf[js.Any], relativeTolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("almost-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("almost-equal", "DBL_EPSILON")
  @js.native
  val DBL_EPSILON: Double = js.native
  
  @JSImport("almost-equal", "FLT_EPSILON")
  @js.native
  val FLT_EPSILON: Double = js.native
}
