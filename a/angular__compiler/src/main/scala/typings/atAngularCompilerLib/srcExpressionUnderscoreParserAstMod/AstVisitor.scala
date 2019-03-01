package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AstVisitor extends js.Object {
  var visit: js.UndefOr[js.Function2[/* ast */ AST, /* context */ js.UndefOr[js.Any], _]] = js.undefined
  def visitBinary(ast: Binary, context: js.Any): js.Any
  def visitChain(ast: Chain, context: js.Any): js.Any
  def visitConditional(ast: Conditional, context: js.Any): js.Any
  def visitFunctionCall(ast: FunctionCall, context: js.Any): js.Any
  def visitImplicitReceiver(ast: ImplicitReceiver, context: js.Any): js.Any
  def visitInterpolation(ast: Interpolation, context: js.Any): js.Any
  def visitKeyedRead(ast: KeyedRead, context: js.Any): js.Any
  def visitKeyedWrite(ast: KeyedWrite, context: js.Any): js.Any
  def visitLiteralArray(ast: LiteralArray, context: js.Any): js.Any
  def visitLiteralMap(ast: LiteralMap, context: js.Any): js.Any
  def visitLiteralPrimitive(ast: LiteralPrimitive, context: js.Any): js.Any
  def visitMethodCall(ast: MethodCall, context: js.Any): js.Any
  def visitNonNullAssert(ast: NonNullAssert, context: js.Any): js.Any
  def visitPipe(ast: BindingPipe, context: js.Any): js.Any
  def visitPrefixNot(ast: PrefixNot, context: js.Any): js.Any
  def visitPropertyRead(ast: PropertyRead, context: js.Any): js.Any
  def visitPropertyWrite(ast: PropertyWrite, context: js.Any): js.Any
  def visitQuote(ast: Quote, context: js.Any): js.Any
  def visitSafeMethodCall(ast: SafeMethodCall, context: js.Any): js.Any
  def visitSafePropertyRead(ast: SafePropertyRead, context: js.Any): js.Any
}

object AstVisitor {
  @scala.inline
  def apply(
    visitBinary: js.Function2[Binary, js.Any, js.Any],
    visitChain: js.Function2[Chain, js.Any, js.Any],
    visitConditional: js.Function2[Conditional, js.Any, js.Any],
    visitFunctionCall: js.Function2[FunctionCall, js.Any, js.Any],
    visitImplicitReceiver: js.Function2[ImplicitReceiver, js.Any, js.Any],
    visitInterpolation: js.Function2[Interpolation, js.Any, js.Any],
    visitKeyedRead: js.Function2[KeyedRead, js.Any, js.Any],
    visitKeyedWrite: js.Function2[KeyedWrite, js.Any, js.Any],
    visitLiteralArray: js.Function2[LiteralArray, js.Any, js.Any],
    visitLiteralMap: js.Function2[LiteralMap, js.Any, js.Any],
    visitLiteralPrimitive: js.Function2[LiteralPrimitive, js.Any, js.Any],
    visitMethodCall: js.Function2[MethodCall, js.Any, js.Any],
    visitNonNullAssert: js.Function2[NonNullAssert, js.Any, js.Any],
    visitPipe: js.Function2[BindingPipe, js.Any, js.Any],
    visitPrefixNot: js.Function2[PrefixNot, js.Any, js.Any],
    visitPropertyRead: js.Function2[PropertyRead, js.Any, js.Any],
    visitPropertyWrite: js.Function2[PropertyWrite, js.Any, js.Any],
    visitQuote: js.Function2[Quote, js.Any, js.Any],
    visitSafeMethodCall: js.Function2[SafeMethodCall, js.Any, js.Any],
    visitSafePropertyRead: js.Function2[SafePropertyRead, js.Any, js.Any],
    visit: js.Function2[/* ast */ AST, /* context */ js.UndefOr[js.Any], _] = null
  ): AstVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitBinary")(visitBinary)
    __obj.updateDynamic("visitChain")(visitChain)
    __obj.updateDynamic("visitConditional")(visitConditional)
    __obj.updateDynamic("visitFunctionCall")(visitFunctionCall)
    __obj.updateDynamic("visitImplicitReceiver")(visitImplicitReceiver)
    __obj.updateDynamic("visitInterpolation")(visitInterpolation)
    __obj.updateDynamic("visitKeyedRead")(visitKeyedRead)
    __obj.updateDynamic("visitKeyedWrite")(visitKeyedWrite)
    __obj.updateDynamic("visitLiteralArray")(visitLiteralArray)
    __obj.updateDynamic("visitLiteralMap")(visitLiteralMap)
    __obj.updateDynamic("visitLiteralPrimitive")(visitLiteralPrimitive)
    __obj.updateDynamic("visitMethodCall")(visitMethodCall)
    __obj.updateDynamic("visitNonNullAssert")(visitNonNullAssert)
    __obj.updateDynamic("visitPipe")(visitPipe)
    __obj.updateDynamic("visitPrefixNot")(visitPrefixNot)
    __obj.updateDynamic("visitPropertyRead")(visitPropertyRead)
    __obj.updateDynamic("visitPropertyWrite")(visitPropertyWrite)
    __obj.updateDynamic("visitQuote")(visitQuote)
    __obj.updateDynamic("visitSafeMethodCall")(visitSafeMethodCall)
    __obj.updateDynamic("visitSafePropertyRead")(visitSafePropertyRead)
    if (visit != null) __obj.updateDynamic("visit")(visit)
    __obj.asInstanceOf[AstVisitor]
  }
}

