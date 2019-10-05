package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartnerEventSourcesRequest extends js.Object {
  /**
    * pecifying this limits the number of results returned by this operation. The operation also returns a NextToken that you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * If you specify this, the results are limited to only those partner event sources that start with the string you specify.
    */
  var NamePrefix: PartnerEventSourceNamePrefix
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}

object ListPartnerEventSourcesRequest {
  @scala.inline
  def apply(NamePrefix: PartnerEventSourceNamePrefix, Limit: Int | Double = null, NextToken: NextToken = null): ListPartnerEventSourcesRequest = {
    val __obj = js.Dynamic.literal(NamePrefix = NamePrefix)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPartnerEventSourcesRequest]
  }
}

