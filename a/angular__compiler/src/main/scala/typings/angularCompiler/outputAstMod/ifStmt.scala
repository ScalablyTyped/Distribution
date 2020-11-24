package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ifStmt")
@js.native
object ifStmt extends js.Object {
  
  def apply(condition: Expression, thenClause: js.Array[Statement]): IfStmt_ = js.native
  def apply(
    condition: Expression,
    thenClause: js.Array[Statement],
    elseClause: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ): IfStmt_ = js.native
  def apply(
    condition: Expression,
    thenClause: js.Array[Statement],
    elseClause: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ): IfStmt_ = js.native
  def apply(
    condition: Expression,
    thenClause: js.Array[Statement],
    elseClause: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ): IfStmt_ = js.native
  def apply(condition: Expression, thenClause: js.Array[Statement], elseClause: js.Array[Statement]): IfStmt_ = js.native
  def apply(
    condition: Expression,
    thenClause: js.Array[Statement],
    elseClause: js.Array[Statement],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ): IfStmt_ = js.native
  def apply(
    condition: Expression,
    thenClause: js.Array[Statement],
    elseClause: js.Array[Statement],
    sourceSpan: ParseSourceSpan
  ): IfStmt_ = js.native
  def apply(
    condition: Expression,
    thenClause: js.Array[Statement],
    elseClause: js.Array[Statement],
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ): IfStmt_ = js.native
}
