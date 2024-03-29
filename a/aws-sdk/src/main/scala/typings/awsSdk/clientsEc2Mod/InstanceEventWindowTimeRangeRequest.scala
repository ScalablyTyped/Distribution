package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEventWindowTimeRangeRequest extends StObject {
  
  /**
    * The hour when the time range ends.
    */
  var EndHour: js.UndefOr[Hour] = js.undefined
  
  /**
    * The day on which the time range ends.
    */
  var EndWeekDay: js.UndefOr[WeekDay] = js.undefined
  
  /**
    * The hour when the time range begins.
    */
  var StartHour: js.UndefOr[Hour] = js.undefined
  
  /**
    * The day on which the time range begins.
    */
  var StartWeekDay: js.UndefOr[WeekDay] = js.undefined
}
object InstanceEventWindowTimeRangeRequest {
  
  inline def apply(): InstanceEventWindowTimeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEventWindowTimeRangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceEventWindowTimeRangeRequest] (val x: Self) extends AnyVal {
    
    inline def setEndHour(value: Hour): Self = StObject.set(x, "EndHour", value.asInstanceOf[js.Any])
    
    inline def setEndHourUndefined: Self = StObject.set(x, "EndHour", js.undefined)
    
    inline def setEndWeekDay(value: WeekDay): Self = StObject.set(x, "EndWeekDay", value.asInstanceOf[js.Any])
    
    inline def setEndWeekDayUndefined: Self = StObject.set(x, "EndWeekDay", js.undefined)
    
    inline def setStartHour(value: Hour): Self = StObject.set(x, "StartHour", value.asInstanceOf[js.Any])
    
    inline def setStartHourUndefined: Self = StObject.set(x, "StartHour", js.undefined)
    
    inline def setStartWeekDay(value: WeekDay): Self = StObject.set(x, "StartWeekDay", value.asInstanceOf[js.Any])
    
    inline def setStartWeekDayUndefined: Self = StObject.set(x, "StartWeekDay", js.undefined)
  }
}
