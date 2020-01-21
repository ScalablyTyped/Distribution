package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTerminationPolicyTypesAnswer extends js.Object {
  /**
    * The termination policies supported by Amazon EC2 Auto Scaling: OldestInstance, OldestLaunchConfiguration, NewestInstance, ClosestToNextInstanceHour, Default, OldestLaunchTemplate, and AllocationStrategy.
    */
  var TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.native
}

object DescribeTerminationPolicyTypesAnswer {
  @scala.inline
  def apply(TerminationPolicyTypes: TerminationPolicies = null): DescribeTerminationPolicyTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (TerminationPolicyTypes != null) __obj.updateDynamic("TerminationPolicyTypes")(TerminationPolicyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
  }
}

