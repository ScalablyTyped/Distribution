package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartnerEventSourceAccountsRequest extends js.Object {
  /**
    * The name of the partner event source to display account information about.
    */
  var EventSourceName: awsDashSdkLib.clientsEventbridgeMod.EventSourceName
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken that you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListPartnerEventSourceAccountsRequest {
  @scala.inline
  def apply(
    EventSourceName: EventSourceName,
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NextToken: NextToken = null
  ): ListPartnerEventSourceAccountsRequest = {
    val __obj = js.Dynamic.literal(EventSourceName = EventSourceName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPartnerEventSourceAccountsRequest]
  }
}

