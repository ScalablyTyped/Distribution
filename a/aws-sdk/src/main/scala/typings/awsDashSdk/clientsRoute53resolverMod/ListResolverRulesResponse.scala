package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverRulesResponse extends js.Object {
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.native
  /**
    * If more than MaxResults resolver rules match the specified criteria, you can submit another ListResolverRules request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.native
  /**
    * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
    */
  var ResolverRules: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRules] = js.native
}

object ListResolverRulesResponse {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null, ResolverRules: ResolverRules = null): ListResolverRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResolverRules != null) __obj.updateDynamic("ResolverRules")(ResolverRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResolverRulesResponse]
  }
}

