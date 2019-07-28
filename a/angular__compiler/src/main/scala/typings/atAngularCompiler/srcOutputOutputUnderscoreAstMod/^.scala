package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.Anon_IsEquivalent
import typings.atAngularCompiler.Anon_Key
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BOOL_TYPE: BuiltinType = js.native
  val CATCH_ERROR_VAR: ReadVarExpr = js.native
  val CATCH_STACK_VAR: ReadVarExpr = js.native
  val DYNAMIC_TYPE: BuiltinType = js.native
  val FUNCTION_TYPE: BuiltinType = js.native
  val INFERRED_TYPE: BuiltinType = js.native
  val INT_TYPE: BuiltinType = js.native
  val NONE_TYPE: BuiltinType = js.native
  val NULL_EXPR: LiteralExpr = js.native
  val NUMBER_TYPE: BuiltinType = js.native
  val STRING_TYPE: BuiltinType = js.native
  val SUPER_EXPR: ReadVarExpr = js.native
  val THIS_EXPR: ReadVarExpr = js.native
  val TYPED_NULL_EXPR: LiteralExpr = js.native
  def applySourceSpanToExpressionIfNeeded(expr: Expression): Expression = js.native
  def applySourceSpanToExpressionIfNeeded(expr: Expression, sourceSpan: ParseSourceSpan): Expression = js.native
  def applySourceSpanToStatementIfNeeded(stmt: Statement): Statement = js.native
  def applySourceSpanToStatementIfNeeded(stmt: Statement, sourceSpan: ParseSourceSpan): Statement = js.native
  def areAllEquivalent[T /* <: Anon_IsEquivalent[T] */](base: js.Array[T], other: js.Array[T]): Boolean = js.native
  def assertNotNull(expr: Expression): AssertNotNull = js.native
  def assertNotNull(expr: Expression, sourceSpan: ParseSourceSpan): AssertNotNull = js.native
  def collectExternalReferences(stmts: js.Array[Statement]): js.Array[ExternalReference] = js.native
  def expressionType(expr: Expression): ExpressionType = js.native
  def expressionType(expr: Expression, typeModifiers: js.Array[TypeModifier]): ExpressionType = js.native
  def expressionType(expr: Expression, typeModifiers: js.Array[TypeModifier], typeParams: js.Array[Type]): ExpressionType = js.native
  def expressionType(expr: Expression, typeModifiers: Null, typeParams: js.Array[Type]): ExpressionType = js.native
  def findReadVarNames(stmts: js.Array[Statement]): Set[String] = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement]): FunctionExpr = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement], `type`: Null, sourceSpan: Null, name: String): FunctionExpr = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement], `type`: Null, sourceSpan: ParseSourceSpan): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    name: String
  ): FunctionExpr = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type): FunctionExpr = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type, sourceSpan: Null, name: String): FunctionExpr = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type, sourceSpan: ParseSourceSpan): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    name: String
  ): FunctionExpr = js.native
  def ifStmt(condition: Expression, thenClause: js.Array[Statement]): IfStmt = js.native
  def ifStmt(condition: Expression, thenClause: js.Array[Statement], elseClause: js.Array[Statement]): IfStmt = js.native
  def importExpr(id: ExternalReference): ExternalExpr = js.native
  def importExpr(id: ExternalReference, typeParams: js.Array[Type]): ExternalExpr = js.native
  def importExpr(id: ExternalReference, typeParams: js.Array[Type], sourceSpan: ParseSourceSpan): ExternalExpr = js.native
  def importExpr(id: ExternalReference, typeParams: Null, sourceSpan: ParseSourceSpan): ExternalExpr = js.native
  def importType(id: ExternalReference): ExpressionType | Null = js.native
  def importType(id: ExternalReference, typeParams: js.Array[Type]): ExpressionType | Null = js.native
  def importType(id: ExternalReference, typeParams: js.Array[Type], typeModifiers: js.Array[TypeModifier]): ExpressionType | Null = js.native
  def importType(id: ExternalReference, typeParams: Null, typeModifiers: js.Array[TypeModifier]): ExpressionType | Null = js.native
  def isNull(exp: Expression): Boolean = js.native
  def literal(value: js.Any): LiteralExpr = js.native
  def literal(value: js.Any, `type`: Null, sourceSpan: ParseSourceSpan): LiteralExpr = js.native
  def literal(value: js.Any, `type`: Type): LiteralExpr = js.native
  def literal(value: js.Any, `type`: Type, sourceSpan: ParseSourceSpan): LiteralExpr = js.native
  def literalArr(values: js.Array[Expression]): LiteralArrayExpr = js.native
  def literalArr(values: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan): LiteralArrayExpr = js.native
  def literalArr(values: js.Array[Expression], `type`: Type): LiteralArrayExpr = js.native
  def literalArr(values: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan): LiteralArrayExpr = js.native
  def literalMap(values: js.Array[Anon_Key]): LiteralMapExpr = js.native
  def literalMap(values: js.Array[Anon_Key], `type`: MapType): LiteralMapExpr = js.native
  def not(expr: Expression): NotExpr = js.native
  def not(expr: Expression, sourceSpan: ParseSourceSpan): NotExpr = js.native
  def nullSafeIsEquivalent[T /* <: Anon_IsEquivalent[T] */](): Boolean = js.native
  def nullSafeIsEquivalent[T /* <: Anon_IsEquivalent[T] */](base: T): Boolean = js.native
  def nullSafeIsEquivalent[T /* <: Anon_IsEquivalent[T] */](base: T, other: T): Boolean = js.native
  def nullSafeIsEquivalent[T /* <: Anon_IsEquivalent[T] */](base: Null, other: T): Boolean = js.native
  def typeofExpr(expr: Expression): TypeofExpr = js.native
  def variable(name: String): ReadVarExpr = js.native
  def variable(name: String, `type`: Null, sourceSpan: ParseSourceSpan): ReadVarExpr = js.native
  def variable(name: String, `type`: Type): ReadVarExpr = js.native
  def variable(name: String, `type`: Type, sourceSpan: ParseSourceSpan): ReadVarExpr = js.native
}

