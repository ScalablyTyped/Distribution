package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsByRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.EventBusName] = js.undefined
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.NextToken] = js.undefined
  /**
    * The name of the rule.
    */
  var Rule: RuleName
}

object ListTargetsByRuleRequest {
  @scala.inline
  def apply(
    Rule: RuleName,
    EventBusName: EventBusName = null,
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NextToken: NextToken = null
  ): ListTargetsByRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTargetsByRuleRequest]
  }
}

