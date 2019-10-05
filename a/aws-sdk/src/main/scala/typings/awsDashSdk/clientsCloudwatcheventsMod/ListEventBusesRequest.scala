package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventBusesRequest extends js.Object {
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken that you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * Specifying this limits the results to only those event buses with names that start with the specified prefix.
    */
  var NamePrefix: js.UndefOr[EventBusName] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}

object ListEventBusesRequest {
  @scala.inline
  def apply(Limit: Int | Double = null, NamePrefix: EventBusName = null, NextToken: NextToken = null): ListEventBusesRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NamePrefix != null) __obj.updateDynamic("NamePrefix")(NamePrefix)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEventBusesRequest]
  }
}

