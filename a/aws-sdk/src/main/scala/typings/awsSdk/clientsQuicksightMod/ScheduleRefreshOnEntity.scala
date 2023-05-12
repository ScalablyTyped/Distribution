package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleRefreshOnEntity extends StObject {
  
  /**
    * The day of the month that you want to schedule refresh on.
    */
  var DayOfMonth: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DayOfMonth] = js.undefined
  
  /**
    * The day of the week that you want to schedule a refresh on.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DayOfWeek] = js.undefined
}
object ScheduleRefreshOnEntity {
  
  inline def apply(): ScheduleRefreshOnEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRefreshOnEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleRefreshOnEntity] (val x: Self) extends AnyVal {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
  }
}
