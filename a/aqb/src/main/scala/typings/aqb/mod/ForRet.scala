package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForRet extends StObject {
  
  def in(expr: js.Any): ForExpression
  
  def in_(expr: js.Any): ForExpression
  @JSName("in_")
  var in__Original: js.Function1[/* expr */ js.Any, ForExpression]
}
object ForRet {
  
  @scala.inline
  def apply(in: js.Any => ForExpression, in_ : /* expr */ js.Any => ForExpression): ForRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_))
    __obj.asInstanceOf[ForRet]
  }
  
  @scala.inline
  implicit class ForRetMutableBuilder[Self <: ForRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Any => ForExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn_(value: /* expr */ js.Any => ForExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
  }
}
