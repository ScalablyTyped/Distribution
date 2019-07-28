package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverRulesRequest extends js.Object {
  /**
    * An optional specification to return a subset of resolver rules, such as all resolver rules that are associated with the same resolver endpoint.  If you submit a second or subsequent ListResolverRules request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Filters] = js.undefined
  /**
    * The maximum number of resolver rules that you want to return in the response to a ListResolverRules request. If you don't specify a value for MaxResults, Resolver returns up to 100 resolver rules.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  /**
    * For the first ListResolverRules request, omit this value. If you have more than MaxResults resolver rules, you can submit another ListResolverRules request to get the next group of resolver rules. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}

object ListResolverRulesRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListResolverRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResolverRulesRequest]
  }
}

