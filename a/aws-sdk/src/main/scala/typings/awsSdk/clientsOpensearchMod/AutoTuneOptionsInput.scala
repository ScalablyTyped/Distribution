package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneOptionsInput extends StObject {
  
  /**
    * The Auto-Tune desired state. Valid values are ENABLED and DISABLED.
    */
  var DesiredState: js.UndefOr[AutoTuneDesiredState] = js.undefined
  
  /**
    * A list of maintenance schedules. See  Auto-Tune for Amazon OpenSearch Service  for more information. 
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
