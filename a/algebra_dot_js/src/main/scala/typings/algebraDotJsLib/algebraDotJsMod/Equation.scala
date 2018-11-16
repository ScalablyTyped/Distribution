package typings
package algebraDotJsLib.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Equation {
  def this(lhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression, rhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression) = this()
  def this(lhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression, rhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction) = this()
  def this(lhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression, rhs: scala.Double) = this()
  /* CompleteClass */
  override var lhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  /* CompleteClass */
  override var rhs: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: java.lang.String): algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction | js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction] | js.Array[scala.Double] = js.native
}

