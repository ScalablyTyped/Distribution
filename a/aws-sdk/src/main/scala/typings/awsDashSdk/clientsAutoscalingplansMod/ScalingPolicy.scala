package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPolicy extends js.Object {
  /**
    * The name of the scaling policy.
    */
  var PolicyName: typings.awsDashSdk.clientsAutoscalingplansMod.PolicyName = js.native
  /**
    * The type of scaling policy.
    */
  var PolicyType: typings.awsDashSdk.clientsAutoscalingplansMod.PolicyType = js.native
  /**
    * The target tracking scaling policy. Includes support for predefined or customized metrics.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.TargetTrackingConfiguration] = js.native
}

object ScalingPolicy {
  @scala.inline
  def apply(
    PolicyName: PolicyName,
    PolicyType: PolicyType,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): ScalingPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any])
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
}

