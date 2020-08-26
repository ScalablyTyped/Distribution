package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceRefresh extends js.Object {
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
  implicit class InstanceRefreshOps[Self <: InstanceRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroupName: Self = this.set("AutoScalingGroupName", js.undefined)
    @scala.inline
    def setEndTime(value: TimestampType): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setInstanceRefreshId(value: XmlStringMaxLen255): Self = this.set("InstanceRefreshId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceRefreshId: Self = this.set("InstanceRefreshId", js.undefined)
    @scala.inline
    def setInstancesToUpdate(value: InstancesToUpdate): Self = this.set("InstancesToUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesToUpdate: Self = this.set("InstancesToUpdate", js.undefined)
    @scala.inline
    def setPercentageComplete(value: IntPercent): Self = this.set("PercentageComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentageComplete: Self = this.set("PercentageComplete", js.undefined)
    @scala.inline
    def setStartTime(value: TimestampType): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: InstanceRefreshStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusReason(value: XmlStringMaxLen1023): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
  }
  
}

