package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.EventBusName] = js.undefined
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object EnableRuleRequest {
  @scala.inline
  def apply(Name: RuleName, EventBusName: EventBusName = null): EnableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    __obj.asInstanceOf[EnableRuleRequest]
  }
}

