package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingPolicyDescription extends js.Object {
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: js.UndefOr[ScalingConstraints] = js.undefined
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: js.UndefOr[ScalingRuleList] = js.undefined
  /**
    * The status of an automatic scaling policy. 
    */
  var Status: js.UndefOr[AutoScalingPolicyStatus] = js.undefined
}

object AutoScalingPolicyDescription {
  @scala.inline
  def apply(
    Constraints: ScalingConstraints = null,
    Rules: ScalingRuleList = null,
    Status: AutoScalingPolicyStatus = null
  ): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (Constraints != null) __obj.updateDynamic("Constraints")(Constraints)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
}

