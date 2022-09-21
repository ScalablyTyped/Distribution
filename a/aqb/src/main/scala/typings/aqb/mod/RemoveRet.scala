package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRet extends StObject {
  
  def in(collection: Any): RemoveExpression
  
  def in_(collection: Any): RemoveExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ Any, RemoveExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ Any, RemoveExpression]
  
  def into(collection: Any): RemoveExpression
}
object RemoveRet {
  
  inline def apply(
    in: /* collection */ Any => RemoveExpression,
    in_ : /* collection */ Any => RemoveExpression,
    into: Any => RemoveExpression
  ): RemoveRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[RemoveRet]
  }
  
  extension [Self <: RemoveRet](x: Self) {
    
    inline def setIn(value: /* collection */ Any => RemoveExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* collection */ Any => RemoveExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: Any => RemoveExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
