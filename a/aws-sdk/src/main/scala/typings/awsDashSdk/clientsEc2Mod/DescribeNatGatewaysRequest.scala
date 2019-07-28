package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNatGatewaysRequest extends js.Object {
  /**
    * One or more filters.    nat-gateway-id - The ID of the NAT gateway.    state - The state of the NAT gateway (pending | failed | available | deleting | deleted).    subnet-id - The ID of the subnet in which the NAT gateway resides.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC in which the NAT gateway resides.  
    */
  var Filter: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeNatGatewaysMaxResults] = js.undefined
  /**
    * One or more NAT gateway IDs.
    */
  var NatGatewayIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeNatGatewaysRequest {
  @scala.inline
  def apply(
    Filter: FilterList = null,
    MaxResults: js.UndefOr[DescribeNatGatewaysMaxResults] = js.undefined,
    NatGatewayIds: ValueStringList = null,
    NextToken: String = null
  ): DescribeNatGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NatGatewayIds != null) __obj.updateDynamic("NatGatewayIds")(NatGatewayIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNatGatewaysRequest]
  }
}

