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
    * A list of maintenance schedules during which Auto-Tune can deploy changes. Maintenance windows are deprecated and have been replaced with off-peak windows.
    */
  var MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList] = js.undefined
  
  /**
    * Whether to schedule Auto-Tune optimizations that require blue/green deployments during the domain's configured daily off-peak window.
    */
  var UseOffPeakWindow: js.UndefOr[Boolean] = js.undefined
}
object AutoTuneOptionsInput {
  
  inline def apply(): AutoTuneOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneOptionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTuneOptionsInput] (val x: Self) extends AnyVal {
    
    inline def setDesiredState(value: AutoTuneDesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setMaintenanceSchedules(value: AutoTuneMaintenanceScheduleList): Self = StObject.set(x, "MaintenanceSchedules", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceSchedulesUndefined: Self = StObject.set(x, "MaintenanceSchedules", js.undefined)
    
    inline def setMaintenanceSchedulesVarargs(value: AutoTuneMaintenanceSchedule*): Self = StObject.set(x, "MaintenanceSchedules", js.Array(value*))
    
    inline def setUseOffPeakWindow(value: Boolean): Self = StObject.set(x, "UseOffPeakWindow", value.asInstanceOf[js.Any])
    
    inline def setUseOffPeakWindowUndefined: Self = StObject.set(x, "UseOffPeakWindow", js.undefined)
  }
}
