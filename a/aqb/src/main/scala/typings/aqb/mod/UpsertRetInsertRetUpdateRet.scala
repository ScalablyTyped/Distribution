package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRetInsertRetUpdateRet extends StObject {
  
  def in(inCollection: js.Any): UpsertExpression
  
  def in_(inCollection: js.Any): UpsertExpression
  
  @JSName("in")
  var in_Original: js.Function1[/* inCollection */ js.Any, UpsertExpression]
  
  @JSName("in_")
  var in__Original: js.Function1[/* inCollection */ js.Any, UpsertExpression]
  
  def into(inCollection: js.Any): UpsertExpression
}
object UpsertRetInsertRetUpdateRet {
  
  @scala.inline
  def apply(
    in: /* inCollection */ js.Any => UpsertExpression,
    in_ : /* inCollection */ js.Any => UpsertExpression,
    into: js.Any => UpsertExpression
  ): UpsertRetInsertRetUpdateRet = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), in_ = js.Any.fromFunction1(in_), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[UpsertRetInsertRetUpdateRet]
  }
  
  @scala.inline
  implicit class UpsertRetInsertRetUpdateRetMutableBuilder[Self <: UpsertRetInsertRetUpdateRet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: /* inCollection */ js.Any => UpsertExpression): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn_(value: /* inCollection */ js.Any => UpsertExpression): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInto(value: js.Any => UpsertExpression): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
