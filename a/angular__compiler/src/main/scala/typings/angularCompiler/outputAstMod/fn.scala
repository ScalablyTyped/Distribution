package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "fn")
@js.native
object fn extends js.Object {
  def apply(params: js.Array[FnParam], body: js.Array[Statement]): FunctionExpr = js.native
  def apply(params: js.Array[FnParam], body: js.Array[Statement], `type`: Null, sourceSpan: Null, name: String): FunctionExpr = js.native
  def apply(params: js.Array[FnParam], body: js.Array[Statement], `type`: Null, sourceSpan: ParseSourceSpan): FunctionExpr = js.native
  def apply(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    name: String
  ): FunctionExpr = js.native
  def apply(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type): FunctionExpr = js.native
  def apply(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type, sourceSpan: Null, name: String): FunctionExpr = js.native
  def apply(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type, sourceSpan: ParseSourceSpan): FunctionExpr = js.native
  def apply(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    name: String
  ): FunctionExpr = js.native
}

