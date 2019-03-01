package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatementVisitor extends js.Object {
  def visitCommentStmt(stmt: CommentStmt, context: js.Any): js.Any
  def visitDeclareClassStmt(stmt: ClassStmt, context: js.Any): js.Any
  def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: js.Any): js.Any
  def visitDeclareVarStmt(stmt: DeclareVarStmt, context: js.Any): js.Any
  def visitExpressionStmt(stmt: ExpressionStatement, context: js.Any): js.Any
  def visitIfStmt(stmt: IfStmt, context: js.Any): js.Any
  def visitJSDocCommentStmt(stmt: JSDocCommentStmt, context: js.Any): js.Any
  def visitReturnStmt(stmt: ReturnStatement, context: js.Any): js.Any
  def visitThrowStmt(stmt: ThrowStmt, context: js.Any): js.Any
  def visitTryCatchStmt(stmt: TryCatchStmt, context: js.Any): js.Any
}

object StatementVisitor {
  @scala.inline
  def apply(
    visitCommentStmt: js.Function2[CommentStmt, js.Any, js.Any],
    visitDeclareClassStmt: js.Function2[ClassStmt, js.Any, js.Any],
    visitDeclareFunctionStmt: js.Function2[DeclareFunctionStmt, js.Any, js.Any],
    visitDeclareVarStmt: js.Function2[DeclareVarStmt, js.Any, js.Any],
    visitExpressionStmt: js.Function2[ExpressionStatement, js.Any, js.Any],
    visitIfStmt: js.Function2[IfStmt, js.Any, js.Any],
    visitJSDocCommentStmt: js.Function2[JSDocCommentStmt, js.Any, js.Any],
    visitReturnStmt: js.Function2[ReturnStatement, js.Any, js.Any],
    visitThrowStmt: js.Function2[ThrowStmt, js.Any, js.Any],
    visitTryCatchStmt: js.Function2[TryCatchStmt, js.Any, js.Any]
  ): StatementVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitCommentStmt")(visitCommentStmt)
    __obj.updateDynamic("visitDeclareClassStmt")(visitDeclareClassStmt)
    __obj.updateDynamic("visitDeclareFunctionStmt")(visitDeclareFunctionStmt)
    __obj.updateDynamic("visitDeclareVarStmt")(visitDeclareVarStmt)
    __obj.updateDynamic("visitExpressionStmt")(visitExpressionStmt)
    __obj.updateDynamic("visitIfStmt")(visitIfStmt)
    __obj.updateDynamic("visitJSDocCommentStmt")(visitJSDocCommentStmt)
    __obj.updateDynamic("visitReturnStmt")(visitReturnStmt)
    __obj.updateDynamic("visitThrowStmt")(visitThrowStmt)
    __obj.updateDynamic("visitTryCatchStmt")(visitTryCatchStmt)
    __obj.asInstanceOf[StatementVisitor]
  }
}

