package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcEndpointsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    service-name: The name of the service.    vpc-id: The ID of the VPC in which the endpoint resides.    vpc-endpoint-id: The ID of the endpoint.    vpc-endpoint-state - The state of the endpoint (pendingAcceptance | pending | available | deleting | deleted | rejected | failed).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of items to return for this request. The request returns a token that you can specify in a subsequent call to get the next set of results. Constraint: If the value is greater than 1000, we return only 1000 items.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a prior call.)
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * One or more endpoint IDs.
    */
  var VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined
}

object DescribeVpcEndpointsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    VpcEndpointIds: ValueStringList = null
  ): DescribeVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VpcEndpointIds != null) __obj.updateDynamic("VpcEndpointIds")(VpcEndpointIds)
    __obj.asInstanceOf[DescribeVpcEndpointsRequest]
  }
}

