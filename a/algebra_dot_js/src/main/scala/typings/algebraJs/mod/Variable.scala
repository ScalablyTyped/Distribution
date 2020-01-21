package typings.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var variable: String
}

object Variable {
  @scala.inline
  def apply(variable: String): Variable = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Variable]
  }
}

