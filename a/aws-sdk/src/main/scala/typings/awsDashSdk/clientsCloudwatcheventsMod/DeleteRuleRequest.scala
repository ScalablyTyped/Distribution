package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.EventBusName] = js.undefined
  /**
    * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to delete the rule. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object DeleteRuleRequest {
  @scala.inline
  def apply(Name: RuleName, EventBusName: EventBusName = null, Force: js.UndefOr[Boolean] = js.undefined): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    __obj.asInstanceOf[DeleteRuleRequest]
  }
}

