package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRefresh extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * Describes the specific update you want to deploy.
    */
  var DesiredConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.DesiredConfiguration] = js.undefined
  
  /**
    * The date and time at which the instance refresh ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The instance refresh ID.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The number of instances remaining to update before the instance refresh is complete.
    */
  var InstancesToUpdate: js.UndefOr[typings.awsSdk.autoscalingMod.InstancesToUpdate] = js.undefined
  
  /**
    * The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and the specified warm-up time passes, the instance is considered updated and is added to the percentage complete.
    */
  var PercentageComplete: js.UndefOr[IntPercent] = js.undefined
  
  var Preferences: js.UndefOr[RefreshPreferences] = js.undefined
  
  /**
    * Additional progress details for an Auto Scaling group that has a warm pool.
    */
  var ProgressDetails: js.UndefOr[InstanceRefreshProgressDetails] = js.undefined
  
  /**
    * The date and time at which the instance refresh began.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status for the instance refresh operation:    Pending - The request was created, but the operation has not started.    InProgress - The operation is in progress.    Successful - The operation completed successfully.    Failed - The operation failed to complete. You can troubleshoot using the status reason and the scaling activities.     Cancelling - An ongoing operation is being cancelled. Cancellation does not roll back any replacements that have already been completed, but it prevents new replacements from being started.     Cancelled - The operation is cancelled.   
    */
  var Status: js.UndefOr[InstanceRefreshStatus] = js.undefined
  
  /**
    * Provides more details about the current status of the instance refresh. 
    */
  var StatusReason: js.UndefOr[XmlStringMaxLen1023] = js.undefined
}
object InstanceRefresh {
  
  inline def apply(): InstanceRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRefresh]
  }
  
  extension [Self <: InstanceRefresh](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setDesiredConfiguration(value: DesiredConfiguration): Self = StObject.set(x, "DesiredConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDesiredConfigurationUndefined: Self = StObject.set(x, "DesiredConfiguration", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
    
    inline def setInstancesToUpdate(value: InstancesToUpdate): Self = StObject.set(x, "InstancesToUpdate", value.asInstanceOf[js.Any])
    
    inline def setInstancesToUpdateUndefined: Self = StObject.set(x, "InstancesToUpdate", js.undefined)
    
    inline def setPercentageComplete(value: IntPercent): Self = StObject.set(x, "PercentageComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleteUndefined: Self = StObject.set(x, "PercentageComplete", js.undefined)
    
    inline def setPreferences(value: RefreshPreferences): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
    
    inline def setProgressDetails(value: InstanceRefreshProgressDetails): Self = StObject.set(x, "ProgressDetails", value.asInstanceOf[js.Any])
    
    inline def setProgressDetailsUndefined: Self = StObject.set(x, "ProgressDetails", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: InstanceRefreshStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: XmlStringMaxLen1023): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
