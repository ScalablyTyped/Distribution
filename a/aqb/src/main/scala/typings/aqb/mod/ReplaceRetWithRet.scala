package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRetWithRet extends StObject {
  
  def in(collection: Any): ReplaceExpression
  
  def in_(collection: Any): ReplaceExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ Any, ReplaceExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ Any, ReplaceExpression]
  
  def into(collection: Any): ReplaceExpression
  
  def `with`(collection: Any): ReplaceRetWithRet
}
object ReplaceRetWithRet {
  
  inline def apply(
    in: /* collection */ Any => ReplaceExpression,
    in_ : /* collection */ Any => ReplaceExpression,
    into: Any => ReplaceExpression,
    `with`: Any => ReplaceRetWithRet
  ): ReplaceRetWithRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.updateDynamic("with")(js.Any.fromFunction1(`with`))
    __obj.asInstanceOf[ReplaceRetWithRet]
  }
  
  extension [Self <: ReplaceRetWithRet](x: Self) {
    
    inline def setIn(value: /* collection */ Any => ReplaceExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* collection */ Any => ReplaceExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: Any => ReplaceExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
    
    inline def setWith(value: Any => ReplaceRetWithRet): Self = StObject.set(x, "with", js.Any.fromFunction1(value))
  }
}
