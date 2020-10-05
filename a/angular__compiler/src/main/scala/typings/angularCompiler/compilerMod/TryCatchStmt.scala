package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typings.angularCompiler.publicApiMod.TryCatchStmt {
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

