package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ExpressionStatement")
@js.native
class ExpressionStatement protected () extends Statement {
  def this(expr: Expression) = this()
  def this(expr: Expression, sourceSpan: ParseSourceSpan) = this()
  var expr: Expression = js.native
}

