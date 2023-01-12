package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstDayOfWeek extends StObject {
  
  var firstDayOfWeek: Double
  
  var minimalDaysInFirstWeek: Double
  
  var timezoneOffset: Double
}
object FirstDayOfWeek {
  
  inline def apply(firstDayOfWeek: Double, minimalDaysInFirstWeek: Double, timezoneOffset: Double): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], minimalDaysInFirstWeek = minimalDaysInFirstWeek.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setMinimalDaysInFirstWeek(value: Double): Self = StObject.set(x, "minimalDaysInFirstWeek", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffset(value: Double): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
  }
}
