package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklyAutoScalingSchedule extends StObject {
  
  /**
    * The schedule for Friday.
    */
  var Friday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  
  /**
    * The schedule for Monday.
    */
  var Monday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  
  /**
    * The schedule for Saturday.
    */
  var Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  
  /**
    * The schedule for Sunday.
    */
  var Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  
  /**
    * The schedule for Thursday.
    */
  var Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  
  /**
    * The schedule for Tuesday.
    */
  var Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  
  /**
    * The schedule for Wednesday.
    */
  var Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
}
object WeeklyAutoScalingSchedule {
  
  inline def apply(): WeeklyAutoScalingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyAutoScalingSchedule]
  }
  
  extension [Self <: WeeklyAutoScalingSchedule](x: Self) {
    
    inline def setFriday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Friday", value.asInstanceOf[js.Any])
    
    inline def setFridayUndefined: Self = StObject.set(x, "Friday", js.undefined)
    
    inline def setMonday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Monday", value.asInstanceOf[js.Any])
    
    inline def setMondayUndefined: Self = StObject.set(x, "Monday", js.undefined)
    
    inline def setSaturday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Saturday", value.asInstanceOf[js.Any])
    
    inline def setSaturdayUndefined: Self = StObject.set(x, "Saturday", js.undefined)
    
    inline def setSunday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Sunday", value.asInstanceOf[js.Any])
    
    inline def setSundayUndefined: Self = StObject.set(x, "Sunday", js.undefined)
    
    inline def setThursday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Thursday", value.asInstanceOf[js.Any])
    
    inline def setThursdayUndefined: Self = StObject.set(x, "Thursday", js.undefined)
    
    inline def setTuesday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Tuesday", value.asInstanceOf[js.Any])
    
    inline def setTuesdayUndefined: Self = StObject.set(x, "Tuesday", js.undefined)
    
    inline def setWednesday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Wednesday", value.asInstanceOf[js.Any])
    
    inline def setWednesdayUndefined: Self = StObject.set(x, "Wednesday", js.undefined)
  }
}
