package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpressionType extends js.Object {
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType
}

object Anon_ExpressionType {
  @scala.inline
  def apply(
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType
  ): Anon_ExpressionType = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ExpressionType]
  }
}

