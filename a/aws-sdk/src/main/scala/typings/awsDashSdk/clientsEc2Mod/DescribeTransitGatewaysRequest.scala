package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewaysRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. The possible values are:    options.propagation-default-route-table-id - The ID of the default propagation route table.    options.amazon-side-asn - The private ASN for the Amazon side of a BGP session.    options.association-default-route-table-id - The ID of the default association route table.    options.auto-accept-shared-attachments - Indicates whether there is automatic acceptance of attachment requests (enable | disable).    options.default-route-table-association - Indicates whether resource attachments are automatically associated with the default association route table (enable | disable).    options.default-route-table-propagation - Indicates whether resource attachments automatically propagate routes to the default propagation route table (enable | disable).    options.dns-support - Indicates whether DNS support is enabled (enable | disable).    options.vpn-ecmp-support - Indicates whether Equal Cost Multipath Protocol support is enabled (enable | disable).    owner-id - The ID of the AWS account that owns the transit gateway.    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-id - The ID of the transit gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the transit gateways.
    */
  var TransitGatewayIds: js.UndefOr[TransitGatewayIdStringList] = js.native
}

object DescribeTransitGatewaysRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null,
    TransitGatewayIds: TransitGatewayIdStringList = null
  ): DescribeTransitGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayIds != null) __obj.updateDynamic("TransitGatewayIds")(TransitGatewayIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewaysRequest]
  }
}

