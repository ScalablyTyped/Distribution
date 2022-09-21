package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecursiveAstVisitor2
  extends StObject
     with StatementVisitor
     with ExpressionVisitor {
  
  def visitAllExpressions(exprs: js.Array[Expression], context: Any): Unit
  
  def visitAllStatements(stmts: js.Array[Statement], context: Any): Unit
  
  def visitArrayType(`type`: ArrayType, context: Any): Any
  
  def visitBuiltinType(`type`: BuiltinType, context: Any): Any
  
  def visitExpression(ast: Expression, context: Any): Any
  
  def visitExpressionType(`type`: ExpressionType, context: Any): Any
  
  def visitMapType(`type`: MapType, context: Any): Any
  
  def visitType(ast: Type, context: Any): Any
}
object RecursiveAstVisitor2 {
  
  inline def apply(
    visitAllExpressions: (js.Array[Expression], Any) => Unit,
    visitAllStatements: (js.Array[Statement], Any) => Unit,
    visitArrayType: (ArrayType, Any) => Any,
    visitBinaryOperatorExpr: (BinaryOperatorExpr, Any) => Any,
    visitBuiltinType: (BuiltinType, Any) => Any,
    visitCommaExpr: (CommaExpr, Any) => Any,
    visitConditionalExpr: (ConditionalExpr, Any) => Any,
    visitDeclareFunctionStmt: (DeclareFunctionStmt, Any) => Any,
    visitDeclareVarStmt: (DeclareVarStmt, Any) => Any,
    visitExpression: (Expression, Any) => Any,
    visitExpressionStmt: (ExpressionStatement, Any) => Any,
    visitExpressionType: (ExpressionType, Any) => Any,
    visitExternalExpr: (ExternalExpr, Any) => Any,
    visitFunctionExpr: (FunctionExpr, Any) => Any,
    visitIfStmt: (IfStmt, Any) => Any,
    visitInstantiateExpr: (InstantiateExpr, Any) => Any,
    visitInvokeFunctionExpr: (InvokeFunctionExpr, Any) => Any,
    visitLiteralArrayExpr: (LiteralArrayExpr, Any) => Any,
    visitLiteralExpr: (LiteralExpr, Any) => Any,
    visitLiteralMapExpr: (LiteralMapExpr, Any) => Any,
    visitLocalizedString: (LocalizedString, Any) => Any,
    visitMapType: (MapType, Any) => Any,
    visitNotExpr: (NotExpr, Any) => Any,
    visitReadKeyExpr: (ReadKeyExpr, Any) => Any,
    visitReadPropExpr: (ReadPropExpr, Any) => Any,
    visitReadVarExpr: (ReadVarExpr, Any) => Any,
    visitReturnStmt: (ReturnStatement, Any) => Any,
    visitTaggedTemplateExpr: (TaggedTemplateExpr, Any) => Any,
    visitType: (Type, Any) => Any,
    visitTypeofExpr: (TypeofExpr, Any) => Any,
    visitUnaryOperatorExpr: (UnaryOperatorExpr, Any) => Any,
    visitWrappedNodeExpr: (WrappedNodeExpr[Any], Any) => Any,
    visitWriteKeyExpr: (WriteKeyExpr, Any) => Any,
    visitWritePropExpr: (WritePropExpr, Any) => Any,
    visitWriteVarExpr: (WriteVarExpr, Any) => Any
  ): RecursiveAstVisitor2 = {
    val __obj = js.Dynamic.literal(visitAllExpressions = js.Any.fromFunction2(visitAllExpressions), visitAllStatements = js.Any.fromFunction2(visitAllStatements), visitArrayType = js.Any.fromFunction2(visitArrayType), visitBinaryOperatorExpr = js.Any.fromFunction2(visitBinaryOperatorExpr), visitBuiltinType = js.Any.fromFunction2(visitBuiltinType), visitCommaExpr = js.Any.fromFunction2(visitCommaExpr), visitConditionalExpr = js.Any.fromFunction2(visitConditionalExpr), visitDeclareFunctionStmt = js.Any.fromFunction2(visitDeclareFunctionStmt), visitDeclareVarStmt = js.Any.fromFunction2(visitDeclareVarStmt), visitExpression = js.Any.fromFunction2(visitExpression), visitExpressionStmt = js.Any.fromFunction2(visitExpressionStmt), visitExpressionType = js.Any.fromFunction2(visitExpressionType), visitExternalExpr = js.Any.fromFunction2(visitExternalExpr), visitFunctionExpr = js.Any.fromFunction2(visitFunctionExpr), visitIfStmt = js.Any.fromFunction2(visitIfStmt), visitInstantiateExpr = js.Any.fromFunction2(visitInstantiateExpr), visitInvokeFunctionExpr = js.Any.fromFunction2(visitInvokeFunctionExpr), visitLiteralArrayExpr = js.Any.fromFunction2(visitLiteralArrayExpr), visitLiteralExpr = js.Any.fromFunction2(visitLiteralExpr), visitLiteralMapExpr = js.Any.fromFunction2(visitLiteralMapExpr), visitLocalizedString = js.Any.fromFunction2(visitLocalizedString), visitMapType = js.Any.fromFunction2(visitMapType), visitNotExpr = js.Any.fromFunction2(visitNotExpr), visitReadKeyExpr = js.Any.fromFunction2(visitReadKeyExpr), visitReadPropExpr = js.Any.fromFunction2(visitReadPropExpr), visitReadVarExpr = js.Any.fromFunction2(visitReadVarExpr), visitReturnStmt = js.Any.fromFunction2(visitReturnStmt), visitTaggedTemplateExpr = js.Any.fromFunction2(visitTaggedTemplateExpr), visitType = js.Any.fromFunction2(visitType), visitTypeofExpr = js.Any.fromFunction2(visitTypeofExpr), visitUnaryOperatorExpr = js.Any.fromFunction2(visitUnaryOperatorExpr), visitWrappedNodeExpr = js.Any.fromFunction2(visitWrappedNodeExpr), visitWriteKeyExpr = js.Any.fromFunction2(visitWriteKeyExpr), visitWritePropExpr = js.Any.fromFunction2(visitWritePropExpr), visitWriteVarExpr = js.Any.fromFunction2(visitWriteVarExpr))
    __obj.asInstanceOf[RecursiveAstVisitor2]
  }
  
  extension [Self <: RecursiveAstVisitor2](x: Self) {
    
    inline def setVisitAllExpressions(value: (js.Array[Expression], Any) => Unit): Self = StObject.set(x, "visitAllExpressions", js.Any.fromFunction2(value))
    
    inline def setVisitAllStatements(value: (js.Array[Statement], Any) => Unit): Self = StObject.set(x, "visitAllStatements", js.Any.fromFunction2(value))
    
    inline def setVisitArrayType(value: (ArrayType, Any) => Any): Self = StObject.set(x, "visitArrayType", js.Any.fromFunction2(value))
    
    inline def setVisitBuiltinType(value: (BuiltinType, Any) => Any): Self = StObject.set(x, "visitBuiltinType", js.Any.fromFunction2(value))
    
    inline def setVisitExpression(value: (Expression, Any) => Any): Self = StObject.set(x, "visitExpression", js.Any.fromFunction2(value))
    
    inline def setVisitExpressionType(value: (ExpressionType, Any) => Any): Self = StObject.set(x, "visitExpressionType", js.Any.fromFunction2(value))
    
    inline def setVisitMapType(value: (MapType, Any) => Any): Self = StObject.set(x, "visitMapType", js.Any.fromFunction2(value))
    
    inline def setVisitType(value: (Type, Any) => Any): Self = StObject.set(x, "visitType", js.Any.fromFunction2(value))
  }
}
