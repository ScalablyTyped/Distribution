package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRulesRequest extends js.Object {
  /**
    * Limits the results to show only the rules associated with the specified event bus.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.EventBusName] = js.undefined
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The prefix matching the rule name.
    */
  var NamePrefix: js.UndefOr[RuleName] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}

object ListRulesRequest {
  @scala.inline
  def apply(
    EventBusName: EventBusName = null,
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NamePrefix: RuleName = null,
    NextToken: NextToken = null
  ): ListRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NamePrefix != null) __obj.updateDynamic("NamePrefix")(NamePrefix)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListRulesRequest]
  }
}

