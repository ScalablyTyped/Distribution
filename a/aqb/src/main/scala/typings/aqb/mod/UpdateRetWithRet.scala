package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRetWithRet extends StObject {
  
  def in(collection: js.Any): UpdateExpression
  
  def in_(collection: js.Any): UpdateExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ js.Any, UpdateExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ js.Any, UpdateExpression]
  
  def into(collection: js.Any): UpdateExpression
  
  def `with`(collection: js.Any): UpdateRetWithRet
}
object UpdateRetWithRet {
  
  inline def apply(
    in: /* collection */ js.Any => UpdateExpression,
    in_ : /* collection */ js.Any => UpdateExpression,
    into: js.Any => UpdateExpression,
    `with`: js.Any => UpdateRetWithRet
  ): UpdateRetWithRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.updateDynamic("with")(js.Any.fromFunction1(`with`))
    __obj.asInstanceOf[UpdateRetWithRet]
  }
  
  extension [Self <: UpdateRetWithRet](x: Self) {
    
    inline def setIn(value: /* collection */ js.Any => UpdateExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* collection */ js.Any => UpdateExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: js.Any => UpdateExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
    
    inline def setWith(value: js.Any => UpdateRetWithRet): Self = StObject.set(x, "with", js.Any.fromFunction1(value))
  }
}
