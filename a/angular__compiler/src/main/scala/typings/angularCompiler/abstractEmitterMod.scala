package typings.angularCompiler

import typings.angularCompiler.outputAstMod.AssertNotNull_
import typings.angularCompiler.outputAstMod.BinaryOperatorExpr
import typings.angularCompiler.outputAstMod.BuiltinMethod
import typings.angularCompiler.outputAstMod.CastExpr
import typings.angularCompiler.outputAstMod.ClassStmt
import typings.angularCompiler.outputAstMod.CommaExpr
import typings.angularCompiler.outputAstMod.CommentStmt
import typings.angularCompiler.outputAstMod.ConditionalExpr
import typings.angularCompiler.outputAstMod.DeclareFunctionStmt
import typings.angularCompiler.outputAstMod.DeclareVarStmt
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExpressionStatement
import typings.angularCompiler.outputAstMod.ExpressionVisitor
import typings.angularCompiler.outputAstMod.ExternalExpr
import typings.angularCompiler.outputAstMod.FunctionExpr
import typings.angularCompiler.outputAstMod.IfStmt_
import typings.angularCompiler.outputAstMod.InstantiateExpr
import typings.angularCompiler.outputAstMod.InvokeFunctionExpr
import typings.angularCompiler.outputAstMod.InvokeMethodExpr
import typings.angularCompiler.outputAstMod.JSDocCommentStmt
import typings.angularCompiler.outputAstMod.LiteralArrayExpr
import typings.angularCompiler.outputAstMod.LiteralExpr
import typings.angularCompiler.outputAstMod.LiteralMapExpr
import typings.angularCompiler.outputAstMod.LocalizedString_
import typings.angularCompiler.outputAstMod.NotExpr
import typings.angularCompiler.outputAstMod.ReadKeyExpr
import typings.angularCompiler.outputAstMod.ReadPropExpr
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.ReturnStatement
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.StatementVisitor
import typings.angularCompiler.outputAstMod.ThrowStmt
import typings.angularCompiler.outputAstMod.TryCatchStmt
import typings.angularCompiler.outputAstMod.TypeofExpr_
import typings.angularCompiler.outputAstMod.WrappedNodeExpr
import typings.angularCompiler.outputAstMod.WriteKeyExpr
import typings.angularCompiler.outputAstMod.WritePropExpr
import typings.angularCompiler.outputAstMod.WriteVarExpr
import typings.angularCompiler.sourceMapMod.SourceMapGenerator
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_emitter", JSImport.Namespace)
@js.native
object abstractEmitterMod extends js.Object {
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
    override def visitAssertNotNullExpr(ast: AssertNotNull_, context: js.Any): js.Any = js.native
    def visitAssertNotNullExpr(ast: AssertNotNull_, ctx: EmitterVisitorContext): js.Any = js.native
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
    override def visitIfStmt(stmt: IfStmt_, context: js.Any): js.Any = js.native
    def visitIfStmt(stmt: IfStmt_, ctx: EmitterVisitorContext): js.Any = js.native
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
    override def visitLocalizedString(ast: LocalizedString_, context: js.Any): js.Any = js.native
    def visitLocalizedString(ast: LocalizedString_, ctx: EmitterVisitorContext): js.Any = js.native
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
    override def visitTypeofExpr(ast: TypeofExpr_, context: js.Any): js.Any = js.native
    def visitTypeofExpr(expr: TypeofExpr_, ctx: EmitterVisitorContext): js.Any = js.native
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
  
  @js.native
  class EmitterVisitorContext protected () extends js.Object {
    def this(_indent: Double) = this()
    var _classes: js.Any = js.native
    var _indent: js.Any = js.native
    var _lines: js.Any = js.native
    var _preambleLineCount: js.Any = js.native
    def currentClass: ClassStmt | Null = js.native
    def decIndent(): Unit = js.native
    def incIndent(): Unit = js.native
    def lineIsEmpty(): Boolean = js.native
    def lineLength(): Double = js.native
    def popClass(): ClassStmt = js.native
    def print(from: Null, part: String): Unit = js.native
    def print(from: Null, part: String, newLine: Boolean): Unit = js.native
    def print(from: AnonSourceSpan, part: String): Unit = js.native
    def print(from: AnonSourceSpan, part: String, newLine: Boolean): Unit = js.native
    def println(): Unit = js.native
    def println(from: Null, lastPart: String): Unit = js.native
    def println(from: AnonSourceSpan): Unit = js.native
    def println(from: AnonSourceSpan, lastPart: String): Unit = js.native
    def pushClass(clazz: ClassStmt): Unit = js.native
    def removeEmptyLastLine(): Unit = js.native
    def setPreambleLineCount(count: Double): Double = js.native
    def spanOf(line: Double, column: Double): ParseSourceSpan | Null = js.native
    def toSource(): String = js.native
    def toSourceMapGenerator(genFilePath: String): SourceMapGenerator = js.native
    def toSourceMapGenerator(genFilePath: String, startsAtLine: Double): SourceMapGenerator = js.native
  }
  
  @js.native
  trait OutputEmitter extends js.Object {
    def emitStatements(genFilePath: String, stmts: js.Array[Statement]): String = js.native
    def emitStatements(genFilePath: String, stmts: js.Array[Statement], preamble: String): String = js.native
  }
  
  val CATCH_ERROR_VAR: ReadVarExpr = js.native
  val CATCH_STACK_VAR: ReadVarExpr = js.native
  def escapeIdentifier(input: String, escapeDollar: Boolean): js.Any = js.native
  def escapeIdentifier(input: String, escapeDollar: Boolean, alwaysQuote: Boolean): js.Any = js.native
  /* static members */
  @js.native
  object EmitterVisitorContext extends js.Object {
    def createRoot(): EmitterVisitorContext = js.native
  }
  
}

