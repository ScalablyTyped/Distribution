package typings.angularCompiler

import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.InvokeFunctionExpr
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: InvokeFunctionExpr
  var statements: js.Array[Statement]
  var `type`: ExpressionType_
}

object AnonExpression {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, statements: js.Array[Statement], `type`: ExpressionType_): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpression]
  }
}

