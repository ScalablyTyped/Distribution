package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklyStartTime extends StObject {
  
  /**
    * Required. The day of the week.
    */
  var DayOfWeek: typings.awsSdk.clientsMqMod.DayOfWeek
  
  /**
    * Required. The time, in 24-hour format.
    */
  var TimeOfDay: string
  
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
    */
  var TimeZone: js.UndefOr[string] = js.undefined
}
object WeeklyStartTime {
  
  inline def apply(DayOfWeek: DayOfWeek, TimeOfDay: string): WeeklyStartTime = {
    val __obj = js.Dynamic.literal(DayOfWeek = DayOfWeek.asInstanceOf[js.Any], TimeOfDay = TimeOfDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeeklyStartTime]
  }
  
  extension [Self <: WeeklyStartTime](x: Self) {
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDay(value: string): Self = StObject.set(x, "TimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: string): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
  }
}
