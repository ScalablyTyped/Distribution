package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typings.angularCompiler.srcCompilerMod.TryCatchStmt {
  def this(
    bodyStmts: js.Array[typings.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    bodyStmts: js.Array[typings.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

