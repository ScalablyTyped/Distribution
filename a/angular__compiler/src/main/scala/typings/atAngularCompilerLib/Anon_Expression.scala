package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType
}

object Anon_Expression {
  @scala.inline
  def apply(
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType
  ): Anon_Expression = {
    val __obj = js.Dynamic.literal(expression = expression, statements = statements)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Expression]
  }
}

