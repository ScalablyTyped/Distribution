package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "RecursiveAstVisitor")
@js.native
class RecursiveAstVisitor ()
  extends StatementVisitor
     with ExpressionVisitor {
  def visitAllExpressions(exprs: js.Array[Expression], context: js.Any): Unit = js.native
  def visitAllStatements(stmts: js.Array[Statement], context: js.Any): Unit = js.native
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitAssertNotNullExpr(ast: AssertNotNull, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any = js.native
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitCastExpr(ast: CastExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitCommentStmt(stmt: CommentStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareClassStmt(stmt: ClassStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareVarStmt(stmt: DeclareVarStmt, context: js.Any): js.Any = js.native
  def visitExpression(ast: Expression, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitExpressionStmt(stmt: ExpressionStatement, context: js.Any): js.Any = js.native
  def visitExpressionType(`type`: ExpressionType, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitIfStmt(stmt: IfStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitJSDocCommentStmt(stmt: JSDocCommentStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any = js.native
  def visitMapType(`type`: MapType, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitNotExpr(ast: NotExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitReturnStmt(stmt: ReturnStatement, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitThrowStmt(stmt: ThrowStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitTryCatchStmt(stmt: TryCatchStmt, context: js.Any): js.Any = js.native
  def visitType(ast: Type, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitTypeofExpr(ast: TypeofExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any = js.native
}

