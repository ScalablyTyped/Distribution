package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "AstMemoryEfficientTransformer")
@js.native
class AstMemoryEfficientTransformer ()
  extends StObject
     with AstVisitor {
  
  def visitAll(asts: js.Array[js.Any]): js.Array[js.Any] = js.native
  
  /* CompleteClass */
  override def visitBinary(ast: Binary, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitChain(ast: Chain, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitConditional(ast: Conditional, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitFunctionCall(ast: FunctionCall, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitImplicitReceiver(ast: ImplicitReceiver, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitInterpolation(ast: Interpolation, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitKeyedRead(ast: KeyedRead, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitKeyedWrite(ast: KeyedWrite, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitLiteralArray(ast: LiteralArray, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitLiteralMap(ast: LiteralMap, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitLiteralPrimitive(ast: LiteralPrimitive, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitMethodCall(ast: MethodCall, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitNonNullAssert(ast: NonNullAssert, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitPipe(ast: BindingPipe, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitPrefixNot(ast: PrefixNot, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitPropertyRead(ast: PropertyRead, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitPropertyWrite(ast: PropertyWrite, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitQuote(ast: Quote, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitSafeMethodCall(ast: SafeMethodCall, context: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def visitSafePropertyRead(ast: SafePropertyRead, context: js.Any): js.Any = js.native
  
  @JSName("visitThisReceiver")
  def visitThisReceiver_MAstMemoryEfficientTransformer(ast: ThisReceiver, context: js.Any): AST = js.native
  
  @JSName("visitUnary")
  def visitUnary_MAstMemoryEfficientTransformer(ast: Unary, context: js.Any): AST = js.native
}
