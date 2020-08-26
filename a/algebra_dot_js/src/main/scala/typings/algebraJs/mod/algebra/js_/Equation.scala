package typings.algebraJs.mod.algebra.js_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Equation extends js.Object {
  var lhs: Expression = js.native
  var rhs: Expression = js.native
  def solveFor(variable: String): Fraction | (js.Array[Double | Fraction]) = js.native
}

object Equation {
  @scala.inline
  def apply(lhs: Expression, rhs: Expression, solveFor: String => Fraction | (js.Array[Double | Fraction])): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any], solveFor = js.Any.fromFunction1(solveFor))
    __obj.asInstanceOf[Equation]
  }
  @scala.inline
  implicit class EquationOps[Self <: Equation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLhs(value: Expression): Self = this.set("lhs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRhs(value: Expression): Self = this.set("rhs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolveFor(value: String => Fraction | (js.Array[Double | Fraction])): Self = this.set("solveFor", js.Any.fromFunction1(value))
  }
  
}

