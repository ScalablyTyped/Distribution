package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "RecursiveAstVisitor")
@js.native
open class RecursiveAstVisitor ()
  extends StObject
     with AstVisitor {
  
  def visitAll(asts: js.Array[AST], context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitBinary(ast: Binary, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitCall(ast: Call, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitChain(ast: Chain, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitConditional(ast: Conditional, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitImplicitReceiver(ast: ImplicitReceiver, context: Any): Any = js.native
  def visitImplicitReceiver(ast: ThisReceiver, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitInterpolation(ast: Interpolation, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitKeyedRead(ast: KeyedRead, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitKeyedWrite(ast: KeyedWrite, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitLiteralArray(ast: LiteralArray, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitLiteralMap(ast: LiteralMap_, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitLiteralPrimitive(ast: LiteralPrimitive, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitNonNullAssert(ast: NonNullAssert, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitPipe(ast: BindingPipe, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitPrefixNot(ast: PrefixNot, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitPropertyRead(ast: PropertyRead, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitPropertyWrite(ast: PropertyWrite, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitSafeCall(ast: SafeCall, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitSafeKeyedRead(ast: SafeKeyedRead, context: Any): Any = js.native
  
  /* CompleteClass */
  override def visitSafePropertyRead(ast: SafePropertyRead, context: Any): Any = js.native
  
  @JSName("visitThisReceiver")
  def visitThisReceiver_MRecursiveAstVisitor(ast: ThisReceiver, context: Any): Any = js.native
  
  @JSName("visitUnary")
  def visitUnary_MRecursiveAstVisitor(ast: Unary, context: Any): Any = js.native
  
  @JSName("visit")
  def visit_MRecursiveAstVisitor(ast: AST): Any = js.native
  @JSName("visit")
  def visit_MRecursiveAstVisitor(ast: AST, context: Any): Any = js.native
}
