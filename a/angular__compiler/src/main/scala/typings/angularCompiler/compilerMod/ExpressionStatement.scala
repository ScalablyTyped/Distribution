package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ExpressionStatement")
@js.native
class ExpressionStatement protected ()
  extends typings.angularCompiler.publicApiMod.ExpressionStatement {
  def this(expr: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

