package typings.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Term extends _Union {
  var coefficients: js.Array[typings.algebraJs.mod.algebra.js_.Fraction] = js.native
  var variables: js.Array[Variable] = js.native
  def coefficient(): typings.algebraJs.mod.algebra.js_.Fraction = js.native
}

object Term {
  @scala.inline
  def apply(
    coefficient: () => typings.algebraJs.mod.algebra.js_.Fraction,
    coefficients: js.Array[typings.algebraJs.mod.algebra.js_.Fraction],
    variables: js.Array[Variable]
  ): Term = {
    val __obj = js.Dynamic.literal(coefficient = js.Any.fromFunction0(coefficient), coefficients = coefficients.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  implicit class TermOps[Self <: Term] (val x: Self) extends AnyVal {
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
    def setCoefficient(value: () => typings.algebraJs.mod.algebra.js_.Fraction): Self = this.set("coefficient", js.Any.fromFunction0(value))
    @scala.inline
    def setCoefficientsVarargs(value: typings.algebraJs.mod.algebra.js_.Fraction*): Self = this.set("coefficients", js.Array(value :_*))
    @scala.inline
    def setCoefficients(value: js.Array[typings.algebraJs.mod.algebra.js_.Fraction]): Self = this.set("coefficients", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: js.Array[Variable]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

