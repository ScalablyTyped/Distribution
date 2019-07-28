package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientVpnTargetNetworksRequest extends js.Object {
  /**
    * The IDs of the target network associations.
    */
  var AssociationIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters. Filter names and values are case-sensitive.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeClientVpnTargetNetworksMaxResults] = js.undefined
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.undefined
}

object DescribeClientVpnTargetNetworksRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String,
    AssociationIds: ValueStringList = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeClientVpnTargetNetworksMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeClientVpnTargetNetworksRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId)
    if (AssociationIds != null) __obj.updateDynamic("AssociationIds")(AssociationIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClientVpnTargetNetworksRequest]
  }
}

