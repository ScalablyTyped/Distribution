package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatementVisitor extends StObject {
  
  def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: Any): Any
  
  def visitDeclareVarStmt(stmt: DeclareVarStmt, context: Any): Any
  
  def visitExpressionStmt(stmt: ExpressionStatement, context: Any): Any
  
  def visitIfStmt(stmt: IfStmt, context: Any): Any
  
  def visitReturnStmt(stmt: ReturnStatement, context: Any): Any
}
object StatementVisitor {
  
  inline def apply(
    visitDeclareFunctionStmt: (DeclareFunctionStmt, Any) => Any,
    visitDeclareVarStmt: (DeclareVarStmt, Any) => Any,
    visitExpressionStmt: (ExpressionStatement, Any) => Any,
    visitIfStmt: (IfStmt, Any) => Any,
    visitReturnStmt: (ReturnStatement, Any) => Any
  ): StatementVisitor = {
    val __obj = js.Dynamic.literal(visitDeclareFunctionStmt = js.Any.fromFunction2(visitDeclareFunctionStmt), visitDeclareVarStmt = js.Any.fromFunction2(visitDeclareVarStmt), visitExpressionStmt = js.Any.fromFunction2(visitExpressionStmt), visitIfStmt = js.Any.fromFunction2(visitIfStmt), visitReturnStmt = js.Any.fromFunction2(visitReturnStmt))
    __obj.asInstanceOf[StatementVisitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatementVisitor] (val x: Self) extends AnyVal {
    
    inline def setVisitDeclareFunctionStmt(value: (DeclareFunctionStmt, Any) => Any): Self = StObject.set(x, "visitDeclareFunctionStmt", js.Any.fromFunction2(value))
    
    inline def setVisitDeclareVarStmt(value: (DeclareVarStmt, Any) => Any): Self = StObject.set(x, "visitDeclareVarStmt", js.Any.fromFunction2(value))
    
    inline def setVisitExpressionStmt(value: (ExpressionStatement, Any) => Any): Self = StObject.set(x, "visitExpressionStmt", js.Any.fromFunction2(value))
    
    inline def setVisitIfStmt(value: (IfStmt, Any) => Any): Self = StObject.set(x, "visitIfStmt", js.Any.fromFunction2(value))
    
    inline def setVisitReturnStmt(value: (ReturnStatement, Any) => Any): Self = StObject.set(x, "visitReturnStmt", js.Any.fromFunction2(value))
  }
}
