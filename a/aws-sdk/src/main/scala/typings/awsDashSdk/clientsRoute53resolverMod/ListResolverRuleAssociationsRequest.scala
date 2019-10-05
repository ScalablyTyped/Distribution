package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverRuleAssociationsRequest extends js.Object {
  /**
    * An optional specification to return a subset of resolver rules, such as resolver rules that are associated with the same VPC ID.  If you submit a second or subsequent ListResolverRuleAssociations request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Filters] = js.undefined
  /**
    * The maximum number of rule associations that you want to return in the response to a ListResolverRuleAssociations request. If you don't specify a value for MaxResults, Resolver returns up to 100 rule associations. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  /**
    * For the first ListResolverRuleAssociation request, omit this value. If you have more than MaxResults rule associations, you can submit another ListResolverRuleAssociation request to get the next group of rule associations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}

object ListResolverRuleAssociationsRequest {
  @scala.inline
  def apply(Filters: Filters = null, MaxResults: Int | Double = null, NextToken: NextToken = null): ListResolverRuleAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResolverRuleAssociationsRequest]
  }
}

