package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var sourceSpan: ParseSourceSpan
  
  def visit(visitor: Visitor, context: Any): Any
}
object BaseNode {
  
  inline def apply(sourceSpan: ParseSourceSpan, visit: (Visitor, Any) => Any): BaseNode = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[BaseNode]
  }
  
  extension [Self <: BaseNode](x: Self) {
    
    inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    inline def setVisit(value: (Visitor, Any) => Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
  }
}
