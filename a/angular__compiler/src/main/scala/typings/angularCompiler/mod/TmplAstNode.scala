package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TmplAstNode extends StObject {
  
  var sourceSpan: ParseSourceSpan
  
  def visit[Result](visitor: Visitor3[Result]): Result
}
object TmplAstNode {
  
  inline def apply(sourceSpan: ParseSourceSpan, visit: Visitor3[Any] => Any): TmplAstNode = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[TmplAstNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TmplAstNode] (val x: Self) extends AnyVal {
    
    inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    inline def setVisit(value: Visitor3[Any] => Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
  }
}
