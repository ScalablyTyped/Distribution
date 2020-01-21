package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "literal")
@js.native
object literal extends js.Object {
  def apply(value: js.Any): LiteralExpr = js.native
  def apply(value: js.Any, `type`: Null, sourceSpan: ParseSourceSpan): LiteralExpr = js.native
  def apply(value: js.Any, `type`: Type): LiteralExpr = js.native
  def apply(value: js.Any, `type`: Type, sourceSpan: ParseSourceSpan): LiteralExpr = js.native
}

