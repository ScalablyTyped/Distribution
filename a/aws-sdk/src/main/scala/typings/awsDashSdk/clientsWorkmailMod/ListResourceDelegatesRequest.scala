package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceDelegatesRequest extends js.Object {
  /**
    * The number of maximum results in a page.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MaxResults] = js.undefined
  /**
    * The token used to paginate through the delegates associated with a resource.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * The identifier for the organization that contains the resource for which delegates are listed.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The identifier for the resource whose delegates are listed.
    */
  var ResourceId: WorkMailIdentifier
}

object ListResourceDelegatesRequest {
  @scala.inline
  def apply(
    OrganizationId: OrganizationId,
    ResourceId: WorkMailIdentifier,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListResourceDelegatesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, ResourceId = ResourceId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourceDelegatesRequest]
  }
}

