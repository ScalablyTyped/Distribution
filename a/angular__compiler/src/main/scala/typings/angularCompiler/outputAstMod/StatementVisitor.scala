package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatementVisitor extends StObject {
  
  def visitDeclareClassStmt(stmt: ClassStmt, context: js.Any): js.Any
  
  def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, context: js.Any): js.Any
  
  def visitDeclareVarStmt(stmt: DeclareVarStmt, context: js.Any): js.Any
  
  def visitExpressionStmt(stmt: ExpressionStatement, context: js.Any): js.Any
  
  def visitIfStmt(stmt: IfStmt_, context: js.Any): js.Any
  
  def visitReturnStmt(stmt: ReturnStatement, context: js.Any): js.Any
  
  def visitThrowStmt(stmt: ThrowStmt, context: js.Any): js.Any
  
  def visitTryCatchStmt(stmt: TryCatchStmt, context: js.Any): js.Any
}
object StatementVisitor {
  
  inline def apply(
    visitDeclareClassStmt: (ClassStmt, js.Any) => js.Any,
    visitDeclareFunctionStmt: (DeclareFunctionStmt, js.Any) => js.Any,
    visitDeclareVarStmt: (DeclareVarStmt, js.Any) => js.Any,
    visitExpressionStmt: (ExpressionStatement, js.Any) => js.Any,
    visitIfStmt: (IfStmt_, js.Any) => js.Any,
    visitReturnStmt: (ReturnStatement, js.Any) => js.Any,
    visitThrowStmt: (ThrowStmt, js.Any) => js.Any,
    visitTryCatchStmt: (TryCatchStmt, js.Any) => js.Any
  ): StatementVisitor = {
    val __obj = js.Dynamic.literal(visitDeclareClassStmt = js.Any.fromFunction2(visitDeclareClassStmt), visitDeclareFunctionStmt = js.Any.fromFunction2(visitDeclareFunctionStmt), visitDeclareVarStmt = js.Any.fromFunction2(visitDeclareVarStmt), visitExpressionStmt = js.Any.fromFunction2(visitExpressionStmt), visitIfStmt = js.Any.fromFunction2(visitIfStmt), visitReturnStmt = js.Any.fromFunction2(visitReturnStmt), visitThrowStmt = js.Any.fromFunction2(visitThrowStmt), visitTryCatchStmt = js.Any.fromFunction2(visitTryCatchStmt))
    __obj.asInstanceOf[StatementVisitor]
  }
  
  extension [Self <: StatementVisitor](x: Self) {
    
    inline def setVisitDeclareClassStmt(value: (ClassStmt, js.Any) => js.Any): Self = StObject.set(x, "visitDeclareClassStmt", js.Any.fromFunction2(value))
    
    inline def setVisitDeclareFunctionStmt(value: (DeclareFunctionStmt, js.Any) => js.Any): Self = StObject.set(x, "visitDeclareFunctionStmt", js.Any.fromFunction2(value))
    
    inline def setVisitDeclareVarStmt(value: (DeclareVarStmt, js.Any) => js.Any): Self = StObject.set(x, "visitDeclareVarStmt", js.Any.fromFunction2(value))
    
    inline def setVisitExpressionStmt(value: (ExpressionStatement, js.Any) => js.Any): Self = StObject.set(x, "visitExpressionStmt", js.Any.fromFunction2(value))
    
    inline def setVisitIfStmt(value: (IfStmt_, js.Any) => js.Any): Self = StObject.set(x, "visitIfStmt", js.Any.fromFunction2(value))
    
    inline def setVisitReturnStmt(value: (ReturnStatement, js.Any) => js.Any): Self = StObject.set(x, "visitReturnStmt", js.Any.fromFunction2(value))
    
    inline def setVisitThrowStmt(value: (ThrowStmt, js.Any) => js.Any): Self = StObject.set(x, "visitThrowStmt", js.Any.fromFunction2(value))
    
    inline def setVisitTryCatchStmt(value: (TryCatchStmt, js.Any) => js.Any): Self = StObject.set(x, "visitTryCatchStmt", js.Any.fromFunction2(value))
  }
}
