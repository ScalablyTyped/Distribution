package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingRule extends js.Object {
  /**
    * The conditions that trigger an automatic scaling activity.
    */
  var Action: ScalingAction
  /**
    * A friendly, more verbose description of the automatic scaling rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
    */
  var Name: String
  /**
    * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
    */
  var Trigger: ScalingTrigger
}

object ScalingRule {
  @scala.inline
  def apply(Action: ScalingAction, Name: String, Trigger: ScalingTrigger, Description: String = null): ScalingRule = {
    val __obj = js.Dynamic.literal(Action = Action, Name = Name, Trigger = Trigger)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[ScalingRule]
  }
}

