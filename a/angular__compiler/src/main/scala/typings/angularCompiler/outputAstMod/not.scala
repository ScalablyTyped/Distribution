package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "not")
@js.native
object not extends js.Object {
  def apply(expr: Expression): NotExpr = js.native
  def apply(expr: Expression, sourceSpan: ParseSourceSpan): NotExpr = js.native
}

