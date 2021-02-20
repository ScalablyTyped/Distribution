package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "Expression")
@js.native
abstract class Expression () extends StObject {
  def this(`type`: Type) = this()
  def this(`type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(`type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(`type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  def and(rhs: Expression): BinaryOperatorExpr = js.native
  def and(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def bigger(rhs: Expression): BinaryOperatorExpr = js.native
  def bigger(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def biggerEquals(rhs: Expression): BinaryOperatorExpr = js.native
  def biggerEquals(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def bitwiseAnd(rhs: Expression): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression, sourceSpan: js.UndefOr[scala.Nothing], parens: Boolean): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression, sourceSpan: Null, parens: Boolean): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  def bitwiseAnd(rhs: Expression, sourceSpan: ParseSourceSpan, parens: Boolean): BinaryOperatorExpr = js.native
  
  def callFn(params: js.Array[Expression]): InvokeFunctionExpr = js.native
  def callFn(params: js.Array[Expression], sourceSpan: js.UndefOr[scala.Nothing], pure: Boolean): InvokeFunctionExpr = js.native
  def callFn(params: js.Array[Expression], sourceSpan: Null, pure: Boolean): InvokeFunctionExpr = js.native
  def callFn(params: js.Array[Expression], sourceSpan: ParseSourceSpan): InvokeFunctionExpr = js.native
  def callFn(params: js.Array[Expression], sourceSpan: ParseSourceSpan, pure: Boolean): InvokeFunctionExpr = js.native
  
  def callMethod(name: String, params: js.Array[Expression]): InvokeMethodExpr = js.native
  def callMethod(name: String, params: js.Array[Expression], sourceSpan: ParseSourceSpan): InvokeMethodExpr = js.native
  def callMethod(name: BuiltinMethod, params: js.Array[Expression]): InvokeMethodExpr = js.native
  def callMethod(name: BuiltinMethod, params: js.Array[Expression], sourceSpan: ParseSourceSpan): InvokeMethodExpr = js.native
  
  def cast(`type`: Type): Expression = js.native
  def cast(`type`: Type, sourceSpan: ParseSourceSpan): Expression = js.native
  
  def conditional(trueCase: Expression): ConditionalExpr = js.native
  def conditional(trueCase: Expression, falseCase: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan): ConditionalExpr = js.native
  def conditional(trueCase: Expression, falseCase: Null, sourceSpan: ParseSourceSpan): ConditionalExpr = js.native
  def conditional(trueCase: Expression, falseCase: Expression): ConditionalExpr = js.native
  def conditional(trueCase: Expression, falseCase: Expression, sourceSpan: ParseSourceSpan): ConditionalExpr = js.native
  
  def divide(rhs: Expression): BinaryOperatorExpr = js.native
  def divide(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def equals(rhs: Expression): BinaryOperatorExpr = js.native
  def equals(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def identical(rhs: Expression): BinaryOperatorExpr = js.native
  def identical(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def instantiate(params: js.Array[Expression]): InstantiateExpr = js.native
  def instantiate(params: js.Array[Expression], `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan): InstantiateExpr = js.native
  def instantiate(params: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan): InstantiateExpr = js.native
  def instantiate(params: js.Array[Expression], `type`: Type): InstantiateExpr = js.native
  def instantiate(params: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan): InstantiateExpr = js.native
  
  def isBlank(): Expression = js.native
  def isBlank(sourceSpan: ParseSourceSpan): Expression = js.native
  
  /**
    * Return true if the expression is constant.
    */
  def isConstant(): Boolean = js.native
  
  /**
    * Calculates whether this expression produces the same value as the given expression.
    * Note: We don't check Types nor ParseSourceSpans nor function arguments.
    */
  def isEquivalent(e: Expression): Boolean = js.native
  
  def key(index: Expression): ReadKeyExpr = js.native
  def key(index: Expression, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan): ReadKeyExpr = js.native
  def key(index: Expression, `type`: Null, sourceSpan: ParseSourceSpan): ReadKeyExpr = js.native
  def key(index: Expression, `type`: Type): ReadKeyExpr = js.native
  def key(index: Expression, `type`: Type, sourceSpan: ParseSourceSpan): ReadKeyExpr = js.native
  
  def lower(rhs: Expression): BinaryOperatorExpr = js.native
  def lower(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def lowerEquals(rhs: Expression): BinaryOperatorExpr = js.native
  def lowerEquals(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def minus(rhs: Expression): BinaryOperatorExpr = js.native
  def minus(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def modulo(rhs: Expression): BinaryOperatorExpr = js.native
  def modulo(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def multiply(rhs: Expression): BinaryOperatorExpr = js.native
  def multiply(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def notEquals(rhs: Expression): BinaryOperatorExpr = js.native
  def notEquals(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def notIdentical(rhs: Expression): BinaryOperatorExpr = js.native
  def notIdentical(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def or(rhs: Expression): BinaryOperatorExpr = js.native
  def or(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def plus(rhs: Expression): BinaryOperatorExpr = js.native
  def plus(rhs: Expression, sourceSpan: ParseSourceSpan): BinaryOperatorExpr = js.native
  
  def prop(name: String): ReadPropExpr = js.native
  def prop(name: String, sourceSpan: ParseSourceSpan): ReadPropExpr = js.native
  
  var sourceSpan: ParseSourceSpan | Null = js.native
  
  def toStmt(): Statement = js.native
  
  var `type`: Type | Null = js.native
  
  def visitExpression(visitor: ExpressionVisitor, context: js.Any): js.Any = js.native
}
