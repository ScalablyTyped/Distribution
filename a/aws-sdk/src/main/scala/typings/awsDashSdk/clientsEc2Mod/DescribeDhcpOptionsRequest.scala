package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDhcpOptionsRequest extends js.Object {
  /**
    * The IDs of one or more DHCP options sets. Default: Describes all your DHCP options sets.
    */
  var DhcpOptionsIds: js.UndefOr[DhcpOptionsIdStringList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    dhcp-options-id - The ID of a DHCP options set.    key - The key for one of the options (for example, domain-name).    value - The value for one of the options.    owner-id - The ID of the AWS account that owns the DHCP options set.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeDhcpOptionsMaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeDhcpOptionsRequest {
  @scala.inline
  def apply(
    DhcpOptionsIds: DhcpOptionsIdStringList = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeDhcpOptionsMaxResults] = js.undefined,
    NextToken: String = null
  ): DescribeDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (DhcpOptionsIds != null) __obj.updateDynamic("DhcpOptionsIds")(DhcpOptionsIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeDhcpOptionsRequest]
  }
}

