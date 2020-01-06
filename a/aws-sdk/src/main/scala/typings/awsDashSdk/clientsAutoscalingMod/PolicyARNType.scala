package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyARNType extends js.Object {
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Alarms] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
}

object PolicyARNType {
  @scala.inline
  def apply(Alarms: Alarms = null, PolicyARN: ResourceName = null): PolicyARNType = {
    val __obj = js.Dynamic.literal()
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms.asInstanceOf[js.Any])
    if (PolicyARN != null) __obj.updateDynamic("PolicyARN")(PolicyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyARNType]
  }
}

