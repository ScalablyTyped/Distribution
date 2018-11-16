package typings
package atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_emitter", "AbstractEmitterVisitor")
@js.native
abstract class AbstractEmitterVisitor protected ()
  extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.StatementVisitor
     with atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionVisitor {
  def this(_escapeDollarInStrings: scala.Boolean) = this()
  var _escapeDollarInStrings: js.Any = js.native
  def getBuiltinMethodName(method: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinMethod): java.lang.String = js.native
  def visitAllExpressions(
    expressions: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    ctx: EmitterVisitorContext,
    separator: java.lang.String
  ): scala.Unit = js.native
  def visitAllObjects[T](
    handler: js.Function1[/* t */ T, scala.Unit],
    expressions: js.Array[T],
    ctx: EmitterVisitorContext,
    separator: java.lang.String
  ): scala.Unit = js.native
  def visitAllStatements(
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    ctx: EmitterVisitorContext
  ): scala.Unit = js.native
  /* CompleteClass */
  override def visitAssertNotNullExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.AssertNotNull, context: js.Any): js.Any = js.native
  def visitAssertNotNullExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.AssertNotNull,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitBinaryOperatorExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BinaryOperatorExpr, context: js.Any): js.Any = js.native
  def visitBinaryOperatorExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BinaryOperatorExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitCastExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.CastExpr, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitCommaExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.CommaExpr, context: js.Any): js.Any = js.native
  def visitCommaExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.CommaExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitCommentStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.CommentStmt, context: js.Any): js.Any = js.native
  def visitCommentStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.CommentStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitConditionalExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ConditionalExpr, context: js.Any): js.Any = js.native
  def visitConditionalExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ConditionalExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareClassStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ClassStmt, context: js.Any): js.Any = js.native
  def visitDeclareClassStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ClassStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareFunctionStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.DeclareFunctionStmt, context: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitDeclareVarStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.DeclareVarStmt, context: js.Any): js.Any = js.native
  def visitDeclareVarStmt(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.DeclareVarStmt,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitExpressionStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionStatement, context: js.Any): js.Any = js.native
  def visitExpressionStmt(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionStatement,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitExternalExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr, context: js.Any): js.Any = js.native
  def visitExternalExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr, context: js.Any): js.Any = js.native
  def visitFunctionExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitIfStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.IfStmt, context: js.Any): js.Any = js.native
  def visitIfStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.IfStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitInstantiateExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InstantiateExpr, context: js.Any): js.Any = js.native
  def visitInstantiateExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InstantiateExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitInvokeFunctionExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr, context: js.Any): js.Any = js.native
  def visitInvokeFunctionExpr(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitInvokeMethodExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeMethodExpr, context: js.Any): js.Any = js.native
  def visitInvokeMethodExpr(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.InvokeMethodExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitJSDocCommentStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocCommentStmt, context: js.Any): js.Any = js.native
  def visitJSDocCommentStmt(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocCommentStmt,
    ctx: EmitterVisitorContext
  ): scala.Null = js.native
  /* CompleteClass */
  override def visitLiteralArrayExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr, context: js.Any): js.Any = js.native
  def visitLiteralArrayExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr, context: js.Any): js.Any = js.native
  def visitLiteralExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitLiteralMapExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralMapExpr, context: js.Any): js.Any = js.native
  def visitLiteralMapExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralMapExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitNotExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.NotExpr, context: js.Any): js.Any = js.native
  def visitNotExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.NotExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReadKeyExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadKeyExpr, context: js.Any): js.Any = js.native
  def visitReadKeyExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadKeyExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReadPropExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadPropExpr, context: js.Any): js.Any = js.native
  def visitReadPropExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadPropExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReadVarExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, context: js.Any): js.Any = js.native
  def visitReadVarExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitReturnStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReturnStatement, context: js.Any): js.Any = js.native
  def visitReturnStmt(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReturnStatement,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitThrowStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ThrowStmt, context: js.Any): js.Any = js.native
  def visitThrowStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ThrowStmt, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitTryCatchStmt(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TryCatchStmt, context: js.Any): js.Any = js.native
  def visitTryCatchStmt(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TryCatchStmt,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitTypeofExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeofExpr, context: js.Any): js.Any = js.native
  def visitTypeofExpr(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeofExpr, ctx: EmitterVisitorContext): js.Any = js.native
  /* CompleteClass */
  override def visitWrappedNodeExpr(ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WrappedNodeExpr[_], context: js.Any): js.Any = js.native
  def visitWrappedNodeExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WrappedNodeExpr[_],
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitWriteKeyExpr(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WriteKeyExpr, context: js.Any): js.Any = js.native
  def visitWriteKeyExpr(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WriteKeyExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitWritePropExpr(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WritePropExpr, context: js.Any): js.Any = js.native
  def visitWritePropExpr(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WritePropExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
  /* CompleteClass */
  override def visitWriteVarExpr(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WriteVarExpr, context: js.Any): js.Any = js.native
  def visitWriteVarExpr(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.WriteVarExpr,
    ctx: EmitterVisitorContext
  ): js.Any = js.native
}

