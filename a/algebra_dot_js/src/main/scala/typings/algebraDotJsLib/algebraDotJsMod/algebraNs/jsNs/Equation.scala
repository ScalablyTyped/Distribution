package typings
package algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Equation extends js.Object {
  var lhs: Expression
  var rhs: Expression
  def solveFor(variable: java.lang.String): Fraction | js.Array[Fraction] | js.Array[scala.Double]
}

