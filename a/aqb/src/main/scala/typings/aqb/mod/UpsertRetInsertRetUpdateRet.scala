package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRetInsertRetUpdateRet extends StObject {
  
  def in(inCollection: Any): UpsertExpression
  
  def in_(inCollection: Any): UpsertExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* inCollection */ Any, UpsertExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* inCollection */ Any, UpsertExpression]
  
  def into(inCollection: Any): UpsertExpression
}
object UpsertRetInsertRetUpdateRet {
  
  inline def apply(
    in: /* inCollection */ Any => UpsertExpression,
    in_ : /* inCollection */ Any => UpsertExpression,
    into: Any => UpsertExpression
  ): UpsertRetInsertRetUpdateRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[UpsertRetInsertRetUpdateRet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsertRetInsertRetUpdateRet] (val x: Self) extends AnyVal {
    
    inline def setIn(value: /* inCollection */ Any => UpsertExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setIn_(value: /* inCollection */ Any => UpsertExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    inline def setInto(value: Any => UpsertExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
