package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MaxResults] = js.undefined
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * The identifier for the organization under which the resources exist.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object ListResourcesRequest {
  @scala.inline
  def apply(
    OrganizationId: OrganizationId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourcesRequest]
  }
}

