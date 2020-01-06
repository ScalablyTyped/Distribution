package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeBasedAutoScalingResult extends js.Object {
  /**
    * An array of TimeBasedAutoScalingConfiguration objects that describe the configuration for the specified instances.
    */
  var TimeBasedAutoScalingConfigurations: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.TimeBasedAutoScalingConfigurations] = js.native
}

object DescribeTimeBasedAutoScalingResult {
  @scala.inline
  def apply(TimeBasedAutoScalingConfigurations: TimeBasedAutoScalingConfigurations = null): DescribeTimeBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    if (TimeBasedAutoScalingConfigurations != null) __obj.updateDynamic("TimeBasedAutoScalingConfigurations")(TimeBasedAutoScalingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingResult]
  }
}

