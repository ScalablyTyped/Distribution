package typings.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", "Equation")
@js.native
class Equation protected ()
  extends typings.algebraJs.mod.algebra.js_.Equation {
  def this(lhs: typings.algebraJs.mod.algebra.js_.Expression, rhs: Double) = this()
  def this(
    lhs: typings.algebraJs.mod.algebra.js_.Expression,
    rhs: typings.algebraJs.mod.algebra.js_.Expression
  ) = this()
  def this(lhs: typings.algebraJs.mod.algebra.js_.Expression, rhs: typings.algebraJs.mod.algebra.js_.Fraction) = this()
  /* CompleteClass */
  override var lhs: typings.algebraJs.mod.algebra.js_.Expression = js.native
  /* CompleteClass */
  override var rhs: typings.algebraJs.mod.algebra.js_.Expression = js.native
  /* CompleteClass */
  override def solveFor(variable: String): typings.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typings.algebraJs.mod.algebra.js_.Fraction]) = js.native
}

