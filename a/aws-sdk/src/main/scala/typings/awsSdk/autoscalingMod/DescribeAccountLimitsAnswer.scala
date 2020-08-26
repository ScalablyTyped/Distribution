package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsAnswer extends js.Object {
  /**
    * The maximum number of groups allowed for your AWS account. The default is 200 groups per AWS Region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.autoscalingMod.MaxNumberOfAutoScalingGroups] = js.native
  /**
    * The maximum number of launch configurations allowed for your AWS account. The default is 200 launch configurations per AWS Region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.autoscalingMod.MaxNumberOfLaunchConfigurations] = js.native
  /**
    * The current number of groups for your AWS account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.autoscalingMod.NumberOfAutoScalingGroups] = js.native
  /**
    * The current number of launch configurations for your AWS account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.autoscalingMod.NumberOfLaunchConfigurations] = js.native
}

object DescribeAccountLimitsAnswer {
  @scala.inline
  def apply(): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
  @scala.inline
  implicit class DescribeAccountLimitsAnswerOps[Self <: DescribeAccountLimitsAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxNumberOfAutoScalingGroups(value: MaxNumberOfAutoScalingGroups): Self = this.set("MaxNumberOfAutoScalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNumberOfAutoScalingGroups: Self = this.set("MaxNumberOfAutoScalingGroups", js.undefined)
    @scala.inline
    def setMaxNumberOfLaunchConfigurations(value: MaxNumberOfLaunchConfigurations): Self = this.set("MaxNumberOfLaunchConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNumberOfLaunchConfigurations: Self = this.set("MaxNumberOfLaunchConfigurations", js.undefined)
    @scala.inline
    def setNumberOfAutoScalingGroups(value: NumberOfAutoScalingGroups): Self = this.set("NumberOfAutoScalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfAutoScalingGroups: Self = this.set("NumberOfAutoScalingGroups", js.undefined)
    @scala.inline
    def setNumberOfLaunchConfigurations(value: NumberOfLaunchConfigurations): Self = this.set("NumberOfLaunchConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLaunchConfigurations: Self = this.set("NumberOfLaunchConfigurations", js.undefined)
  }
  
}

