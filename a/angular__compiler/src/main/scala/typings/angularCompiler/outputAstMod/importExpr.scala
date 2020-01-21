package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "importExpr")
@js.native
object importExpr extends js.Object {
  def apply(id: ExternalReference): ExternalExpr = js.native
  def apply(id: ExternalReference, typeParams: js.Array[Type]): ExternalExpr = js.native
  def apply(id: ExternalReference, typeParams: js.Array[Type], sourceSpan: ParseSourceSpan): ExternalExpr = js.native
  def apply(id: ExternalReference, typeParams: Null, sourceSpan: ParseSourceSpan): ExternalExpr = js.native
}

