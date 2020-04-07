package typings.awsSdk

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.DescribeVpcPeeringConnectionsMaxResults
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.ec2Mod.String
import typings.awsSdk.ec2Mod.VpcPeeringConnectionIdList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeVpcPeeringConnectionsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeVpcPeeringConnect extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    accepter-vpc-info.cidr-block - The IPv4 CIDR block of the accepter VPC.    accepter-vpc-info.owner-id - The AWS account ID of the owner of the accepter VPC.    accepter-vpc-info.vpc-id - The ID of the accepter VPC.    expiration-time - The expiration date and time for the VPC peering connection.    requester-vpc-info.cidr-block - The IPv4 CIDR block of the requester's VPC.    requester-vpc-info.owner-id - The AWS account ID of the owner of the requester VPC.    requester-vpc-info.vpc-id - The ID of the requester VPC.    status-code - The status of the VPC peering connection (pending-acceptance | failed | expired | provisioning | active | deleting | deleted | rejected).    status-message - A message that provides more information about the status of the VPC peering connection, if applicable.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-peering-connection-id - The ID of the VPC peering connection.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcPeeringConnectionsMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * One or more VPC peering connection IDs. Default: Describes all your VPC peering connections.
    */
  var VpcPeeringConnectionIds: js.UndefOr[VpcPeeringConnectionIdList] = js.native
}

object DescribeVpcPeeringConnect {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    VpcPeeringConnectionIds: VpcPeeringConnectionIdList = null
  ): DescribeVpcPeeringConnect = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VpcPeeringConnectionIds != null) __obj.updateDynamic("VpcPeeringConnectionIds")(VpcPeeringConnectionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcPeeringConnect]
  }
}

