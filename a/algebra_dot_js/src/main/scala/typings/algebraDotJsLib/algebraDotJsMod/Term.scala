package typings
package algebraDotJsLib.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends js.Object {
  var coefficients: js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction]
  var variables: js.Array[Variable]
  def coefficient(): algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction
}

object Term {
  @scala.inline
  def apply(
    coefficient: js.Function0[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction],
    coefficients: js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction],
    toString: js.Function0[java.lang.String],
    variables: js.Array[Variable]
  ): Term = {
    val __obj = js.Dynamic.literal(coefficient = coefficient, coefficients = coefficients, toString = toString, variables = variables)
  
    __obj.asInstanceOf[Term]
  }
}

