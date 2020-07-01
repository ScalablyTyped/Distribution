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
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255 = null,
    EndTime: TimestampType = null,
    InstanceRefreshId: XmlStringMaxLen255 = null,
    InstancesToUpdate: js.UndefOr[InstancesToUpdate] = js.undefined,
    PercentageComplete: js.UndefOr[IntPercent] = js.undefined,
    StartTime: TimestampType = null,
    Status: InstanceRefreshStatus = null,
    StatusReason: XmlStringMaxLen1023 = null
  ): InstanceRefresh = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (InstanceRefreshId != null) __obj.updateDynamic("InstanceRefreshId")(InstanceRefreshId.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesToUpdate)) __obj.updateDynamic("InstancesToUpdate")(InstancesToUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PercentageComplete)) __obj.updateDynamic("PercentageComplete")(PercentageComplete.get.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceRefresh]
  }
}

