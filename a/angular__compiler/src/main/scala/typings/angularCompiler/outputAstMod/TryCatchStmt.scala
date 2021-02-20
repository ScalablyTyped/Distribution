package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "TryCatchStmt")
@js.native
class TryCatchStmt protected () extends Statement {
  def this(bodyStmts: js.Array[Statement], catchStmts: js.Array[Statement]) = this()
  def this(bodyStmts: js.Array[Statement], catchStmts: js.Array[Statement], sourceSpan: ParseSourceSpan) = this()
  def this(
    bodyStmts: js.Array[Statement],
    catchStmts: js.Array[Statement],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    bodyStmts: js.Array[Statement],
    catchStmts: js.Array[Statement],
    sourceSpan: Null,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    bodyStmts: js.Array[Statement],
    catchStmts: js.Array[Statement],
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  
  var bodyStmts: js.Array[Statement] = js.native
  
  var catchStmts: js.Array[Statement] = js.native
}
