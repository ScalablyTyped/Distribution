package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTerminationPolicyTypesAnswer extends js.Object {
  /**
    * The termination policies supported by Amazon EC2 Auto Scaling: OldestInstance, OldestLaunchConfiguration, NewestInstance, ClosestToNextInstanceHour, Default, OldestLaunchTemplate, and AllocationStrategy.
    */
  var TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined
}

object DescribeTerminationPolicyTypesAnswer {
  @scala.inline
  def apply(TerminationPolicyTypes: TerminationPolicies = null): DescribeTerminationPolicyTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (TerminationPolicyTypes != null) __obj.updateDynamic("TerminationPolicyTypes")(TerminationPolicyTypes)
    __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
  }
}

