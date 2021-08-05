package typings.activexInterop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  def getVarDate(): VarDate
}
object Date {
  
  inline def apply(getVarDate: () => VarDate): Date = {
    val __obj = js.Dynamic.literal(getVarDate = js.Any.fromFunction0(getVarDate))
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setGetVarDate(value: () => VarDate): Self = StObject.set(x, "getVarDate", js.Any.fromFunction0(value))
  }
}
