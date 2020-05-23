package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /**
    * The ID of the activity.
    */
  var ActivityId: XmlString = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * The reason the activity began.
    */
  var Cause: XmlStringMaxLen1023 = js.native
  /**
    * A friendly, more verbose description of the activity.
    */
  var Description: js.UndefOr[XmlString] = js.native
  /**
    * The details about the activity.
    */
  var Details: js.UndefOr[XmlString] = js.native
  /**
    * The end time of the activity.
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  /**
    * A value between 0 and 100 that indicates the progress of the activity.
    */
  var Progress: js.UndefOr[typings.awsSdk.autoscalingMod.Progress] = js.native
  /**
    * The start time of the activity.
    */
  var StartTime: TimestampType = js.native
  /**
    * The current status of the activity.
    */
  var StatusCode: ScalingActivityStatusCode = js.native
  /**
    * A friendly, more verbose description of the activity status.
    */
  var StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.native
}

object Activity {
  @scala.inline
  def apply(
    ActivityId: XmlString,
    AutoScalingGroupName: XmlStringMaxLen255,
    Cause: XmlStringMaxLen1023,
    StartTime: TimestampType,
    StatusCode: ScalingActivityStatusCode,
    Description: XmlString = null,
    Details: XmlString = null,
    EndTime: TimestampType = null,
    Progress: js.UndefOr[Progress] = js.undefined,
    StatusMessage: XmlStringMaxLen255 = null
  ): Activity = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], Cause = Cause.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (!js.isUndefined(Progress)) __obj.updateDynamic("Progress")(Progress.get.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

