package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklySchedule extends StObject {
  
  /**
    * The day of the week when Amazon Macie runs the job.
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
}
object WeeklySchedule {
  
  inline def apply(): WeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklySchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeeklySchedule] (val x: Self) extends AnyVal {
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
  }
}
