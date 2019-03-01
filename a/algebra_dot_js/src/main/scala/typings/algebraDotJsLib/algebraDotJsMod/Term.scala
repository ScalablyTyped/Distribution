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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coefficient")(coefficient)
    __obj.updateDynamic("coefficients")(coefficients)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Term]
  }
}

