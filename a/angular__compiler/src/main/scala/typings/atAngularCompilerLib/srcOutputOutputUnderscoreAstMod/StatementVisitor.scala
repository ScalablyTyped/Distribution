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

