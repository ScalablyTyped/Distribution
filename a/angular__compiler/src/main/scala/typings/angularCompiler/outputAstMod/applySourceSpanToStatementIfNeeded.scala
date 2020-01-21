package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "applySourceSpanToStatementIfNeeded")
@js.native
object applySourceSpanToStatementIfNeeded extends js.Object {
  def apply(stmt: Statement): Statement = js.native
  def apply(stmt: Statement, sourceSpan: ParseSourceSpan): Statement = js.native
}

