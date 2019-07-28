package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverRuleAssociationsResponse extends js.Object {
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  /**
    * If more than MaxResults rule associations match the specified criteria, you can submit another ListResolverRuleAssociation request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  /**
    * The associations that were created between resolver rules and VPCs using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverRuleAssociations: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRuleAssociations] = js.undefined
}

object ListResolverRuleAssociationsResponse {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResolverRuleAssociations: ResolverRuleAssociations = null
  ): ListResolverRuleAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResolverRuleAssociations != null) __obj.updateDynamic("ResolverRuleAssociations")(ResolverRuleAssociations)
    __obj.asInstanceOf[ListResolverRuleAssociationsResponse]
  }
}

