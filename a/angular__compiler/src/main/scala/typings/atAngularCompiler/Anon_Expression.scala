package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExpressionType
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: InvokeFunctionExpr
  var statements: js.Array[Statement]
  var `type`: ExpressionType
}

object Anon_Expression {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, statements: js.Array[Statement], `type`: ExpressionType): Anon_Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Expression]
  }
}

