package typings
package algebraDotJsLib.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var variable: java.lang.String
}

object Variable {
  @scala.inline
  def apply(toString: js.Function0[java.lang.String], variable: java.lang.String): Variable = {
    val __obj = js.Dynamic.literal(toString = toString, variable = variable)
  
    __obj.asInstanceOf[Variable]
  }
}

