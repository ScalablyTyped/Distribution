package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingRule extends js.Object {
  /**
    * The conditions that trigger an automatic scaling activity.
    */
  var Action: ScalingAction = js.native
  /**
    * A friendly, more verbose description of the automatic scaling rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
    */
  var Name: String = js.native
  /**
    * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
    */
  var Trigger: ScalingTrigger = js.native
}

object ScalingRule {
  @scala.inline
  def apply(Action: ScalingAction, Name: String, Trigger: ScalingTrigger, Description: String = null): ScalingRule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingRule]
  }
}

