package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneOptions extends StObject {
  
  /**
    * Whether Auto-Tune is enabled or disabled.
    */
  var DesiredState: js.UndefOr[AutoTuneDesiredState] = js.undefined
  
  /**
    * DEPRECATED. Use off-peak window instead. A list of maintenance schedules during which Auto-Tune can deploy changes.
    */
  var MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList] = js.undefined
  
  /**
    * When disabling Auto-Tune, specify NO_ROLLBACK to retain all prior Auto-Tune settings or DEFAULT_ROLLBACK to revert to the OpenSearch Service defaults. If you specify DEFAULT_ROLLBACK, you must include a MaintenanceSchedule in the request. Otherwise, OpenSearch Service is unable to perform the rollback.
    */
  var RollbackOnDisable: js.UndefOr[typings.awsSdk.clientsOpensearchMod.RollbackOnDisable] = js.undefined
  
  /**
    * Whether to use the domain's off-peak window to deploy configuration changes on the domain rather than a maintenance schedule.
    */
  var UseOffPeakWindow: js.UndefOr[Boolean] = js.undefined
}
object AutoTuneOptions {
  
  inline def apply(): AutoTuneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTuneOptions] (val x: Self) extends AnyVal {
    
    inline def setDesiredState(value: AutoTuneDesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setMaintenanceSchedules(value: AutoTuneMaintenanceScheduleList): Self = StObject.set(x, "MaintenanceSchedules", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceSchedulesUndefined: Self = StObject.set(x, "MaintenanceSchedules", js.undefined)
    
    inline def setMaintenanceSchedulesVarargs(value: AutoTuneMaintenanceSchedule*): Self = StObject.set(x, "MaintenanceSchedules", js.Array(value*))
    
    inline def setRollbackOnDisable(value: RollbackOnDisable): Self = StObject.set(x, "RollbackOnDisable", value.asInstanceOf[js.Any])
    
    inline def setRollbackOnDisableUndefined: Self = StObject.set(x, "RollbackOnDisable", js.undefined)
    
    inline def setUseOffPeakWindow(value: Boolean): Self = StObject.set(x, "UseOffPeakWindow", value.asInstanceOf[js.Any])
    
    inline def setUseOffPeakWindowUndefined: Self = StObject.set(x, "UseOffPeakWindow", js.undefined)
  }
}
