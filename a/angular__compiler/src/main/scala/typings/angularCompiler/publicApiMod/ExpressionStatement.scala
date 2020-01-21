package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ExpressionStatement")
@js.native
class ExpressionStatement protected ()
  extends typings.angularCompiler.srcCompilerMod.ExpressionStatement {
  def this(expr: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

