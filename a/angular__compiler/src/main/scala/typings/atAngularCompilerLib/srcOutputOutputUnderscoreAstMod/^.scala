package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

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
  def applySourceSpanToExpressionIfNeeded(expr: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): Expression = js.native
  def applySourceSpanToStatementIfNeeded(stmt: Statement): Statement = js.native
  def applySourceSpanToStatementIfNeeded(stmt: Statement, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): Statement = js.native
  def areAllEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: js.Array[T], other: js.Array[T]): scala.Boolean = js.native
  def assertNotNull(expr: Expression): AssertNotNull = js.native
  def assertNotNull(expr: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): AssertNotNull = js.native
  def collectExternalReferences(stmts: js.Array[Statement]): js.Array[ExternalReference] = js.native
  def expressionType(expr: Expression): ExpressionType = js.native
  def expressionType(expr: Expression, typeModifiers: js.Array[TypeModifier]): ExpressionType = js.native
  def expressionType(expr: Expression, typeModifiers: js.Array[TypeModifier], typeParams: js.Array[Type]): ExpressionType = js.native
  def expressionType(expr: Expression, typeModifiers: scala.Null, typeParams: js.Array[Type]): ExpressionType = js.native
  def findReadVarNames(stmts: js.Array[Statement]): stdLib.Set[java.lang.String] = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement]): FunctionExpr = js.native
  def fn(params: js.Array[FnParam], body: js.Array[Statement], `type`: Type): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: Type,
    sourceSpan: scala.Null,
    name: java.lang.String
  ): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): FunctionExpr = js.native
  def fn(
    params: js.Array[FnParam],
    body: js.Array[Statement],
    `type`: scala.Null,
    sourceSpan: scala.Null,
    name: java.lang.String
  ): FunctionExpr = js.native
  def ifStmt(condition: Expression, thenClause: js.Array[Statement]): IfStmt = js.native
  def ifStmt(condition: Expression, thenClause: js.Array[Statement], elseClause: js.Array[Statement]): IfStmt = js.native
  def importExpr(id: ExternalReference): ExternalExpr = js.native
  def importExpr(id: ExternalReference, typeParams: js.Array[Type]): ExternalExpr = js.native
  def importExpr(
    id: ExternalReference,
    typeParams: js.Array[Type],
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ExternalExpr = js.native
  def importExpr(
    id: ExternalReference,
    typeParams: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ExternalExpr = js.native
  def importType(id: ExternalReference): ExpressionType | scala.Null = js.native
  def importType(id: ExternalReference, typeParams: js.Array[Type]): ExpressionType | scala.Null = js.native
  def importType(id: ExternalReference, typeParams: js.Array[Type], typeModifiers: js.Array[TypeModifier]): ExpressionType | scala.Null = js.native
  def importType(id: ExternalReference, typeParams: scala.Null, typeModifiers: js.Array[TypeModifier]): ExpressionType | scala.Null = js.native
  def isNull(exp: Expression): scala.Boolean = js.native
  def literal(value: js.Any): LiteralExpr = js.native
  def literal(value: js.Any, `type`: Type): LiteralExpr = js.native
  def literal(
    value: js.Any,
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): LiteralExpr = js.native
  def literal(
    value: js.Any,
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): LiteralExpr = js.native
  def literalArr(values: js.Array[Expression]): LiteralArrayExpr = js.native
  def literalArr(values: js.Array[Expression], `type`: Type): LiteralArrayExpr = js.native
  def literalArr(
    values: js.Array[Expression],
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): LiteralArrayExpr = js.native
  def literalArr(
    values: js.Array[Expression],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): LiteralArrayExpr = js.native
  def literalMap(values: js.Array[atAngularCompilerLib.Anon_Key]): LiteralMapExpr = js.native
  def literalMap(values: js.Array[atAngularCompilerLib.Anon_Key], `type`: MapType): LiteralMapExpr = js.native
  def not(expr: Expression): NotExpr = js.native
  def not(expr: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): NotExpr = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](): scala.Boolean = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: T): scala.Boolean = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: T, other: T): scala.Boolean = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: scala.Null, other: T): scala.Boolean = js.native
  def typeofExpr(expr: Expression): TypeofExpr = js.native
  def variable(name: java.lang.String): ReadVarExpr = js.native
  def variable(name: java.lang.String, `type`: Type): ReadVarExpr = js.native
  def variable(
    name: java.lang.String,
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ReadVarExpr = js.native
  def variable(
    name: java.lang.String,
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ReadVarExpr = js.native
}

