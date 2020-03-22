package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelector extends js.Object {
  var expression: js.Any
  var selector: String
}

object AnonSelector {
  @scala.inline
  def apply(expression: js.Any, selector: String): AnonSelector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSelector]
  }
}

