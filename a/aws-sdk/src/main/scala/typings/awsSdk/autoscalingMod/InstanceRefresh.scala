package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceRefresh extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The date and time at which the instance refresh ended.
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * The instance refresh ID.
    */
  var InstanceRefreshId: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The number of instances remaining to update before the instance refresh is complete.
    */
  var InstancesToUpdate: js.UndefOr[typings.awsSdk.autoscalingMod.InstancesToUpdate] = js.native
  
  /**
    * The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and the specified warm-up time passes, the instance is considered updated and added to the percentage complete.
    */
  var PercentageComplete: js.UndefOr[IntPercent] = js.native
  
  /**
    * The date and time at which the instance refresh began.
    */
  var StartTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * The current status for the instance refresh operation:    Pending - The request was created, but the operation has not started.    InProgress - The operation is in progress.    Successful - The operation completed successfully.    Failed - The operation failed to complete. You can troubleshoot using the status reason and the scaling activities.     Cancelling - An ongoing operation is being cancelled. Cancellation does not roll back any replacements that have already been completed, but it prevents new replacements from being started.     Cancelled - The operation is cancelled.   
    */
  var Status: js.UndefOr[InstanceRefreshStatus] = js.native
  
  /**
    * Provides more details about the current status of the instance refresh. 
    */
  var StatusReason: js.UndefOr[XmlStringMaxLen1023] = js.native
}
object InstanceRefresh {
  
  @scala.inline
  def apply(): InstanceRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRefresh]
  }
  
  @scala.inline
  implicit class InstanceRefreshMutableBuilder[Self <: InstanceRefresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInstanceRefreshId(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceRefreshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRefreshIdUndefined: Self = StObject.set(x, "InstanceRefreshId", js.undefined)
    
    @scala.inline
    def setInstancesToUpdate(value: InstancesToUpdate): Self = StObject.set(x, "InstancesToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesToUpdateUndefined: Self = StObject.set(x, "InstancesToUpdate", js.undefined)
    
    @scala.inline
    def setPercentageComplete(value: IntPercent): Self = StObject.set(x, "PercentageComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageCompleteUndefined: Self = StObject.set(x, "PercentageComplete", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceRefreshStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: XmlStringMaxLen1023): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
