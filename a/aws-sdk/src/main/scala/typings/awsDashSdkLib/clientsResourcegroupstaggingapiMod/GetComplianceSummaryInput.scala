package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceSummaryInput extends js.Object {
  /**
    * A list of attributes to group the counts of noncompliant resources by. If supplied, the counts are sorted by those attributes.
    */
  var GroupBy: js.UndefOr[GroupBy] = js.undefined
  /**
    * A limit that restricts the number of results that are returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsGetComplianceSummary] = js.undefined
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of Regions to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources in the specified Regions.
    */
  var RegionFilters: js.UndefOr[RegionFilterList] = js.undefined
  /**
    * The constraints on the resources that you want returned. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the AWS General Reference for the following:   For a list of service name strings, see AWS Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.   You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the length constraint requirement applies to each resource type filter. 
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined
  /**
    * A list of tag keys to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources that have the specified tag keys.
    */
  var TagKeyFilters: js.UndefOr[TagKeyFilterList] = js.undefined
  /**
    * The target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources in the specified target IDs.
    */
  var TargetIdFilters: js.UndefOr[TargetIdFilterList] = js.undefined
}

object GetComplianceSummaryInput {
  @scala.inline
  def apply(
    GroupBy: GroupBy = null,
    MaxResults: js.UndefOr[MaxResultsGetComplianceSummary] = js.undefined,
    PaginationToken: PaginationToken = null,
    RegionFilters: RegionFilterList = null,
    ResourceTypeFilters: ResourceTypeFilterList = null,
    TagKeyFilters: TagKeyFilterList = null,
    TargetIdFilters: TargetIdFilterList = null
  ): GetComplianceSummaryInput = {
    val __obj = js.Dynamic.literal()
    if (GroupBy != null) __obj.updateDynamic("GroupBy")(GroupBy)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (RegionFilters != null) __obj.updateDynamic("RegionFilters")(RegionFilters)
    if (ResourceTypeFilters != null) __obj.updateDynamic("ResourceTypeFilters")(ResourceTypeFilters)
    if (TagKeyFilters != null) __obj.updateDynamic("TagKeyFilters")(TagKeyFilters)
    if (TargetIdFilters != null) __obj.updateDynamic("TargetIdFilters")(TargetIdFilters)
    __obj.asInstanceOf[GetComplianceSummaryInput]
  }
}

