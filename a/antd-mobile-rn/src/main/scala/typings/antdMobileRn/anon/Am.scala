package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Am extends StObject {
  
  var am: js.UndefOr[String] = js.undefined
  
  var day: String
  
  var hour: String
  
  var minute: String
  
  var month: String
  
  var pm: js.UndefOr[String] = js.undefined
  
  var year: String
}
object Am {
  
  inline def apply(day: String, hour: String, minute: String, month: String, year: String): Am = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Am]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Am] (val x: Self) extends AnyVal {
    
    inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    inline def setAmUndefined: Self = StObject.set(x, "am", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    
    inline def setPmUndefined: Self = StObject.set(x, "pm", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
