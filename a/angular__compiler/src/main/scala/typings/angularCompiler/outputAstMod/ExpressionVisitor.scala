package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionVisitor extends StObject {
  
  def visitAssertNotNullExpr(ast: AssertNotNull_, context: js.Any): js.Any = js.native
  
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any = js.native
  
  def visitCastExpr(ast: CastExpr, context: js.Any): js.Any = js.native
  
  def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any = js.native
  
  def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any = js.native
  
  def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any = js.native
  
  def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any = js.native
  
  def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any = js.native
  
  def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any = js.native
  
  def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any = js.native
  
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any = js.native
  
  def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any = js.native
  
  def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any = js.native
  
  def visitLocalizedString(ast: LocalizedString_, context: js.Any): js.Any = js.native
  
  def visitNotExpr(ast: NotExpr, context: js.Any): js.Any = js.native
  
  def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any = js.native
  
  def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any = js.native
  
  def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any = js.native
  
  def visitTypeofExpr(ast: TypeofExpr_, context: js.Any): js.Any = js.native
  
  def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: js.Any): js.Any = js.native
  
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any = js.native
  
  def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any = js.native
  
  def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any = js.native
  
  def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any = js.native
}
object ExpressionVisitor {
  
  @scala.inline
  def apply(
    visitAssertNotNullExpr: (AssertNotNull_, js.Any) => js.Any,
    visitBinaryOperatorExpr: (BinaryOperatorExpr, js.Any) => js.Any,
    visitCastExpr: (CastExpr, js.Any) => js.Any,
    visitCommaExpr: (CommaExpr, js.Any) => js.Any,
    visitConditionalExpr: (ConditionalExpr, js.Any) => js.Any,
    visitExternalExpr: (ExternalExpr, js.Any) => js.Any,
    visitFunctionExpr: (FunctionExpr, js.Any) => js.Any,
    visitInstantiateExpr: (InstantiateExpr, js.Any) => js.Any,
    visitInvokeFunctionExpr: (InvokeFunctionExpr, js.Any) => js.Any,
    visitInvokeMethodExpr: (InvokeMethodExpr, js.Any) => js.Any,
    visitLiteralArrayExpr: (LiteralArrayExpr, js.Any) => js.Any,
    visitLiteralExpr: (LiteralExpr, js.Any) => js.Any,
    visitLiteralMapExpr: (LiteralMapExpr, js.Any) => js.Any,
    visitLocalizedString: (LocalizedString_, js.Any) => js.Any,
    visitNotExpr: (NotExpr, js.Any) => js.Any,
    visitReadKeyExpr: (ReadKeyExpr, js.Any) => js.Any,
    visitReadPropExpr: (ReadPropExpr, js.Any) => js.Any,
    visitReadVarExpr: (ReadVarExpr, js.Any) => js.Any,
    visitTypeofExpr: (TypeofExpr_, js.Any) => js.Any,
    visitUnaryOperatorExpr: (UnaryOperatorExpr, js.Any) => js.Any,
    visitWrappedNodeExpr: (WrappedNodeExpr[_], js.Any) => js.Any,
    visitWriteKeyExpr: (WriteKeyExpr, js.Any) => js.Any,
    visitWritePropExpr: (WritePropExpr, js.Any) => js.Any,
    visitWriteVarExpr: (WriteVarExpr, js.Any) => js.Any
  ): ExpressionVisitor = {
    val __obj = js.Dynamic.literal(visitAssertNotNullExpr = js.Any.fromFunction2(visitAssertNotNullExpr), visitBinaryOperatorExpr = js.Any.fromFunction2(visitBinaryOperatorExpr), visitCastExpr = js.Any.fromFunction2(visitCastExpr), visitCommaExpr = js.Any.fromFunction2(visitCommaExpr), visitConditionalExpr = js.Any.fromFunction2(visitConditionalExpr), visitExternalExpr = js.Any.fromFunction2(visitExternalExpr), visitFunctionExpr = js.Any.fromFunction2(visitFunctionExpr), visitInstantiateExpr = js.Any.fromFunction2(visitInstantiateExpr), visitInvokeFunctionExpr = js.Any.fromFunction2(visitInvokeFunctionExpr), visitInvokeMethodExpr = js.Any.fromFunction2(visitInvokeMethodExpr), visitLiteralArrayExpr = js.Any.fromFunction2(visitLiteralArrayExpr), visitLiteralExpr = js.Any.fromFunction2(visitLiteralExpr), visitLiteralMapExpr = js.Any.fromFunction2(visitLiteralMapExpr), visitLocalizedString = js.Any.fromFunction2(visitLocalizedString), visitNotExpr = js.Any.fromFunction2(visitNotExpr), visitReadKeyExpr = js.Any.fromFunction2(visitReadKeyExpr), visitReadPropExpr = js.Any.fromFunction2(visitReadPropExpr), visitReadVarExpr = js.Any.fromFunction2(visitReadVarExpr), visitTypeofExpr = js.Any.fromFunction2(visitTypeofExpr), visitUnaryOperatorExpr = js.Any.fromFunction2(visitUnaryOperatorExpr), visitWrappedNodeExpr = js.Any.fromFunction2(visitWrappedNodeExpr), visitWriteKeyExpr = js.Any.fromFunction2(visitWriteKeyExpr), visitWritePropExpr = js.Any.fromFunction2(visitWritePropExpr), visitWriteVarExpr = js.Any.fromFunction2(visitWriteVarExpr))
    __obj.asInstanceOf[ExpressionVisitor]
  }
  
  @scala.inline
  implicit class ExpressionVisitorMutableBuilder[Self <: ExpressionVisitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisitAssertNotNullExpr(value: (AssertNotNull_, js.Any) => js.Any): Self = StObject.set(x, "visitAssertNotNullExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitBinaryOperatorExpr(value: (BinaryOperatorExpr, js.Any) => js.Any): Self = StObject.set(x, "visitBinaryOperatorExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitCastExpr(value: (CastExpr, js.Any) => js.Any): Self = StObject.set(x, "visitCastExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitCommaExpr(value: (CommaExpr, js.Any) => js.Any): Self = StObject.set(x, "visitCommaExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitConditionalExpr(value: (ConditionalExpr, js.Any) => js.Any): Self = StObject.set(x, "visitConditionalExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitExternalExpr(value: (ExternalExpr, js.Any) => js.Any): Self = StObject.set(x, "visitExternalExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitFunctionExpr(value: (FunctionExpr, js.Any) => js.Any): Self = StObject.set(x, "visitFunctionExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitInstantiateExpr(value: (InstantiateExpr, js.Any) => js.Any): Self = StObject.set(x, "visitInstantiateExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitInvokeFunctionExpr(value: (InvokeFunctionExpr, js.Any) => js.Any): Self = StObject.set(x, "visitInvokeFunctionExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitInvokeMethodExpr(value: (InvokeMethodExpr, js.Any) => js.Any): Self = StObject.set(x, "visitInvokeMethodExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLiteralArrayExpr(value: (LiteralArrayExpr, js.Any) => js.Any): Self = StObject.set(x, "visitLiteralArrayExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLiteralExpr(value: (LiteralExpr, js.Any) => js.Any): Self = StObject.set(x, "visitLiteralExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLiteralMapExpr(value: (LiteralMapExpr, js.Any) => js.Any): Self = StObject.set(x, "visitLiteralMapExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitLocalizedString(value: (LocalizedString_, js.Any) => js.Any): Self = StObject.set(x, "visitLocalizedString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitNotExpr(value: (NotExpr, js.Any) => js.Any): Self = StObject.set(x, "visitNotExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitReadKeyExpr(value: (ReadKeyExpr, js.Any) => js.Any): Self = StObject.set(x, "visitReadKeyExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitReadPropExpr(value: (ReadPropExpr, js.Any) => js.Any): Self = StObject.set(x, "visitReadPropExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitReadVarExpr(value: (ReadVarExpr, js.Any) => js.Any): Self = StObject.set(x, "visitReadVarExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitTypeofExpr(value: (TypeofExpr_, js.Any) => js.Any): Self = StObject.set(x, "visitTypeofExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitUnaryOperatorExpr(value: (UnaryOperatorExpr, js.Any) => js.Any): Self = StObject.set(x, "visitUnaryOperatorExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitWrappedNodeExpr(value: (WrappedNodeExpr[_], js.Any) => js.Any): Self = StObject.set(x, "visitWrappedNodeExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitWriteKeyExpr(value: (WriteKeyExpr, js.Any) => js.Any): Self = StObject.set(x, "visitWriteKeyExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitWritePropExpr(value: (WritePropExpr, js.Any) => js.Any): Self = StObject.set(x, "visitWritePropExpr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitWriteVarExpr(value: (WriteVarExpr, js.Any) => js.Any): Self = StObject.set(x, "visitWriteVarExpr", js.Any.fromFunction2(value))
  }
}
