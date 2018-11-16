package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "Expression")
@js.native
abstract class Expression () extends js.Object {
  def this(`type`: Type) = this()
  def this(`type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(`type`: js.UndefOr[scala.Nothing], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(`type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  var `type`: Type | scala.Null = js.native
  def and(rhs: Expression): BinaryOperatorExpr = js.native
  def and(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def bigger(rhs: Expression): BinaryOperatorExpr = js.native
  def bigger(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def biggerEquals(rhs: Expression): BinaryOperatorExpr = js.native
  def biggerEquals(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def bitwiseAnd(
    rhs: Expression,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    parens: scala.Boolean
  ): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression, sourceSpan: scala.Null, parens: scala.Boolean): BinaryOperatorExpr = js.native
  def callFn(params: js.Array[Expression]): InvokeFunctionExpr = js.native
  def callFn(
    params: js.Array[Expression],
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): InvokeFunctionExpr = js.native
  def callMethod(name: BuiltinMethod, params: js.Array[Expression]): InvokeMethodExpr = js.native
  def callMethod(
    name: BuiltinMethod,
    params: js.Array[Expression],
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): InvokeMethodExpr = js.native
  def callMethod(name: java.lang.String, params: js.Array[Expression]): InvokeMethodExpr = js.native
  def callMethod(
    name: java.lang.String,
    params: js.Array[Expression],
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): InvokeMethodExpr = js.native
  def cast(`type`: Type): Expression = js.native
  def cast(`type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): Expression = js.native
  def conditional(trueCase: Expression): ConditionalExpr = js.native
  def conditional(trueCase: Expression, falseCase: Expression): ConditionalExpr = js.native
  def conditional(
    trueCase: Expression,
    falseCase: Expression,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ConditionalExpr = js.native
  def conditional(
    trueCase: Expression,
    falseCase: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ConditionalExpr = js.native
  def divide(rhs: Expression): BinaryOperatorExpr = js.native
  def divide(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def equals(rhs: Expression): BinaryOperatorExpr = js.native
  def equals(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def identical(rhs: Expression): BinaryOperatorExpr = js.native
  def identical(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def instantiate(params: js.Array[Expression]): InstantiateExpr = js.native
  def instantiate(params: js.Array[Expression], `type`: Type): InstantiateExpr = js.native
  def instantiate(
    params: js.Array[Expression],
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): InstantiateExpr = js.native
  def instantiate(
    params: js.Array[Expression],
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): InstantiateExpr = js.native
  def isBlank(): Expression = js.native
  def isBlank(sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): Expression = js.native
  /**
       * Return true if the expression is constant.
       */
  def isConstant(): scala.Boolean = js.native
  /**
       * Calculates whether this expression produces the same value as the given expression.
       * Note: We don't check Types nor ParseSourceSpans nor function arguments.
       */
  def isEquivalent(e: Expression): scala.Boolean = js.native
  def key(index: Expression): ReadKeyExpr = js.native
  def key(index: Expression, `type`: Type): ReadKeyExpr = js.native
  def key(
    index: Expression,
    `type`: Type,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ReadKeyExpr = js.native
  def key(
    index: Expression,
    `type`: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): ReadKeyExpr = js.native
  def lower(rhs: Expression): BinaryOperatorExpr = js.native
  def lower(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def lowerEquals(rhs: Expression): BinaryOperatorExpr = js.native
  def lowerEquals(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def minus(rhs: Expression): BinaryOperatorExpr = js.native
  def minus(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def modulo(rhs: Expression): BinaryOperatorExpr = js.native
  def modulo(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def multiply(rhs: Expression): BinaryOperatorExpr = js.native
  def multiply(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def notEquals(rhs: Expression): BinaryOperatorExpr = js.native
  def notEquals(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def notIdentical(rhs: Expression): BinaryOperatorExpr = js.native
  def notIdentical(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def or(rhs: Expression): BinaryOperatorExpr = js.native
  def or(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def plus(rhs: Expression): BinaryOperatorExpr = js.native
  def plus(rhs: Expression, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): BinaryOperatorExpr = js.native
  def prop(name: java.lang.String): ReadPropExpr = js.native
  def prop(name: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): ReadPropExpr = js.native
  def toStmt(): Statement = js.native
  def visitExpression(visitor: ExpressionVisitor, context: js.Any): js.Any = js.native
}

