package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingPolicy extends js.Object {
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: ScalingConstraints
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: ScalingRuleList
}

object AutoScalingPolicy {
  @scala.inline
  def apply(Constraints: ScalingConstraints, Rules: ScalingRuleList): AutoScalingPolicy = {
    val __obj = js.Dynamic.literal(Constraints = Constraints, Rules = Rules)
  
    __obj.asInstanceOf[AutoScalingPolicy]
  }
}

