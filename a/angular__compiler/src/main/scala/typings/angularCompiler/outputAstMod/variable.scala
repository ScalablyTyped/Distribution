package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "variable")
@js.native
object variable extends js.Object {
  def apply(name: String): ReadVarExpr = js.native
  def apply(name: String, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan): ReadVarExpr = js.native
  def apply(name: String, `type`: Null, sourceSpan: ParseSourceSpan): ReadVarExpr = js.native
  def apply(name: String, `type`: Type): ReadVarExpr = js.native
  def apply(name: String, `type`: Type, sourceSpan: ParseSourceSpan): ReadVarExpr = js.native
}

