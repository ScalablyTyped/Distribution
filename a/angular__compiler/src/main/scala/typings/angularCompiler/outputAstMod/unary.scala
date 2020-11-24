package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "unary")
@js.native
object unary extends js.Object {
  
  def apply(operator: UnaryOperator, expr: Expression): UnaryOperatorExpr = js.native
  def apply(
    operator: UnaryOperator,
    expr: Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ): UnaryOperatorExpr = js.native
  def apply(operator: UnaryOperator, expr: Expression, `type`: Type): UnaryOperatorExpr = js.native
  def apply(operator: UnaryOperator, expr: Expression, `type`: Type, sourceSpan: ParseSourceSpan): UnaryOperatorExpr = js.native
}
