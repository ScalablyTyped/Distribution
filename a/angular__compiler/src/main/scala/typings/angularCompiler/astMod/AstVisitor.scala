package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstVisitor extends js.Object {
  
  /**
    * This function is optionally defined to allow classes that implement this
    * interface to selectively decide if the specified `ast` should be visited.
    * @param ast node to visit
    * @param context context that gets passed to the node and all its children
    */
  var visit: js.UndefOr[js.Function2[/* ast */ AST, /* context */ js.UndefOr[js.Any], _]] = js.native
  
  var visitASTWithSource: js.UndefOr[js.Function2[/* ast */ ASTWithSource, /* context */ js.Any, _]] = js.native
  
  def visitBinary(ast: Binary, context: js.Any): js.Any = js.native
  
  def visitChain(ast: Chain, context: js.Any): js.Any = js.native
  
  def visitConditional(ast: Conditional, context: js.Any): js.Any = js.native
  
  def visitFunctionCall(ast: FunctionCall, context: js.Any): js.Any = js.native
  
  def visitImplicitReceiver(ast: ImplicitReceiver, context: js.Any): js.Any = js.native
  
  def visitInterpolation(ast: Interpolation, context: js.Any): js.Any = js.native
  
  def visitKeyedRead(ast: KeyedRead, context: js.Any): js.Any = js.native
  
  def visitKeyedWrite(ast: KeyedWrite, context: js.Any): js.Any = js.native
  
  def visitLiteralArray(ast: LiteralArray, context: js.Any): js.Any = js.native
  
  def visitLiteralMap(ast: LiteralMap, context: js.Any): js.Any = js.native
  
  def visitLiteralPrimitive(ast: LiteralPrimitive, context: js.Any): js.Any = js.native
  
  def visitMethodCall(ast: MethodCall, context: js.Any): js.Any = js.native
  
  def visitNonNullAssert(ast: NonNullAssert, context: js.Any): js.Any = js.native
  
  def visitPipe(ast: BindingPipe, context: js.Any): js.Any = js.native
  
  def visitPrefixNot(ast: PrefixNot, context: js.Any): js.Any = js.native
  
  def visitPropertyRead(ast: PropertyRead, context: js.Any): js.Any = js.native
  
  def visitPropertyWrite(ast: PropertyWrite, context: js.Any): js.Any = js.native
  
  def visitQuote(ast: Quote, context: js.Any): js.Any = js.native
  
  def visitSafeMethodCall(ast: SafeMethodCall, context: js.Any): js.Any = js.native
  
  def visitSafePropertyRead(ast: SafePropertyRead, context: js.Any): js.Any = js.native
  
  /**
    * The `visitThisReceiver` method is declared as optional for backwards compatibility.
    * In an upcoming major release, this method will be made required.
    */
  var visitThisReceiver: js.UndefOr[js.Function2[/* ast */ ThisReceiver, /* context */ js.Any, _]] = js.native
  
  /**
    * The `visitUnary` method is declared as optional for backwards compatibility. In an upcoming
    * major release, this method will be made required.
    */
  var visitUnary: js.UndefOr[js.Function2[/* ast */ Unary, /* context */ js.Any, _]] = js.native
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
    visitSafePropertyRead: (SafePropertyRead, js.Any) => js.Any
  ): AstVisitor = {
    val __obj = js.Dynamic.literal(visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead))
    __obj.asInstanceOf[AstVisitor]
  }
  
  @scala.inline
  implicit class AstVisitorOps[Self <: AstVisitor] (val x: Self) extends AnyVal {
    
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
    def setVisitBinary(value: (Binary, js.Any) => js.Any): Self = this.set("visitBinary", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitChain(value: (Chain, js.Any) => js.Any): Self = this.set("visitChain", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitConditional(value: (Conditional, js.Any) => js.Any): Self = this.set("visitConditional", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitFunctionCall(value: (FunctionCall, js.Any) => js.Any): Self = this.set("visitFunctionCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitImplicitReceiver(value: (ImplicitReceiver, js.Any) => js.Any): Self = this.set("visitImplicitReceiver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitInterpolation(value: (Interpolation, js.Any) => js.Any): Self = this.set("visitInterpolation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitKeyedRead(value: (KeyedRead, js.Any) => js.Any): Self = this.set("visitKeyedRead", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitKeyedWrite(value: (KeyedWrite, js.Any) => js.Any): Self = this.set("visitKeyedWrite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLiteralArray(value: (LiteralArray, js.Any) => js.Any): Self = this.set("visitLiteralArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLiteralMap(value: (LiteralMap, js.Any) => js.Any): Self = this.set("visitLiteralMap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLiteralPrimitive(value: (LiteralPrimitive, js.Any) => js.Any): Self = this.set("visitLiteralPrimitive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitMethodCall(value: (MethodCall, js.Any) => js.Any): Self = this.set("visitMethodCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitNonNullAssert(value: (NonNullAssert, js.Any) => js.Any): Self = this.set("visitNonNullAssert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitPipe(value: (BindingPipe, js.Any) => js.Any): Self = this.set("visitPipe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitPrefixNot(value: (PrefixNot, js.Any) => js.Any): Self = this.set("visitPrefixNot", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitPropertyRead(value: (PropertyRead, js.Any) => js.Any): Self = this.set("visitPropertyRead", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitPropertyWrite(value: (PropertyWrite, js.Any) => js.Any): Self = this.set("visitPropertyWrite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitQuote(value: (Quote, js.Any) => js.Any): Self = this.set("visitQuote", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitSafeMethodCall(value: (SafeMethodCall, js.Any) => js.Any): Self = this.set("visitSafeMethodCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitSafePropertyRead(value: (SafePropertyRead, js.Any) => js.Any): Self = this.set("visitSafePropertyRead", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisit(value: (/* ast */ AST, /* context */ js.UndefOr[js.Any]) => _): Self = this.set("visit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisit: Self = this.set("visit", js.undefined)
    
    @scala.inline
    def setVisitASTWithSource(value: (/* ast */ ASTWithSource, /* context */ js.Any) => _): Self = this.set("visitASTWithSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisitASTWithSource: Self = this.set("visitASTWithSource", js.undefined)
    
    @scala.inline
    def setVisitThisReceiver(value: (/* ast */ ThisReceiver, /* context */ js.Any) => _): Self = this.set("visitThisReceiver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisitThisReceiver: Self = this.set("visitThisReceiver", js.undefined)
    
    @scala.inline
    def setVisitUnary(value: (/* ast */ Unary, /* context */ js.Any) => _): Self = this.set("visitUnary", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVisitUnary: Self = this.set("visitUnary", js.undefined)
  }
}
