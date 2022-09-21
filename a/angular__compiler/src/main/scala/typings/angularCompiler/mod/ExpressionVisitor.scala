package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionVisitor extends StObject {
  
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Any): Any
  
  def visitCommaExpr(ast: CommaExpr, context: Any): Any
  
  def visitConditionalExpr(ast: ConditionalExpr, context: Any): Any
  
  def visitExternalExpr(ast: ExternalExpr, context: Any): Any
  
  def visitFunctionExpr(ast: FunctionExpr, context: Any): Any
  
  def visitInstantiateExpr(ast: InstantiateExpr, context: Any): Any
  
  def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Any): Any
  
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Any): Any
  
  def visitLiteralExpr(ast: LiteralExpr, context: Any): Any
  
  def visitLiteralMapExpr(ast: LiteralMapExpr, context: Any): Any
  
  def visitLocalizedString(ast: LocalizedString, context: Any): Any
  
  def visitNotExpr(ast: NotExpr, context: Any): Any
  
  def visitReadKeyExpr(ast: ReadKeyExpr, context: Any): Any
  
  def visitReadPropExpr(ast: ReadPropExpr, context: Any): Any
  
  def visitReadVarExpr(ast: ReadVarExpr, context: Any): Any
  
  def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Any): Any
  
  def visitTypeofExpr(ast: TypeofExpr, context: Any): Any
  
  def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Any): Any
  
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], context: Any): Any
  
  def visitWriteKeyExpr(expr: WriteKeyExpr, context: Any): Any
  
  def visitWritePropExpr(expr: WritePropExpr, context: Any): Any
  
  def visitWriteVarExpr(expr: WriteVarExpr, context: Any): Any
}
object ExpressionVisitor {
  
  inline def apply(
    visitBinaryOperatorExpr: (BinaryOperatorExpr, Any) => Any,
    visitCommaExpr: (CommaExpr, Any) => Any,
    visitConditionalExpr: (ConditionalExpr, Any) => Any,
    visitExternalExpr: (ExternalExpr, Any) => Any,
    visitFunctionExpr: (FunctionExpr, Any) => Any,
    visitInstantiateExpr: (InstantiateExpr, Any) => Any,
    visitInvokeFunctionExpr: (InvokeFunctionExpr, Any) => Any,
    visitLiteralArrayExpr: (LiteralArrayExpr, Any) => Any,
    visitLiteralExpr: (LiteralExpr, Any) => Any,
    visitLiteralMapExpr: (LiteralMapExpr, Any) => Any,
    visitLocalizedString: (LocalizedString, Any) => Any,
    visitNotExpr: (NotExpr, Any) => Any,
    visitReadKeyExpr: (ReadKeyExpr, Any) => Any,
    visitReadPropExpr: (ReadPropExpr, Any) => Any,
    visitReadVarExpr: (ReadVarExpr, Any) => Any,
    visitTaggedTemplateExpr: (TaggedTemplateExpr, Any) => Any,
    visitTypeofExpr: (TypeofExpr, Any) => Any,
    visitUnaryOperatorExpr: (UnaryOperatorExpr, Any) => Any,
    visitWrappedNodeExpr: (WrappedNodeExpr[Any], Any) => Any,
    visitWriteKeyExpr: (WriteKeyExpr, Any) => Any,
    visitWritePropExpr: (WritePropExpr, Any) => Any,
    visitWriteVarExpr: (WriteVarExpr, Any) => Any
  ): ExpressionVisitor = {
    val __obj = js.Dynamic.literal(visitBinaryOperatorExpr = js.Any.fromFunction2(visitBinaryOperatorExpr), visitCommaExpr = js.Any.fromFunction2(visitCommaExpr), visitConditionalExpr = js.Any.fromFunction2(visitConditionalExpr), visitExternalExpr = js.Any.fromFunction2(visitExternalExpr), visitFunctionExpr = js.Any.fromFunction2(visitFunctionExpr), visitInstantiateExpr = js.Any.fromFunction2(visitInstantiateExpr), visitInvokeFunctionExpr = js.Any.fromFunction2(visitInvokeFunctionExpr), visitLiteralArrayExpr = js.Any.fromFunction2(visitLiteralArrayExpr), visitLiteralExpr = js.Any.fromFunction2(visitLiteralExpr), visitLiteralMapExpr = js.Any.fromFunction2(visitLiteralMapExpr), visitLocalizedString = js.Any.fromFunction2(visitLocalizedString), visitNotExpr = js.Any.fromFunction2(visitNotExpr), visitReadKeyExpr = js.Any.fromFunction2(visitReadKeyExpr), visitReadPropExpr = js.Any.fromFunction2(visitReadPropExpr), visitReadVarExpr = js.Any.fromFunction2(visitReadVarExpr), visitTaggedTemplateExpr = js.Any.fromFunction2(visitTaggedTemplateExpr), visitTypeofExpr = js.Any.fromFunction2(visitTypeofExpr), visitUnaryOperatorExpr = js.Any.fromFunction2(visitUnaryOperatorExpr), visitWrappedNodeExpr = js.Any.fromFunction2(visitWrappedNodeExpr), visitWriteKeyExpr = js.Any.fromFunction2(visitWriteKeyExpr), visitWritePropExpr = js.Any.fromFunction2(visitWritePropExpr), visitWriteVarExpr = js.Any.fromFunction2(visitWriteVarExpr))
    __obj.asInstanceOf[ExpressionVisitor]
  }
  
  extension [Self <: ExpressionVisitor](x: Self) {
    
    inline def setVisitBinaryOperatorExpr(value: (BinaryOperatorExpr, Any) => Any): Self = StObject.set(x, "visitBinaryOperatorExpr", js.Any.fromFunction2(value))
    
    inline def setVisitCommaExpr(value: (CommaExpr, Any) => Any): Self = StObject.set(x, "visitCommaExpr", js.Any.fromFunction2(value))
    
    inline def setVisitConditionalExpr(value: (ConditionalExpr, Any) => Any): Self = StObject.set(x, "visitConditionalExpr", js.Any.fromFunction2(value))
    
    inline def setVisitExternalExpr(value: (ExternalExpr, Any) => Any): Self = StObject.set(x, "visitExternalExpr", js.Any.fromFunction2(value))
    
    inline def setVisitFunctionExpr(value: (FunctionExpr, Any) => Any): Self = StObject.set(x, "visitFunctionExpr", js.Any.fromFunction2(value))
    
    inline def setVisitInstantiateExpr(value: (InstantiateExpr, Any) => Any): Self = StObject.set(x, "visitInstantiateExpr", js.Any.fromFunction2(value))
    
    inline def setVisitInvokeFunctionExpr(value: (InvokeFunctionExpr, Any) => Any): Self = StObject.set(x, "visitInvokeFunctionExpr", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralArrayExpr(value: (LiteralArrayExpr, Any) => Any): Self = StObject.set(x, "visitLiteralArrayExpr", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralExpr(value: (LiteralExpr, Any) => Any): Self = StObject.set(x, "visitLiteralExpr", js.Any.fromFunction2(value))
    
    inline def setVisitLiteralMapExpr(value: (LiteralMapExpr, Any) => Any): Self = StObject.set(x, "visitLiteralMapExpr", js.Any.fromFunction2(value))
    
    inline def setVisitLocalizedString(value: (LocalizedString, Any) => Any): Self = StObject.set(x, "visitLocalizedString", js.Any.fromFunction2(value))
    
    inline def setVisitNotExpr(value: (NotExpr, Any) => Any): Self = StObject.set(x, "visitNotExpr", js.Any.fromFunction2(value))
    
    inline def setVisitReadKeyExpr(value: (ReadKeyExpr, Any) => Any): Self = StObject.set(x, "visitReadKeyExpr", js.Any.fromFunction2(value))
    
    inline def setVisitReadPropExpr(value: (ReadPropExpr, Any) => Any): Self = StObject.set(x, "visitReadPropExpr", js.Any.fromFunction2(value))
    
    inline def setVisitReadVarExpr(value: (ReadVarExpr, Any) => Any): Self = StObject.set(x, "visitReadVarExpr", js.Any.fromFunction2(value))
    
    inline def setVisitTaggedTemplateExpr(value: (TaggedTemplateExpr, Any) => Any): Self = StObject.set(x, "visitTaggedTemplateExpr", js.Any.fromFunction2(value))
    
    inline def setVisitTypeofExpr(value: (TypeofExpr, Any) => Any): Self = StObject.set(x, "visitTypeofExpr", js.Any.fromFunction2(value))
    
    inline def setVisitUnaryOperatorExpr(value: (UnaryOperatorExpr, Any) => Any): Self = StObject.set(x, "visitUnaryOperatorExpr", js.Any.fromFunction2(value))
    
    inline def setVisitWrappedNodeExpr(value: (WrappedNodeExpr[Any], Any) => Any): Self = StObject.set(x, "visitWrappedNodeExpr", js.Any.fromFunction2(value))
    
    inline def setVisitWriteKeyExpr(value: (WriteKeyExpr, Any) => Any): Self = StObject.set(x, "visitWriteKeyExpr", js.Any.fromFunction2(value))
    
    inline def setVisitWritePropExpr(value: (WritePropExpr, Any) => Any): Self = StObject.set(x, "visitWritePropExpr", js.Any.fromFunction2(value))
    
    inline def setVisitWriteVarExpr(value: (WriteVarExpr, Any) => Any): Self = StObject.set(x, "visitWriteVarExpr", js.Any.fromFunction2(value))
  }
}
