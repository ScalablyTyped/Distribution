package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutScheduledUpdateGroupActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The number of EC2 instances that should be running in the Auto Scaling group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  /**
    * The date and time for the recurring schedule to end. Amazon EC2 Auto Scaling does not perform the action after this time. 
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * The maximum number of instances in the Auto Scaling group.
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
  /**
    * The minimum number of instances in the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
  /**
    * The recurring schedule for this action, in Unix cron syntax format. This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, "30 0 1 1,6,12 *"). For more information about this format, see Crontab. When StartTime and EndTime are specified with Recurrence, they form the boundaries of when the recurring action starts and stops.
    */
  var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The name of this scaling action.
    */
  var ScheduledActionName: XmlStringMaxLen255
  /**
    * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes (for example, "2019-06-01T00:00:00Z"). If you specify Recurrence and StartTime, Amazon EC2 Auto Scaling performs the action at this time, and then performs the action based on the specified recurrence. If you try to schedule your action in the past, Amazon EC2 Auto Scaling returns an error message.
    */
  var StartTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * This parameter is deprecated.
    */
  var Time: js.UndefOr[TimestampType] = js.undefined
}

object PutScheduledUpdateGroupActionType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ScheduledActionName: XmlStringMaxLen255,
    DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
    EndTime: TimestampType = null,
    MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
    MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
    Recurrence: XmlStringMaxLen255 = null,
    StartTime: TimestampType = null,
    Time: TimestampType = null
  ): PutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, ScheduledActionName = ScheduledActionName)
    if (!js.isUndefined(DesiredCapacity)) __obj.updateDynamic("DesiredCapacity")(DesiredCapacity)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(MaxSize)) __obj.updateDynamic("MaxSize")(MaxSize)
    if (!js.isUndefined(MinSize)) __obj.updateDynamic("MinSize")(MinSize)
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Time != null) __obj.updateDynamic("Time")(Time)
    __obj.asInstanceOf[PutScheduledUpdateGroupActionType]
  }
}

