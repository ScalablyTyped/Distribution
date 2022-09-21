package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRetWithRet extends StObject {
  
  def in(collection: Any): UpdateExpression
  
  def in_(collection: Any): UpdateExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ Any, UpdateExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ Any, UpdateExpression]
  
  def into(collection: Any): UpdateExpression
  
  def `with`(collection: Any): UpdateRetWithRet
}
object UpdateRetWithRet {
  
  inline def apply(
    in: /* collection */ Any => UpdateExpression,
    in_ : /* collection */ Any => UpdateExpression,
    into: Any => UpdateExpression,
    `with`: Any => UpdateRetWithRet
  ): UpdateRetWithRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.updateDynamic("with")(js.Any.fromFunction1(`with`))
    __obj.asInstanceOf[UpdateRetWithRet]
  }
  
  extension [Self <: UpdateRetWithRet](x: Self) {
    
    inline def setIn(value: /* collection */ Any => UpdateExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* collection */ Any => UpdateExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: Any => UpdateExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
    
    inline def setWith(value: Any => UpdateRetWithRet): Self = StObject.set(x, "with", js.Any.fromFunction1(value))
  }
}
