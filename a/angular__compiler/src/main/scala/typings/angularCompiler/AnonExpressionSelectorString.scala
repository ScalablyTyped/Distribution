package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpressionSelectorString extends js.Object {
  var expression: Expression
  var selector: String
}

object AnonExpressionSelectorString {
  @scala.inline
  def apply(expression: Expression, selector: String): AnonExpressionSelectorString = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpressionSelectorString]
  }
}

