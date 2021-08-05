package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstVisitor extends StObject {
  
  /**
    * This function is optionally defined to allow classes that implement this
    * interface to selectively decide if the specified `ast` should be visited.
    * @param ast node to visit
    * @param context context that gets passed to the node and all its children
    */
  var visit: js.UndefOr[js.Function2[/* ast */ AST, /* context */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  var visitASTWithSource: js.UndefOr[js.Function2[/* ast */ ASTWithSource, /* context */ js.Any, js.Any]] = js.undefined
  
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
  
  /**
    * The `visitThisReceiver` method is declared as optional for backwards compatibility.
    * In an upcoming major release, this method will be made required.
    */
  var visitThisReceiver: js.UndefOr[js.Function2[/* ast */ ThisReceiver, /* context */ js.Any, js.Any]] = js.undefined
  
  /**
    * The `visitUnary` method is declared as optional for backwards compatibility. In an upcoming
    * major release, this method will be made required.
    */
  var visitUnary: js.UndefOr[js.Function2[/* ast */ Unary, /* context */ js.Any, js.Any]] = js.undefined
}
object AstVisitor {
  
  inline def apply(
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
  ): AstVisitor = {
    val __obj = js.Dynamic.literal(visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    __obj.asInstanceOf[AstVisitor]
  }
  
  extension [Self <: AstVisitor](x: Self) {
    
    inline def setVisit(value: (/* ast */ AST, /* context */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    
    inline def setVisitASTWithSource(value: (/* ast */ ASTWithSource, /* context */ js.Any) => js.Any): Self = StObject.set(x, "visitASTWithSource", js.Any.fromFunction2(value))
    
    inline def setVisitASTWithSourceUndefined: Self = StObject.set(x, "visitASTWithSource", js.undefined)
    
    inline def setVisitBinary(value: (Binary, js.Any) => js.Any): Self = StObject.set(x, "visitBinary", js.Any.fromFunction2(value))
    
    inline def setVisitChain(value: (Chain, js.Any) => js.Any): Self = StObject.set(x, "visitChain", js.Any.fromFunction2(value))
    
    inline def setVisitConditional(value: (Conditional, js.Any) => js.Any): Self = StObject.set(x, "visitConditional", js.Any.fromFunction2(value))
    
    inline def setVisitFunctionCall(value: (FunctionCall, js.Any) => js.Any): Self = StObject.set(x, "visitFunctionCall", js.Any.fromFunction2(value))
    
    inline def setVisitImplicitReceiver(value: (ImplicitReceiver, js.Any) => js.Any): Self = StObject.set(x, "visitImplicitReceiver", js.Any.fromFunction2(value))
    
    inline def setVisitInterpolation(value: (Interpolation, js.Any) => js.Any): Self = StObject.set(x, "visitInterpolation", js.Any.fromFunction2(value))
    
    inline def setVisitKeyedRead(value: (KeyedRead, js.Any) => js.Any): Self = StObject.set(x, "visitKeyedRead", js.Any.fromFunction2(value))
    
    inline def setVisitKeyedWrite(value: (KeyedWrite, js.Any) => js.Any): Self = StObject.set(x, "visitKeyedWrite", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralArray(value: (LiteralArray, js.Any) => js.Any): Self = StObject.set(x, "visitLiteralArray", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralMap(value: (LiteralMap, js.Any) => js.Any): Self = StObject.set(x, "visitLiteralMap", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralPrimitive(value: (LiteralPrimitive, js.Any) => js.Any): Self = StObject.set(x, "visitLiteralPrimitive", js.Any.fromFunction2(value))
    
    inline def setVisitMethodCall(value: (MethodCall, js.Any) => js.Any): Self = StObject.set(x, "visitMethodCall", js.Any.fromFunction2(value))
    
    inline def setVisitNonNullAssert(value: (NonNullAssert, js.Any) => js.Any): Self = StObject.set(x, "visitNonNullAssert", js.Any.fromFunction2(value))
    
    inline def setVisitPipe(value: (BindingPipe, js.Any) => js.Any): Self = StObject.set(x, "visitPipe", js.Any.fromFunction2(value))
    
    inline def setVisitPrefixNot(value: (PrefixNot, js.Any) => js.Any): Self = StObject.set(x, "visitPrefixNot", js.Any.fromFunction2(value))
    
    inline def setVisitPropertyRead(value: (PropertyRead, js.Any) => js.Any): Self = StObject.set(x, "visitPropertyRead", js.Any.fromFunction2(value))
    
    inline def setVisitPropertyWrite(value: (PropertyWrite, js.Any) => js.Any): Self = StObject.set(x, "visitPropertyWrite", js.Any.fromFunction2(value))
    
    inline def setVisitQuote(value: (Quote, js.Any) => js.Any): Self = StObject.set(x, "visitQuote", js.Any.fromFunction2(value))
    
    inline def setVisitSafeMethodCall(value: (SafeMethodCall, js.Any) => js.Any): Self = StObject.set(x, "visitSafeMethodCall", js.Any.fromFunction2(value))
    
    inline def setVisitSafePropertyRead(value: (SafePropertyRead, js.Any) => js.Any): Self = StObject.set(x, "visitSafePropertyRead", js.Any.fromFunction2(value))
    
    inline def setVisitThisReceiver(value: (/* ast */ ThisReceiver, /* context */ js.Any) => js.Any): Self = StObject.set(x, "visitThisReceiver", js.Any.fromFunction2(value))
    
    inline def setVisitThisReceiverUndefined: Self = StObject.set(x, "visitThisReceiver", js.undefined)
    
    inline def setVisitUnary(value: (/* ast */ Unary, /* context */ js.Any) => js.Any): Self = StObject.set(x, "visitUnary", js.Any.fromFunction2(value))
    
    inline def setVisitUnaryUndefined: Self = StObject.set(x, "visitUnary", js.undefined)
    
    inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
  }
}
