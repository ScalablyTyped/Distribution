package typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.AssertNotNull
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BinaryOperatorExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinMethod
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.CastExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ClassStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.CommaExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.CommentStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ConditionalExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.DeclareFunctionStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.DeclareVarStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExpressionStatement
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExpressionVisitor
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.FunctionExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.IfStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.InstantiateExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.InvokeMethodExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.JSDocCommentStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.NotExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadKeyExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadPropExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadVarExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReturnStatement
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StatementVisitor
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ThrowStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.TryCatchStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.TypeofExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.WrappedNodeExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.WriteKeyExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.WritePropExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.WriteVarExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_emitter", "AbstractEmitterVisitor")
@js.native
abstract class AbstractEmitterVisitor protected ()
  extends StatementVisitor
     with ExpressionVisitor {
  def this(_escapeDollarInStrings: Boolean) = this()
  var _escapeDollarInStrings: js.Any = js.native
  def getBuiltinMethodName(method: BuiltinMethod): String = js.native
  def visitAllExpressions(expressions: js.Array[Expression], ctx: EmitterVisitorContext, separator: String): Unit = js.native
  def visitAllObjects[T](
    handler: js.Function1[/* t */ T, Unit],
    expressions: js.Array[T],
    ctx: EmitterVisitorContext,
    separator: String
  ): Unit = js.native
  def visitAllStatements(statements: js.Array[Statement], ctx: EmitterVisitorContext): Unit = js.native
  /* CompleteClass */
  override def visitAssertNotNullExpr(ast: AssertNotNull, context: js.Any): js.Any = js.native
  def visitAssertNotNullExpr(ast: AssertNotNull, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any = js.native
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitCastExpr(ast: CastExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any = js.native
  def visitCommaExpr(ast: CommaExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitCommentStmt(stmt: CommentStmt, context: js.Any): js.Any = js.native
  def visitCommentStmt(stmt: CommentStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any = js.native
  def visitConditionalExpr(ast: ConditionalExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareClassStmt(stmt: ClassStmt, context: js.Any): js.Any = js.native
  def visitDeclareClassStmt(stmt: ClassStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareVarStmt(stmt: DeclareVarStmt, context: js.Any): js.Any = js.native
  def visitDeclareVarStmt(stmt: DeclareVarStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitExpressionStmt(stmt: ExpressionStatement, context: js.Any): js.Any = js.native
  def visitExpressionStmt(stmt: ExpressionStatement, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any = js.native
  def visitExternalExpr(ast: ExternalExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any = js.native
  def visitFunctionExpr(ast: FunctionExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitIfStmt(stmt: IfStmt, context: js.Any): js.Any = js.native
  def visitIfStmt(stmt: IfStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any = js.native
  def visitInstantiateExpr(ast: InstantiateExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any = js.native
  def visitInvokeFunctionExpr(expr: InvokeFunctionExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any = js.native
  def visitInvokeMethodExpr(expr: InvokeMethodExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitJSDocCommentStmt(stmt: JSDocCommentStmt, context: js.Any): js.Any = js.native
  def visitJSDocCommentStmt(stmt: JSDocCommentStmt, ctx: EmitterVisitorContext): Null = js.native
  /* CompleteClass */
  override def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any = js.native
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any = js.native
  def visitLiteralExpr(ast: LiteralExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any = js.native
  def visitLiteralMapExpr(ast: LiteralMapExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitNotExpr(ast: NotExpr, context: js.Any): js.Any = js.native
  def visitNotExpr(ast: NotExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any = js.native
  def visitReadKeyExpr(ast: ReadKeyExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any = js.native
  def visitReadPropExpr(ast: ReadPropExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any = js.native
  def visitReadVarExpr(ast: ReadVarExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReturnStmt(stmt: ReturnStatement, context: js.Any): js.Any = js.native
  def visitReturnStmt(stmt: ReturnStatement, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitThrowStmt(stmt: ThrowStmt, context: js.Any): js.Any = js.native
  def visitThrowStmt(stmt: ThrowStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitTryCatchStmt(stmt: TryCatchStmt, context: js.Any): js.Any = js.native
  def visitTryCatchStmt(stmt: TryCatchStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitTypeofExpr(ast: TypeofExpr, context: js.Any): js.Any = js.native
  def visitTypeofExpr(expr: TypeofExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any = js.native
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any = js.native
  def visitWriteKeyExpr(expr: WriteKeyExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any = js.native
  def visitWritePropExpr(expr: WritePropExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any = js.native
  def visitWriteVarExpr(expr: WriteVarExpr, ctx: EmitterVisitorContext): js.Any = js.native
}

