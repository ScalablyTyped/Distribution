package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulingConfig extends StObject {
  
  /**
    * Specifies the end behavior for all job executions after a job reaches the selected endTime. If endTime is not selected when creating the job, then endBehavior does not apply.
    */
  var endBehavior: js.UndefOr[JobEndBehavior] = js.undefined
  
  /**
    * The time a job will stop rollout of the job document to all devices in the target group for a job. The endTime must take place no later than two years from the current time and be scheduled a minimum of thirty minutes from the current time. The minimum duration between startTime and endTime is thirty minutes. The maximum duration between startTime and endTime is two years. The date and time format for the endTime is YYYY-MM-DD for the date and HH:MM for the time.
    */
  var endTime: js.UndefOr[StringDateTime] = js.undefined
  
  /**
    * An optional configuration within the SchedulingConfig to setup a recurring maintenance window with a predetermined start time and duration for the rollout of a job document to all devices in a target group for a job.
    */
  var maintenanceWindows: js.UndefOr[MaintenanceWindows] = js.undefined
  
  /**
    * The time a job will begin rollout of the job document to all devices in the target group for a job. The startTime can be scheduled up to a year in advance and must be scheduled a minimum of thirty minutes from the current time. The date and time format for the startTime is YYYY-MM-DD for the date and HH:MM for the time.
    */
  var startTime: js.UndefOr[StringDateTime] = js.undefined
}
object SchedulingConfig {
  
  inline def apply(): SchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulingConfig] (val x: Self) extends AnyVal {
    
    inline def setEndBehavior(value: JobEndBehavior): Self = StObject.set(x, "endBehavior", value.asInstanceOf[js.Any])
    
    inline def setEndBehaviorUndefined: Self = StObject.set(x, "endBehavior", js.undefined)
    
    inline def setEndTime(value: StringDateTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaintenanceWindows(value: MaintenanceWindows): Self = StObject.set(x, "maintenanceWindows", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowsUndefined: Self = StObject.set(x, "maintenanceWindows", js.undefined)
    
    inline def setMaintenanceWindowsVarargs(value: MaintenanceWindow*): Self = StObject.set(x, "maintenanceWindows", js.Array(value*))
    
    inline def setStartTime(value: StringDateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
