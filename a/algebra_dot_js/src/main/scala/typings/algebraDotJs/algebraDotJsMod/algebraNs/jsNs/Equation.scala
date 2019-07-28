package typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var lhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression
  var rhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression
  def solveFor(variable: String): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction | (js.Array[Double | typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction])
}

object Equation {
  @scala.inline
  def apply(
    lhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression,
    rhs: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression,
    solveFor: String => typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction | (js.Array[Double | typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction]),
    toString: () => String
  ): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs, rhs = rhs, solveFor = js.Any.fromFunction1(solveFor), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Equation]
  }
}

