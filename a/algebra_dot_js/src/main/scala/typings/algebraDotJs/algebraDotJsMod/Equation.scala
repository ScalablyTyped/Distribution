package typings.algebraDotJs.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends typings.algebraDotJs.algebraDotJsMod.algebra.js.Equation {
  def this(lhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression, rhs: Double) = this()
  def this(
    lhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    rhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression
  ) = this()
  def this(
    lhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    rhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction
  ) = this()
  /* CompleteClass */
  override var lhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  /* CompleteClass */
  override var rhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: String): typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction | (js.Array[Double | typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction]) = js.native
}

