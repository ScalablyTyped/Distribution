package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.InvokeFunctionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var expression: InvokeFunctionExpr = js.native
  var `type`: ExpressionType_ = js.native
}

object Expression {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, `type`: ExpressionType_): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
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
    def setExpression(value: InvokeFunctionExpr): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ExpressionType_): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

