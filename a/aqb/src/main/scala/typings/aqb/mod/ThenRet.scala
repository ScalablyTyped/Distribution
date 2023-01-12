package typings.aqb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThenRet extends StObject {
  
  def `else`(y: Any): TernaryOperation
  
  var else_ : TernaryOperation
  
  def otherwise(y: Any): TernaryOperation
}
object ThenRet {
  
  inline def apply(`else`: Any => TernaryOperation, else_ : TernaryOperation, otherwise: Any => TernaryOperation): ThenRet = {
    val __obj = js.Dynamic.literal(else_ = else_.asInstanceOf[js.Any], otherwise = js.Any.fromFunction1(otherwise))
    __obj.updateDynamic("else")(js.Any.fromFunction1(`else`))
    __obj.asInstanceOf[ThenRet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThenRet] (val x: Self) extends AnyVal {
    
    inline def setElse(value: Any => TernaryOperation): Self = StObject.set(x, "else", js.Any.fromFunction1(value))
    
    inline def setElse_(value: TernaryOperation): Self = StObject.set(x, "else_", value.asInstanceOf[js.Any])
    
    inline def setOtherwise(value: Any => TernaryOperation): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
  }
}
