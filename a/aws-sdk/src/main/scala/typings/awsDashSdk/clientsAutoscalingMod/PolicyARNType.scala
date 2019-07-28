package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyARNType extends js.Object {
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Alarms] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.undefined
}

object PolicyARNType {
  @scala.inline
  def apply(Alarms: Alarms = null, PolicyARN: ResourceName = null): PolicyARNType = {
    val __obj = js.Dynamic.literal()
    if (Alarms != null) __obj.updateDynamic("Alarms")(Alarms)
    if (PolicyARN != null) __obj.updateDynamic("PolicyARN")(PolicyARN)
    __obj.asInstanceOf[PolicyARNType]
  }
}

