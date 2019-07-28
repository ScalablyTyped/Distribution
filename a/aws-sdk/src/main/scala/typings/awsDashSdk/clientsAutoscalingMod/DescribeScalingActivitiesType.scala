package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingActivitiesType extends js.Object {
  /**
    * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all activities for the past six weeks are described. If unknown activities are requested, they are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
    */
  var ActivityIds: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.ActivityIds] = js.undefined
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The maximum number of items to return with this call. The default value is 100 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object DescribeScalingActivitiesType {
  @scala.inline
  def apply(
    ActivityIds: ActivityIds = null,
    AutoScalingGroupName: ResourceName = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: XmlString = null
  ): DescribeScalingActivitiesType = {
    val __obj = js.Dynamic.literal()
    if (ActivityIds != null) __obj.updateDynamic("ActivityIds")(ActivityIds)
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeScalingActivitiesType]
  }
}

