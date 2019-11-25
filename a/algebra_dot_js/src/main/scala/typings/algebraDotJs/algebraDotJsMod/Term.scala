package typings.algebraDotJs.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends _Union {
  var coefficients: js.Array[typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction]
  var variables: js.Array[Variable]
  def coefficient(): typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction
}

object Term {
  @scala.inline
  def apply(
    coefficient: () => typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction,
    coefficients: js.Array[typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction],
    variables: js.Array[Variable]
  ): Term = {
    val __obj = js.Dynamic.literal(coefficient = js.Any.fromFunction0(coefficient), coefficients = coefficients.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Term]
  }
}

