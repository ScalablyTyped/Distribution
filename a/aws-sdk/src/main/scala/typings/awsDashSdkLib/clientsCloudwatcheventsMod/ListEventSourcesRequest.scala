package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventSourcesRequest extends js.Object {
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken that you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * Specifying this limits the results to only those partner event sources with names that start with the specified prefix.
    */
  var NamePrefix: js.UndefOr[EventSourceNamePrefix] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListEventSourcesRequest {
  @scala.inline
  def apply(
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NamePrefix: EventSourceNamePrefix = null,
    NextToken: NextToken = null
  ): ListEventSourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NamePrefix != null) __obj.updateDynamic("NamePrefix")(NamePrefix)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEventSourcesRequest]
  }
}

