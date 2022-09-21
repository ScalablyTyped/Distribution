package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForRet extends StObject {
  
  def in(expr: Any): ForExpression
  
  def in_(expr: Any): ForExpression
  @JSName("in_")
  var in__Original: js.Function1[/* expr */ Any, ForExpression]
}
object ForRet {
  
  inline def apply(in: Any => ForExpression, in_ : /* expr */ Any => ForExpression): ForRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_))
    __obj.asInstanceOf[ForRet]
  }
  
  extension [Self <: ForRet](x: Self) {
    
    inline def setIn(value: Any => ForExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* expr */ Any => ForExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
  }
}
