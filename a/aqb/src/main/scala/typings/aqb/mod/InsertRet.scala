package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertRet extends StObject {
  
  def in(collection: Any): InsertExpression
  
  def in_(collection: Any): InsertExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ Any, InsertExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ Any, InsertExpression]
  
  def into(collection: Any): InsertExpression
}
object InsertRet {
  
  inline def apply(
    in: /* collection */ Any => InsertExpression,
    in_ : /* collection */ Any => InsertExpression,
    into: Any => InsertExpression
  ): InsertRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[InsertRet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertRet] (val x: Self) extends AnyVal {
    
    inline def setIn(value: /* collection */ Any => InsertExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* collection */ Any => InsertExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: Any => InsertExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
