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
  
  @scala.inline
  def apply(firstDayOfWeek: Double, minimalDaysInFirstWeek: Double, timezoneOffset: Double): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], minimalDaysInFirstWeek = minimalDaysInFirstWeek.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  
  @scala.inline
  implicit class FirstDayOfWeekMutableBuilder[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimalDaysInFirstWeek(value: Double): Self = StObject.set(x, "minimalDaysInFirstWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneOffset(value: Double): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
  }
}
