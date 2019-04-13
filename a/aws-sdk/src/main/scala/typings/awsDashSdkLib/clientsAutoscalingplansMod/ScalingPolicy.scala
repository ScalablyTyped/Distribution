package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingPolicy extends js.Object {
  /**
    * The name of the scaling policy.
    */
  var PolicyName: awsDashSdkLib.clientsAutoscalingplansMod.PolicyName
  /**
    * The type of scaling policy.
    */
  var PolicyType: awsDashSdkLib.clientsAutoscalingplansMod.PolicyType
  /**
    * The target tracking scaling policy. Includes support for predefined or customized metrics.
    */
  var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
}

object ScalingPolicy {
  @scala.inline
  def apply(
    PolicyName: PolicyName,
    PolicyType: PolicyType,
    TargetTrackingConfiguration: TargetTrackingConfiguration = null
  ): ScalingPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, PolicyType = PolicyType.asInstanceOf[js.Any])
    if (TargetTrackingConfiguration != null) __obj.updateDynamic("TargetTrackingConfiguration")(TargetTrackingConfiguration)
    __obj.asInstanceOf[ScalingPolicy]
  }
}

