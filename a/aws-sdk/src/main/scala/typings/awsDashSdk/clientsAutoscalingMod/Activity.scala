package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /**
    * The ID of the activity.
    */
  var ActivityId: XmlString
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  /**
    * The reason the activity began.
    */
  var Cause: XmlStringMaxLen1023
  /**
    * A friendly, more verbose description of the activity.
    */
  var Description: js.UndefOr[XmlString] = js.undefined
  /**
    * The details about the activity.
    */
  var Details: js.UndefOr[XmlString] = js.undefined
  /**
    * The end time of the activity.
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * A value between 0 and 100 that indicates the progress of the activity.
    */
  var Progress: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Progress] = js.undefined
  /**
    * The start time of the activity.
    */
  var StartTime: TimestampType
  /**
    * The current status of the activity.
    */
  var StatusCode: ScalingActivityStatusCode
  /**
    * A friendly, more verbose description of the activity status.
    */
  var StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined
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
    val __obj = js.Dynamic.literal(ActivityId = ActivityId, AutoScalingGroupName = AutoScalingGroupName, Cause = Cause, StartTime = StartTime, StatusCode = StatusCode.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(Progress)) __obj.updateDynamic("Progress")(Progress)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[Activity]
  }
}

