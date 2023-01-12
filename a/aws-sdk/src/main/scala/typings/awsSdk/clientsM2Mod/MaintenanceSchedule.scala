package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceSchedule extends StObject {
  
  /**
    * The time the scheduled maintenance is to end.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the scheduled maintenance is to start.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object MaintenanceSchedule {
  
  inline def apply(): MaintenanceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceSchedule] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
