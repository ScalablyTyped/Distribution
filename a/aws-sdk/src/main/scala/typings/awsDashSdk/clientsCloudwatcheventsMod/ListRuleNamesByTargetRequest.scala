package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRuleNamesByTargetRequest extends js.Object {
  /**
    * Limits the results to show only the rules associated with the specified event bus.
    */
  var EventBusName: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.EventBusName] = js.undefined
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target resource.
    */
  var TargetArn: typings.awsDashSdk.clientsCloudwatcheventsMod.TargetArn
}

object ListRuleNamesByTargetRequest {
  @scala.inline
  def apply(
    TargetArn: TargetArn,
    EventBusName: EventBusName = null,
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NextToken: NextToken = null
  ): ListRuleNamesByTargetRequest = {
    val __obj = js.Dynamic.literal(TargetArn = TargetArn)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListRuleNamesByTargetRequest]
  }
}

