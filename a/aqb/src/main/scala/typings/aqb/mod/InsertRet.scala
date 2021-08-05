package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertRet extends StObject {
  
  def in(collection: js.Any): InsertExpression
  
  def in_(collection: js.Any): InsertExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ js.Any, InsertExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ js.Any, InsertExpression]
  
  def into(collection: js.Any): InsertExpression
}
object InsertRet {
  
  inline def apply(
    in: /* collection */ js.Any => InsertExpression,
    in_ : /* collection */ js.Any => InsertExpression,
    into: js.Any => InsertExpression
  ): InsertRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[InsertRet]
  }
  
  extension [Self <: InsertRet](x: Self) {
    
    inline def setIn(value: /* collection */ js.Any => InsertExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* collection */ js.Any => InsertExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: js.Any => InsertExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
