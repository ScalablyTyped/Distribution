package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeVisitor extends StObject {
  
  def visitArrayType(`type`: ArrayType, context: Any): Any
  
  def visitBuiltinType(`type`: BuiltinType, context: Any): Any
  
  def visitExpressionType(`type`: ExpressionType, context: Any): Any
  
  def visitMapType(`type`: MapType, context: Any): Any
}
object TypeVisitor {
  
  inline def apply(
    visitArrayType: (ArrayType, Any) => Any,
    visitBuiltinType: (BuiltinType, Any) => Any,
    visitExpressionType: (ExpressionType, Any) => Any,
    visitMapType: (MapType, Any) => Any
  ): TypeVisitor = {
    val __obj = js.Dynamic.literal(visitArrayType = js.Any.fromFunction2(visitArrayType), visitBuiltinType = js.Any.fromFunction2(visitBuiltinType), visitExpressionType = js.Any.fromFunction2(visitExpressionType), visitMapType = js.Any.fromFunction2(visitMapType))
    __obj.asInstanceOf[TypeVisitor]
  }
  
  extension [Self <: TypeVisitor](x: Self) {
    
    inline def setVisitArrayType(value: (ArrayType, Any) => Any): Self = StObject.set(x, "visitArrayType", js.Any.fromFunction2(value))
    
    inline def setVisitBuiltinType(value: (BuiltinType, Any) => Any): Self = StObject.set(x, "visitBuiltinType", js.Any.fromFunction2(value))
    
    inline def setVisitExpressionType(value: (ExpressionType, Any) => Any): Self = StObject.set(x, "visitExpressionType", js.Any.fromFunction2(value))
    
    inline def setVisitMapType(value: (MapType, Any) => Any): Self = StObject.set(x, "visitMapType", js.Any.fromFunction2(value))
  }
}
