package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.EventBusName] = js.undefined
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object DescribeRuleRequest {
  @scala.inline
  def apply(Name: RuleName, EventBusName: EventBusName = null): DescribeRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    __obj.asInstanceOf[DescribeRuleRequest]
  }
}

