package typings.angularCompiler.mod

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
  var visit: js.UndefOr[js.Function2[/* ast */ AST, /* context */ js.UndefOr[Any], Any]] = js.undefined
  
  var visitASTWithSource: js.UndefOr[js.Function2[/* ast */ ASTWithSource, /* context */ Any, Any]] = js.undefined
  
  def visitBinary(ast: Binary, context: Any): Any
  
  def visitCall(ast: Call, context: Any): Any
  
  def visitChain(ast: Chain, context: Any): Any
  
  def visitConditional(ast: Conditional, context: Any): Any
  
  def visitImplicitReceiver(ast: ImplicitReceiver, context: Any): Any
  
  def visitInterpolation(ast: Interpolation, context: Any): Any
  
  def visitKeyedRead(ast: KeyedRead, context: Any): Any
  
  def visitKeyedWrite(ast: KeyedWrite, context: Any): Any
  
  def visitLiteralArray(ast: LiteralArray, context: Any): Any
  
  def visitLiteralMap(ast: LiteralMap_, context: Any): Any
  
  def visitLiteralPrimitive(ast: LiteralPrimitive, context: Any): Any
  
  def visitNonNullAssert(ast: NonNullAssert, context: Any): Any
  
  def visitPipe(ast: BindingPipe, context: Any): Any
  
  def visitPrefixNot(ast: PrefixNot, context: Any): Any
  
  def visitPropertyRead(ast: PropertyRead, context: Any): Any
  
  def visitPropertyWrite(ast: PropertyWrite, context: Any): Any
  
  def visitSafeCall(ast: SafeCall, context: Any): Any
  
  def visitSafeKeyedRead(ast: SafeKeyedRead, context: Any): Any
  
  def visitSafePropertyRead(ast: SafePropertyRead, context: Any): Any
  
  /**
    * The `visitThisReceiver` method is declared as optional for backwards compatibility.
    * In an upcoming major release, this method will be made required.
    */
  var visitThisReceiver: js.UndefOr[js.Function2[/* ast */ ThisReceiver, /* context */ Any, Any]] = js.undefined
  
  /**
    * The `visitUnary` method is declared as optional for backwards compatibility. In an upcoming
    * major release, this method will be made required.
    */
  var visitUnary: js.UndefOr[js.Function2[/* ast */ Unary, /* context */ Any, Any]] = js.undefined
}
object AstVisitor {
  
  inline def apply(
    visitBinary: (Binary, Any) => Any,
    visitCall: (Call, Any) => Any,
    visitChain: (Chain, Any) => Any,
    visitConditional: (Conditional, Any) => Any,
    visitImplicitReceiver: (ImplicitReceiver, Any) => Any,
    visitInterpolation: (Interpolation, Any) => Any,
    visitKeyedRead: (KeyedRead, Any) => Any,
    visitKeyedWrite: (KeyedWrite, Any) => Any,
    visitLiteralArray: (LiteralArray, Any) => Any,
    visitLiteralMap: (LiteralMap_, Any) => Any,
    visitLiteralPrimitive: (LiteralPrimitive, Any) => Any,
    visitNonNullAssert: (NonNullAssert, Any) => Any,
    visitPipe: (BindingPipe, Any) => Any,
    visitPrefixNot: (PrefixNot, Any) => Any,
    visitPropertyRead: (PropertyRead, Any) => Any,
    visitPropertyWrite: (PropertyWrite, Any) => Any,
    visitSafeCall: (SafeCall, Any) => Any,
    visitSafeKeyedRead: (SafeKeyedRead, Any) => Any,
    visitSafePropertyRead: (SafePropertyRead, Any) => Any
  ): AstVisitor = {
    val __obj = js.Dynamic.literal(visitBinary = js.Any.fromFunction2(visitBinary), visitCall = js.Any.fromFunction2(visitCall), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitSafeCall = js.Any.fromFunction2(visitSafeCall), visitSafeKeyedRead = js.Any.fromFunction2(visitSafeKeyedRead), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    __obj.asInstanceOf[AstVisitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AstVisitor] (val x: Self) extends AnyVal {
    
    inline def setVisit(value: (/* ast */ AST, /* context */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    
    inline def setVisitASTWithSource(value: (/* ast */ ASTWithSource, /* context */ Any) => Any): Self = StObject.set(x, "visitASTWithSource", js.Any.fromFunction2(value))
    
    inline def setVisitASTWithSourceUndefined: Self = StObject.set(x, "visitASTWithSource", js.undefined)
    
    inline def setVisitBinary(value: (Binary, Any) => Any): Self = StObject.set(x, "visitBinary", js.Any.fromFunction2(value))
    
    inline def setVisitCall(value: (Call, Any) => Any): Self = StObject.set(x, "visitCall", js.Any.fromFunction2(value))
    
    inline def setVisitChain(value: (Chain, Any) => Any): Self = StObject.set(x, "visitChain", js.Any.fromFunction2(value))
    
    inline def setVisitConditional(value: (Conditional, Any) => Any): Self = StObject.set(x, "visitConditional", js.Any.fromFunction2(value))
    
    inline def setVisitImplicitReceiver(value: (ImplicitReceiver, Any) => Any): Self = StObject.set(x, "visitImplicitReceiver", js.Any.fromFunction2(value))
    
    inline def setVisitInterpolation(value: (Interpolation, Any) => Any): Self = StObject.set(x, "visitInterpolation", js.Any.fromFunction2(value))
    
    inline def setVisitKeyedRead(value: (KeyedRead, Any) => Any): Self = StObject.set(x, "visitKeyedRead", js.Any.fromFunction2(value))
    
    inline def setVisitKeyedWrite(value: (KeyedWrite, Any) => Any): Self = StObject.set(x, "visitKeyedWrite", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralArray(value: (LiteralArray, Any) => Any): Self = StObject.set(x, "visitLiteralArray", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralMap(value: (LiteralMap_, Any) => Any): Self = StObject.set(x, "visitLiteralMap", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralPrimitive(value: (LiteralPrimitive, Any) => Any): Self = StObject.set(x, "visitLiteralPrimitive", js.Any.fromFunction2(value))
    
    inline def setVisitNonNullAssert(value: (NonNullAssert, Any) => Any): Self = StObject.set(x, "visitNonNullAssert", js.Any.fromFunction2(value))
    
    inline def setVisitPipe(value: (BindingPipe, Any) => Any): Self = StObject.set(x, "visitPipe", js.Any.fromFunction2(value))
    
    inline def setVisitPrefixNot(value: (PrefixNot, Any) => Any): Self = StObject.set(x, "visitPrefixNot", js.Any.fromFunction2(value))
    
    inline def setVisitPropertyRead(value: (PropertyRead, Any) => Any): Self = StObject.set(x, "visitPropertyRead", js.Any.fromFunction2(value))
    
    inline def setVisitPropertyWrite(value: (PropertyWrite, Any) => Any): Self = StObject.set(x, "visitPropertyWrite", js.Any.fromFunction2(value))
    
    inline def setVisitSafeCall(value: (SafeCall, Any) => Any): Self = StObject.set(x, "visitSafeCall", js.Any.fromFunction2(value))
    
    inline def setVisitSafeKeyedRead(value: (SafeKeyedRead, Any) => Any): Self = StObject.set(x, "visitSafeKeyedRead", js.Any.fromFunction2(value))
    
    inline def setVisitSafePropertyRead(value: (SafePropertyRead, Any) => Any): Self = StObject.set(x, "visitSafePropertyRead", js.Any.fromFunction2(value))
    
    inline def setVisitThisReceiver(value: (/* ast */ ThisReceiver, /* context */ Any) => Any): Self = StObject.set(x, "visitThisReceiver", js.Any.fromFunction2(value))
    
    inline def setVisitThisReceiverUndefined: Self = StObject.set(x, "visitThisReceiver", js.undefined)
    
    inline def setVisitUnary(value: (/* ast */ Unary, /* context */ Any) => Any): Self = StObject.set(x, "visitUnary", js.Any.fromFunction2(value))
    
    inline def setVisitUnaryUndefined: Self = StObject.set(x, "visitUnary", js.undefined)
    
    inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
  }
}
