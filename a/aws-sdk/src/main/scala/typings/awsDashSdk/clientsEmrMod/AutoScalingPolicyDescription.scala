package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyDescription extends js.Object {
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: js.UndefOr[ScalingConstraints] = js.native
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: js.UndefOr[ScalingRuleList] = js.native
  /**
    * The status of an automatic scaling policy. 
    */
  var Status: js.UndefOr[AutoScalingPolicyStatus] = js.native
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(
    Constraints: ScalingConstraints = null,
    Rules: ScalingRuleList = null,
    Status: AutoScalingPolicyStatus = null
  ): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (Constraints != null) __obj.updateDynamic("Constraints")(Constraints.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
}

