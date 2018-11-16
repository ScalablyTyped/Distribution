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

