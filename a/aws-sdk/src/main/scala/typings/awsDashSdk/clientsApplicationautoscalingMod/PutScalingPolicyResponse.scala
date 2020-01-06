package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyResponse extends js.Object {
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.Alarms] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resulting scaling policy.
    */
  var PolicyARN: ResourceIdMaxLen1600 = js.native
}

object PutScalingPolicyResponse {
  @scala.inline
  def apply(PolicyARN: ResourceIdMaxLen1600, Alarms: Alarms = null): PutScalingPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyARN = PolicyARN.asInstanceOf[js.Any])
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyResponse]
  }
}

