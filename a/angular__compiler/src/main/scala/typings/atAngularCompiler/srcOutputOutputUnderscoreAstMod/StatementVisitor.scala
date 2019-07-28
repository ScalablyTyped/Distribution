package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

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
    visitCommentStmt: (CommentStmt, js.Any) => js.Any,
    visitDeclareClassStmt: (ClassStmt, js.Any) => js.Any,
    visitDeclareFunctionStmt: (DeclareFunctionStmt, js.Any) => js.Any,
    visitDeclareVarStmt: (DeclareVarStmt, js.Any) => js.Any,
    visitExpressionStmt: (ExpressionStatement, js.Any) => js.Any,
    visitIfStmt: (IfStmt, js.Any) => js.Any,
    visitJSDocCommentStmt: (JSDocCommentStmt, js.Any) => js.Any,
    visitReturnStmt: (ReturnStatement, js.Any) => js.Any,
    visitThrowStmt: (ThrowStmt, js.Any) => js.Any,
    visitTryCatchStmt: (TryCatchStmt, js.Any) => js.Any
  ): StatementVisitor = {
    val __obj = js.Dynamic.literal(visitCommentStmt = js.Any.fromFunction2(visitCommentStmt), visitDeclareClassStmt = js.Any.fromFunction2(visitDeclareClassStmt), visitDeclareFunctionStmt = js.Any.fromFunction2(visitDeclareFunctionStmt), visitDeclareVarStmt = js.Any.fromFunction2(visitDeclareVarStmt), visitExpressionStmt = js.Any.fromFunction2(visitExpressionStmt), visitIfStmt = js.Any.fromFunction2(visitIfStmt), visitJSDocCommentStmt = js.Any.fromFunction2(visitJSDocCommentStmt), visitReturnStmt = js.Any.fromFunction2(visitReturnStmt), visitThrowStmt = js.Any.fromFunction2(visitThrowStmt), visitTryCatchStmt = js.Any.fromFunction2(visitTryCatchStmt))
  
    __obj.asInstanceOf[StatementVisitor]
  }
}

