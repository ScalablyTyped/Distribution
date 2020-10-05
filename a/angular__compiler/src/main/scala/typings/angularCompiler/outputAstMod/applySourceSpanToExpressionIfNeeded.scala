package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "applySourceSpanToExpressionIfNeeded")
@js.native
object applySourceSpanToExpressionIfNeeded extends js.Object {
  def apply(expr: Expression): Expression = js.native
  def apply(expr: Expression, sourceSpan: ParseSourceSpan): Expression = js.native
}

