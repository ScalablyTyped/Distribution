package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeVisitor extends StObject {
  
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any = js.native
  
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any = js.native
  
  def visitExpressionType(`type`: ExpressionType_, context: js.Any): js.Any = js.native
  
  def visitMapType(`type`: MapType, context: js.Any): js.Any = js.native
}
object TypeVisitor {
  
  @scala.inline
  def apply(
    visitArrayType: (ArrayType, js.Any) => js.Any,
    visitBuiltinType: (BuiltinType, js.Any) => js.Any,
    visitExpressionType: (ExpressionType_, js.Any) => js.Any,
    visitMapType: (MapType, js.Any) => js.Any
  ): TypeVisitor = {
    val __obj = js.Dynamic.literal(visitArrayType = js.Any.fromFunction2(visitArrayType), visitBuiltinType = js.Any.fromFunction2(visitBuiltinType), visitExpressionType = js.Any.fromFunction2(visitExpressionType), visitMapType = js.Any.fromFunction2(visitMapType))
    __obj.asInstanceOf[TypeVisitor]
  }
  
  @scala.inline
  implicit class TypeVisitorMutableBuilder[Self <: TypeVisitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisitArrayType(value: (ArrayType, js.Any) => js.Any): Self = StObject.set(x, "visitArrayType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitBuiltinType(value: (BuiltinType, js.Any) => js.Any): Self = StObject.set(x, "visitBuiltinType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitExpressionType(value: (ExpressionType_, js.Any) => js.Any): Self = StObject.set(x, "visitExpressionType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisitMapType(value: (MapType, js.Any) => js.Any): Self = StObject.set(x, "visitMapType", js.Any.fromFunction2(value))
  }
}
