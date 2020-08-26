package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatementVisitor extends js.Object {
  def visitCommentStmt(stmt: CommentStmt, context: js.Any): js.Any = js.native
  def visitDeclareClassStmt(stmt: ClassStmt, context: js.Any): js.Any = js.native
  def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: js.Any): js.Any = js.native
  def visitDeclareVarStmt(stmt: DeclareVarStmt, context: js.Any): js.Any = js.native
  def visitExpressionStmt(stmt: ExpressionStatement, context: js.Any): js.Any = js.native
  def visitIfStmt(stmt: IfStmt_, context: js.Any): js.Any = js.native
  def visitJSDocCommentStmt(stmt: JSDocCommentStmt, context: js.Any): js.Any = js.native
  def visitReturnStmt(stmt: ReturnStatement, context: js.Any): js.Any = js.native
  def visitThrowStmt(stmt: ThrowStmt, context: js.Any): js.Any = js.native
  def visitTryCatchStmt(stmt: TryCatchStmt, context: js.Any): js.Any = js.native
}

object StatementVisitor {
  @scala.inline
  def apply(
    visitCommentStmt: (CommentStmt, js.Any) => js.Any,
    visitDeclareClassStmt: (ClassStmt, js.Any) => js.Any,
    visitDeclareFunctionStmt: (DeclareFunctionStmt, js.Any) => js.Any,
    visitDeclareVarStmt: (DeclareVarStmt, js.Any) => js.Any,
    visitExpressionStmt: (ExpressionStatement, js.Any) => js.Any,
    visitIfStmt: (IfStmt_, js.Any) => js.Any,
    visitJSDocCommentStmt: (JSDocCommentStmt, js.Any) => js.Any,
    visitReturnStmt: (ReturnStatement, js.Any) => js.Any,
    visitThrowStmt: (ThrowStmt, js.Any) => js.Any,
    visitTryCatchStmt: (TryCatchStmt, js.Any) => js.Any
  ): StatementVisitor = {
    val __obj = js.Dynamic.literal(visitCommentStmt = js.Any.fromFunction2(visitCommentStmt), visitDeclareClassStmt = js.Any.fromFunction2(visitDeclareClassStmt), visitDeclareFunctionStmt = js.Any.fromFunction2(visitDeclareFunctionStmt), visitDeclareVarStmt = js.Any.fromFunction2(visitDeclareVarStmt), visitExpressionStmt = js.Any.fromFunction2(visitExpressionStmt), visitIfStmt = js.Any.fromFunction2(visitIfStmt), visitJSDocCommentStmt = js.Any.fromFunction2(visitJSDocCommentStmt), visitReturnStmt = js.Any.fromFunction2(visitReturnStmt), visitThrowStmt = js.Any.fromFunction2(visitThrowStmt), visitTryCatchStmt = js.Any.fromFunction2(visitTryCatchStmt))
    __obj.asInstanceOf[StatementVisitor]
  }
  @scala.inline
  implicit class StatementVisitorOps[Self <: StatementVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVisitCommentStmt(value: (CommentStmt, js.Any) => js.Any): Self = this.set("visitCommentStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitDeclareClassStmt(value: (ClassStmt, js.Any) => js.Any): Self = this.set("visitDeclareClassStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitDeclareFunctionStmt(value: (DeclareFunctionStmt, js.Any) => js.Any): Self = this.set("visitDeclareFunctionStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitDeclareVarStmt(value: (DeclareVarStmt, js.Any) => js.Any): Self = this.set("visitDeclareVarStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitExpressionStmt(value: (ExpressionStatement, js.Any) => js.Any): Self = this.set("visitExpressionStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitIfStmt(value: (IfStmt_, js.Any) => js.Any): Self = this.set("visitIfStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitJSDocCommentStmt(value: (JSDocCommentStmt, js.Any) => js.Any): Self = this.set("visitJSDocCommentStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitReturnStmt(value: (ReturnStatement, js.Any) => js.Any): Self = this.set("visitReturnStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitThrowStmt(value: (ThrowStmt, js.Any) => js.Any): Self = this.set("visitThrowStmt", js.Any.fromFunction2(value))
    @scala.inline
    def setVisitTryCatchStmt(value: (TryCatchStmt, js.Any) => js.Any): Self = this.set("visitTryCatchStmt", js.Any.fromFunction2(value))
  }
  
}

