package typings.angularCompiler.parserMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleExpressionChecker extends AstVisitor {
  var errors: js.Array[String] = js.native
  def visitAll(asts: js.Array[_], context: js.Any): js.Array[_] = js.native
}

object SimpleExpressionChecker {
  @scala.inline
  def apply(
    errors: js.Array[String],
    visitAll: (js.Array[_], js.Any) => js.Array[_],
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
    visitSafePropertyRead: (SafePropertyRead, js.Any) => js.Any
  ): SimpleExpressionChecker = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], visitAll = js.Any.fromFunction2(visitAll), visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    __obj.asInstanceOf[SimpleExpressionChecker]
  }
  @scala.inline
  implicit class SimpleExpressionCheckerOps[Self <: SimpleExpressionChecker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisitAll(value: (js.Array[_], js.Any) => js.Array[_]): Self = this.set("visitAll", js.Any.fromFunction2(value))
  }
  
}

