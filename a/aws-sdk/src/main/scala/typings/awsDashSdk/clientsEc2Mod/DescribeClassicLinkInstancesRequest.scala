package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClassicLinkInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    group-id - The ID of a VPC security group that's associated with the instance.    instance-id - The ID of the instance.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC to which the instance is linked.  vpc-id - The ID of the VPC that the instance is linked to.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
    */
  var InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. Constraint: If the value is greater than 1000, we return only 1000 items.
    */
  var MaxResults: js.UndefOr[DescribeClassicLinkInstancesMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeClassicLinkInstancesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    InstanceIds: InstanceIdStringList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeClassicLinkInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClassicLinkInstancesRequest]
  }
}

