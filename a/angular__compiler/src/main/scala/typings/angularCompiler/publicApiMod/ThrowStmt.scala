package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ThrowStmt")
@js.native
class ThrowStmt protected ()
  extends typings.angularCompiler.srcCompilerMod.ThrowStmt {
  def this(error: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    error: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

