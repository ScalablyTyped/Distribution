package typings.algebraDotJs.algebraDotJsMod.algebra.js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var lhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression
  var rhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression
  def solveFor(variable: String): typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction | (js.Array[Double | typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction])
}

object Equation {
  @scala.inline
  def apply(
    lhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    rhs: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression,
    solveFor: String => typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction | (js.Array[Double | typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction]),
    toString: () => String
  ): Equation = {
    val __obj = js.Dynamic.literal(lhs = lhs, rhs = rhs, solveFor = js.Any.fromFunction1(solveFor), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Equation]
  }
}

