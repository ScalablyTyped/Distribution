package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTimeBasedAutoScalingResult extends js.Object {
  /**
    * An array of TimeBasedAutoScalingConfiguration objects that describe the configuration for the specified instances.
    */
  var TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations] = js.undefined
}

object DescribeTimeBasedAutoScalingResult {
  @scala.inline
  def apply(TimeBasedAutoScalingConfigurations: TimeBasedAutoScalingConfigurations = null): DescribeTimeBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    if (TimeBasedAutoScalingConfigurations != null) __obj.updateDynamic("TimeBasedAutoScalingConfigurations")(TimeBasedAutoScalingConfigurations)
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingResult]
  }
}

