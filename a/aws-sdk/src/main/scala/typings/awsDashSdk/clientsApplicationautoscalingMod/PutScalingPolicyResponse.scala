package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutScalingPolicyResponse extends js.Object {
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.Alarms] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resulting scaling policy.
    */
  var PolicyARN: ResourceIdMaxLen1600
}

object PutScalingPolicyResponse {
  @scala.inline
  def apply(PolicyARN: ResourceIdMaxLen1600, Alarms: Alarms = null): PutScalingPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyARN = PolicyARN)
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms)
    __obj.asInstanceOf[PutScalingPolicyResponse]
  }
}

