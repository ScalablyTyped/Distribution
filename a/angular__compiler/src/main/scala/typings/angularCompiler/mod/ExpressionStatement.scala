package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ExpressionStatement")
@js.native
class ExpressionStatement protected ()
  extends typings.angularCompiler.compilerMod.ExpressionStatement {
  def this(expr: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

