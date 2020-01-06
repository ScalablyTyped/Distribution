package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsAnswer extends js.Object {
  /**
    * The maximum number of groups allowed for your AWS account. The default limit is 200 per AWS Region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxNumberOfAutoScalingGroups] = js.native
  /**
    * The maximum number of launch configurations allowed for your AWS account. The default limit is 200 per AWS Region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxNumberOfLaunchConfigurations] = js.native
  /**
    * The current number of groups for your AWS account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.NumberOfAutoScalingGroups] = js.native
  /**
    * The current number of launch configurations for your AWS account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.NumberOfLaunchConfigurations] = js.native
}

object DescribeAccountLimitsAnswer {
  @scala.inline
  def apply(
    MaxNumberOfAutoScalingGroups: Int | Double = null,
    MaxNumberOfLaunchConfigurations: Int | Double = null,
    NumberOfAutoScalingGroups: Int | Double = null,
    NumberOfLaunchConfigurations: Int | Double = null
  ): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    if (MaxNumberOfAutoScalingGroups != null) __obj.updateDynamic("MaxNumberOfAutoScalingGroups")(MaxNumberOfAutoScalingGroups.asInstanceOf[js.Any])
    if (MaxNumberOfLaunchConfigurations != null) __obj.updateDynamic("MaxNumberOfLaunchConfigurations")(MaxNumberOfLaunchConfigurations.asInstanceOf[js.Any])
    if (NumberOfAutoScalingGroups != null) __obj.updateDynamic("NumberOfAutoScalingGroups")(NumberOfAutoScalingGroups.asInstanceOf[js.Any])
    if (NumberOfLaunchConfigurations != null) __obj.updateDynamic("NumberOfLaunchConfigurations")(NumberOfLaunchConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
}

