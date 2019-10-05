package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationConfigurationsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupNames: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.AutoScalingGroupNames] = js.undefined
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object DescribeNotificationConfigurationsType {
  @scala.inline
  def apply(
    AutoScalingGroupNames: AutoScalingGroupNames = null,
    MaxRecords: Int | Double = null,
    NextToken: XmlString = null
  ): DescribeNotificationConfigurationsType = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupNames != null) __obj.updateDynamic("AutoScalingGroupNames")(AutoScalingGroupNames)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNotificationConfigurationsType]
  }
}

