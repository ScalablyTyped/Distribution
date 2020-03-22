package typings.angularCompiler.parserMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.astMod.AstVisitor
import typings.angularCompiler.astMod.Binary
import typings.angularCompiler.astMod.BindingPipe
import typings.angularCompiler.astMod.Chain
import typings.angularCompiler.astMod.Conditional
import typings.angularCompiler.astMod.FunctionCall
import typings.angularCompiler.astMod.ImplicitReceiver
import typings.angularCompiler.astMod.Interpolation
import typings.angularCompiler.astMod.KeyedRead
import typings.angularCompiler.astMod.KeyedWrite
import typings.angularCompiler.astMod.LiteralArray
import typings.angularCompiler.astMod.LiteralMap
import typings.angularCompiler.astMod.LiteralPrimitive
import typings.angularCompiler.astMod.MethodCall
import typings.angularCompiler.astMod.NonNullAssert
import typings.angularCompiler.astMod.PrefixNot
import typings.angularCompiler.astMod.PropertyRead
import typings.angularCompiler.astMod.PropertyWrite
import typings.angularCompiler.astMod.Quote
import typings.angularCompiler.astMod.SafeMethodCall
import typings.angularCompiler.astMod.SafePropertyRead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleExpressionChecker extends AstVisitor {
  var errors: js.Array[String]
  def visitAll(asts: js.Array[_]): js.Array[_]
}

object SimpleExpressionChecker {
  @scala.inline
  def apply(
    errors: js.Array[String],
    visitAll: js.Array[_] => js.Array[_],
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
    visit: (/* ast */ AST, /* context */ js.UndefOr[js.Any]) => _ = null,
    visitASTWithSource: (/* ast */ ASTWithSource, /* context */ js.Any) => _ = null
  ): SimpleExpressionChecker = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], visitAll = js.Any.fromFunction1(visitAll), visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction2(visit))
    if (visitASTWithSource != null) __obj.updateDynamic("visitASTWithSource")(js.Any.fromFunction2(visitASTWithSource))
    __obj.asInstanceOf[SimpleExpressionChecker]
  }
}

