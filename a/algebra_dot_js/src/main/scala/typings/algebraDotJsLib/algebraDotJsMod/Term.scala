package typings
package algebraDotJsLib.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends _Union {
  var coefficients: js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction]
  var variables: js.Array[Variable]
  def coefficient(): algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction
}

object Term {
  @scala.inline
  def apply(
    coefficient: () => algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction,
    coefficients: js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction],
    toString: () => java.lang.String,
    variables: js.Array[Variable]
  ): Term = {
    val __obj = js.Dynamic.literal(coefficient = js.Any.fromFunction0(coefficient), coefficients = coefficients, toString = js.Any.fromFunction0(toString), variables = variables)
  
    __obj.asInstanceOf[Term]
  }
}

