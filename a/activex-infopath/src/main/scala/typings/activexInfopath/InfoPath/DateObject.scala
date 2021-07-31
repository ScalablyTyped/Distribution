package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObject extends StObject {
  
  def AddDays(pvarDate: js.Any, pvarDays: js.Any): js.Any
  
  def AddSeconds(pvarTime: js.Any, pvarSeconds: js.Any): js.Any
  
  @JSName("InfoPath.DateObject_typekey")
  var InfoPathDotDateObject_typekey: DateObject
  
  def Now(): js.Any
  
  def Today(): js.Any
}
object DateObject {
  
  @scala.inline
  def apply(
    AddDays: (js.Any, js.Any) => js.Any,
    AddSeconds: (js.Any, js.Any) => js.Any,
    InfoPathDotDateObject_typekey: DateObject,
    Now: () => js.Any,
    Today: () => js.Any
  ): DateObject = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddSeconds = js.Any.fromFunction2(AddSeconds), Now = js.Any.fromFunction0(Now), Today = js.Any.fromFunction0(Today))
    __obj.updateDynamic("InfoPath.DateObject_typekey")(InfoPathDotDateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  @scala.inline
  implicit class DateObjectMutableBuilder[Self <: DateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDays(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "AddDays", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSeconds(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "AddSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInfoPathDotDateObject_typekey(value: DateObject): Self = StObject.set(x, "InfoPath.DateObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: () => js.Any): Self = StObject.set(x, "Now", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToday(value: () => js.Any): Self = StObject.set(x, "Today", js.Any.fromFunction0(value))
  }
}
