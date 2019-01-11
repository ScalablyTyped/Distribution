package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BOOL_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val CATCH_ERROR_VAR: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  val CATCH_STACK_VAR: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  val DYNAMIC_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val FUNCTION_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val INFERRED_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val INT_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val NONE_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val NULL_EXPR: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr = js.native
  val NUMBER_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val STRING_TYPE: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinType = js.native
  val SUPER_EXPR: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  val THIS_EXPR: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  val TYPED_NULL_EXPR: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr = js.native
  def applySourceSpanToExpressionIfNeeded(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def applySourceSpanToExpressionIfNeeded(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def applySourceSpanToStatementIfNeeded(stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement = js.native
  def applySourceSpanToStatementIfNeeded(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement = js.native
  def areAllEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: js.Array[T], other: js.Array[T]): scala.Boolean = js.native
  def assertNotNull(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.AssertNotNull = js.native
  def assertNotNull(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.AssertNotNull = js.native
  def collectExternalReferences(stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference] = js.native
  def expressionType(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType = js.native
  def expressionType(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    typeModifiers: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeModifier]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType = js.native
  def expressionType(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    typeModifiers: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeModifier],
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType = js.native
  def expressionType(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    typeModifiers: scala.Null,
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType = js.native
  def findReadVarNames(stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]): stdLib.Set[java.lang.String] = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: scala.Null,
    name: java.lang.String
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    name: java.lang.String
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def fn(
    params: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FnParam],
    body: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: scala.Null,
    sourceSpan: scala.Null,
    name: java.lang.String
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def ifStmt(
    condition: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    thenClause: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.IfStmt = js.native
  def ifStmt(
    condition: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    thenClause: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    elseClause: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.IfStmt = js.native
  def importExpr(id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr = js.native
  def importExpr(
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr = js.native
  def importExpr(
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type],
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr = js.native
  def importExpr(
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    typeParams: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr = js.native
  def importType(id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType | scala.Null = js.native
  def importType(
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType | scala.Null = js.native
  def importType(
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type],
    typeModifiers: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeModifier]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType | scala.Null = js.native
  def importType(
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    typeParams: scala.Null,
    typeModifiers: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeModifier]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType | scala.Null = js.native
  def isNull(exp: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Boolean = js.native
  def literal(value: js.Any): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr = js.native
  def literal(value: js.Any, `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr = js.native
  def literal(
    value: js.Any,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr = js.native
  def literal(
    value: js.Any,
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralExpr = js.native
  def literalArr(values: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr = js.native
  def literalArr(
    values: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr = js.native
  def literalArr(
    values: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr = js.native
  def literalArr(
    values: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralArrayExpr = js.native
  def literalMap(values: js.Array[atAngularCompilerLib.Anon_KeyQuoted]): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def literalMap(
    values: js.Array[atAngularCompilerLib.Anon_KeyQuoted],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.MapType
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def not(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.NotExpr = js.native
  def not(
    expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.NotExpr = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](): scala.Boolean = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: T): scala.Boolean = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: T, other: T): scala.Boolean = js.native
  def nullSafeIsEquivalent[T /* <: atAngularCompilerLib.Anon_IsEquivalent[T] */](base: scala.Null, other: T): scala.Boolean = js.native
  def typeofExpr(expr: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.TypeofExpr = js.native
  def variable(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def variable(name: java.lang.String, `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def variable(
    name: java.lang.String,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def variable(
    name: java.lang.String,
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
}

