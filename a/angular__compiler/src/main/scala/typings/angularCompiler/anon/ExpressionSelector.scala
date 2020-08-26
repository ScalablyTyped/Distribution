package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionSelector extends js.Object {
  var expression: typings.angularCompiler.outputAstMod.Expression = js.native
  var selector: String = js.native
}

object ExpressionSelector {
  @scala.inline
  def apply(expression: typings.angularCompiler.outputAstMod.Expression, selector: String): ExpressionSelector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionSelector]
  }
  @scala.inline
  implicit class ExpressionSelectorOps[Self <: ExpressionSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: typings.angularCompiler.outputAstMod.Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

