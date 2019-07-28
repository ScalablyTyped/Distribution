package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.EventBusName] = js.undefined
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object DisableRuleRequest {
  @scala.inline
  def apply(Name: RuleName, EventBusName: EventBusName = null): DisableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    __obj.asInstanceOf[DisableRuleRequest]
  }
}

