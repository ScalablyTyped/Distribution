package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledActionsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * The latest scheduled start time to return. If scheduled action names are provided, this parameter is ignored.
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * The names of one or more scheduled actions. You can specify up to 50 actions. If you omit this parameter, all scheduled actions are described. If you specify an unknown scheduled action, it is ignored with no error.
    */
  var ScheduledActionNames: js.UndefOr[typings.awsSdk.autoscalingMod.ScheduledActionNames] = js.native
  /**
    * The earliest scheduled start time to return. If scheduled action names are provided, this parameter is ignored.
    */
  var StartTime: js.UndefOr[TimestampType] = js.native
}

object DescribeScheduledActionsType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName = null,
    EndTime: TimestampType = null,
    MaxRecords: Int | Double = null,
    NextToken: XmlString = null,
    ScheduledActionNames: ScheduledActionNames = null,
    StartTime: TimestampType = null
  ): DescribeScheduledActionsType = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledActionNames != null) __obj.updateDynamic("ScheduledActionNames")(ScheduledActionNames.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledActionsType]
  }
}

