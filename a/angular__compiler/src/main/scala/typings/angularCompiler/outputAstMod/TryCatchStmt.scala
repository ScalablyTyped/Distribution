package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "TryCatchStmt")
@js.native
class TryCatchStmt protected () extends Statement {
  def this(bodyStmts: js.Array[Statement], catchStmts: js.Array[Statement]) = this()
  def this(bodyStmts: js.Array[Statement], catchStmts: js.Array[Statement], sourceSpan: ParseSourceSpan) = this()
  var bodyStmts: js.Array[Statement] = js.native
  var catchStmts: js.Array[Statement] = js.native
}

