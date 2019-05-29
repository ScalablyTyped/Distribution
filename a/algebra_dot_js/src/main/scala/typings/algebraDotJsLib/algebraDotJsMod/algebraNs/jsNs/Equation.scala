package typings
package algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var lhs: Expression
  var rhs: Expression
  def solveFor(variable: java.lang.String): Fraction | (js.Array[scala.Double | Fraction])
}

object Equation {
  @scala.inline
  def apply(
    lhs: Expression,
    rhs: Expression,
    solveFor: java.lang.String => Fraction | (js.Array[scala.Double | Fraction]),
    toString: () => java.lang.String
  ): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs, rhs = rhs, solveFor = js.Any.fromFunction1(solveFor), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Equation]
  }
}

