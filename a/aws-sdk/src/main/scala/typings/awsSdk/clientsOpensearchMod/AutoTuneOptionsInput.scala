package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneOptionsInput extends StObject {
  
  /**
    * Whether Auto-Tune is enabled or disabled.
    */
  var DesiredState: js.UndefOr[AutoTuneDesiredState] = js.undefined
  
  /**
    * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance schedules are overwrite, not append. If your request includes no schedules, the request deletes all existing schedules. To preserve existing schedules, make a call to DescribeDomainConfig first and use the MaintenanceSchedules portion of the response as the basis for this section.
    */
  var MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList] = js.undefined
}
object AutoTuneOptionsInput {
  
  inline def apply(): AutoTuneOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneOptionsInput]
  }
  
  extension [Self <: AutoTuneOptionsInput](x: Self) {
    
    inline def setDesiredState(value: AutoTuneDesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setMaintenanceSchedules(value: AutoTuneMaintenanceScheduleList): Self = StObject.set(x, "MaintenanceSchedules", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceSchedulesUndefined: Self = StObject.set(x, "MaintenanceSchedules", js.undefined)
    
    inline def setMaintenanceSchedulesVarargs(value: AutoTuneMaintenanceSchedule*): Self = StObject.set(x, "MaintenanceSchedules", js.Array(value*))
  }
}
