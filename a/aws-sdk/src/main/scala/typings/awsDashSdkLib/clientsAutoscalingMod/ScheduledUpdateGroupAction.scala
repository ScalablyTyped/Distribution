package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledUpdateGroupAction extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The number of instances you prefer to maintain in the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  /**
    * The date and time that the action is scheduled to end. 
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * The maximum size of the group.
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
  /**
    * The minimum size of the group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
  /**
    * The recurring schedule for the action.
    */
  var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  var ScheduledActionARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The date and time that the action is scheduled to begin.  When StartTime and EndTime are specified with Recurrence, they form the boundaries of when the recurring action starts and stops.
    */
  var StartTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * This parameter is deprecated.
    */
  var Time: js.UndefOr[TimestampType] = js.undefined
}

object ScheduledUpdateGroupAction {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255 = null,
    DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
    EndTime: TimestampType = null,
    MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
    MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
    Recurrence: XmlStringMaxLen255 = null,
    ScheduledActionARN: ResourceName = null,
    ScheduledActionName: XmlStringMaxLen255 = null,
    StartTime: TimestampType = null,
    Time: TimestampType = null
  ): ScheduledUpdateGroupAction = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    if (!js.isUndefined(DesiredCapacity)) __obj.updateDynamic("DesiredCapacity")(DesiredCapacity)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(MaxSize)) __obj.updateDynamic("MaxSize")(MaxSize)
    if (!js.isUndefined(MinSize)) __obj.updateDynamic("MinSize")(MinSize)
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence)
    if (ScheduledActionARN != null) __obj.updateDynamic("ScheduledActionARN")(ScheduledActionARN)
    if (ScheduledActionName != null) __obj.updateDynamic("ScheduledActionName")(ScheduledActionName)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Time != null) __obj.updateDynamic("Time")(Time)
    __obj.asInstanceOf[ScheduledUpdateGroupAction]
  }
}

