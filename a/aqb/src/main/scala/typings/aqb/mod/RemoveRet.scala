package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRet extends StObject {
  
  def in(collection: js.Any): RemoveExpression
  
  def in_(collection: js.Any): RemoveExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* collection */ js.Any, RemoveExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* collection */ js.Any, RemoveExpression]
  
  def into(collection: js.Any): RemoveExpression
}
object RemoveRet {
  
  @scala.inline
  def apply(
    in: /* collection */ js.Any => RemoveExpression,
    in_ : /* collection */ js.Any => RemoveExpression,
    into: js.Any => RemoveExpression
  ): RemoveRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[RemoveRet]
  }
  
  @scala.inline
  implicit class RemoveRetMutableBuilder[Self <: RemoveRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: /* collection */ js.Any => RemoveExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn_(value: /* collection */ js.Any => RemoveExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInto(value: js.Any => RemoveExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
