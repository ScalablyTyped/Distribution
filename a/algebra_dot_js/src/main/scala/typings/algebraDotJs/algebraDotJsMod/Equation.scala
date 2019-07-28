package typings.algebraDotJs.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Equation {
  def this(lhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression, rhs: Double) = this()
  def this(
    lhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression,
    rhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression
  ) = this()
  def this(
    lhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression,
    rhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction
  ) = this()
  /* CompleteClass */
  override var lhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  /* CompleteClass */
  override var rhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: String): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction | (js.Array[Double | typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction]) = js.native
}

