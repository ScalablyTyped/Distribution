package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.InvokeFunctionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var expression: InvokeFunctionExpr
  var `type`: ExpressionType_
}

object Expression {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, `type`: ExpressionType_): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

