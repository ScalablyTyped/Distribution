package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBillingGroupsRequest extends js.Object {
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * Limit the results to billing groups whose names have the given prefix.
    */
  var namePrefixFilter: js.UndefOr[BillingGroupName] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBillingGroupsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    namePrefixFilter: BillingGroupName = null,
    nextToken: NextToken = null
  ): ListBillingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (namePrefixFilter != null) __obj.updateDynamic("namePrefixFilter")(namePrefixFilter)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBillingGroupsRequest]
  }
}

