package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObject extends StObject {
  
  def AddDays(pvarDate: Any, pvarDays: Any): Any
  
  def AddSeconds(pvarTime: Any, pvarSeconds: Any): Any
  
  /* private */ @JSName("InfoPath.DateObject_typekey")
  var InfoPathDotDateObject_typekey: DateObject
  
  def Now(): Any
  
  def Today(): Any
}
object DateObject {
  
  inline def apply(
    AddDays: (Any, Any) => Any,
    AddSeconds: (Any, Any) => Any,
    InfoPathDotDateObject_typekey: DateObject,
    Now: () => Any,
    Today: () => Any
  ): DateObject = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddSeconds = js.Any.fromFunction2(AddSeconds), Now = js.Any.fromFunction0(Now), Today = js.Any.fromFunction0(Today))
    __obj.updateDynamic("InfoPath.DateObject_typekey")(InfoPathDotDateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  extension [Self <: DateObject](x: Self) {
    
    inline def setAddDays(value: (Any, Any) => Any): Self = StObject.set(x, "AddDays", js.Any.fromFunction2(value))
    
    inline def setAddSeconds(value: (Any, Any) => Any): Self = StObject.set(x, "AddSeconds", js.Any.fromFunction2(value))
    
    inline def setInfoPathDotDateObject_typekey(value: DateObject): Self = StObject.set(x, "InfoPath.DateObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setNow(value: () => Any): Self = StObject.set(x, "Now", js.Any.fromFunction0(value))
    
    inline def setToday(value: () => Any): Self = StObject.set(x, "Today", js.Any.fromFunction0(value))
  }
}
