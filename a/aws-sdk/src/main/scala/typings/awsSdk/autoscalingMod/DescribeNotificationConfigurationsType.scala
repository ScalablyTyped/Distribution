package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationConfigurationsType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupNames: js.UndefOr[typings.awsSdk.autoscalingMod.AutoScalingGroupNames] = js.native
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object DescribeNotificationConfigurationsType {
  @scala.inline
  def apply(
    AutoScalingGroupNames: AutoScalingGroupNames = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: XmlString = null
  ): DescribeNotificationConfigurationsType = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupNames != null) __obj.updateDynamic("AutoScalingGroupNames")(AutoScalingGroupNames.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationConfigurationsType]
  }
}

