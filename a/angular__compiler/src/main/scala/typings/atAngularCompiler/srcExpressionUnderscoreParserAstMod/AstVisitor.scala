package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

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
    visitBinary: (Binary, js.Any) => js.Any,
    visitChain: (Chain, js.Any) => js.Any,
    visitConditional: (Conditional, js.Any) => js.Any,
    visitFunctionCall: (FunctionCall, js.Any) => js.Any,
    visitImplicitReceiver: (ImplicitReceiver, js.Any) => js.Any,
    visitInterpolation: (Interpolation, js.Any) => js.Any,
    visitKeyedRead: (KeyedRead, js.Any) => js.Any,
    visitKeyedWrite: (KeyedWrite, js.Any) => js.Any,
    visitLiteralArray: (LiteralArray, js.Any) => js.Any,
    visitLiteralMap: (LiteralMap, js.Any) => js.Any,
    visitLiteralPrimitive: (LiteralPrimitive, js.Any) => js.Any,
    visitMethodCall: (MethodCall, js.Any) => js.Any,
    visitNonNullAssert: (NonNullAssert, js.Any) => js.Any,
    visitPipe: (BindingPipe, js.Any) => js.Any,
    visitPrefixNot: (PrefixNot, js.Any) => js.Any,
    visitPropertyRead: (PropertyRead, js.Any) => js.Any,
    visitPropertyWrite: (PropertyWrite, js.Any) => js.Any,
    visitQuote: (Quote, js.Any) => js.Any,
    visitSafeMethodCall: (SafeMethodCall, js.Any) => js.Any,
    visitSafePropertyRead: (SafePropertyRead, js.Any) => js.Any,
    visit: (/* ast */ AST, /* context */ js.UndefOr[js.Any]) => _ = null
  ): AstVisitor = {
    val __obj = js.Dynamic.literal(visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2(visit))
    __obj.asInstanceOf[AstVisitor]
  }
}

