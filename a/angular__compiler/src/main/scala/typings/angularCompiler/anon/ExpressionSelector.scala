package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionSelector extends js.Object {
  var expression: typings.angularCompiler.outputAstMod.Expression
  var selector: String
}

object ExpressionSelector {
  @scala.inline
  def apply(expression: typings.angularCompiler.outputAstMod.Expression, selector: String): ExpressionSelector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionSelector]
  }
}

