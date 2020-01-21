package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpressionSelector extends js.Object {
  var expression: js.Any
  var selector: String
}

object AnonExpressionSelector {
  @scala.inline
  def apply(expression: js.Any, selector: String): AnonExpressionSelector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpressionSelector]
  }
}

