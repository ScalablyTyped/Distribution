package typings.algebraDotJs.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var variable: String
}

object Variable {
  @scala.inline
  def apply(toString: () => String, variable: String): Variable = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString), variable = variable)
  
    __obj.asInstanceOf[Variable]
  }
}

