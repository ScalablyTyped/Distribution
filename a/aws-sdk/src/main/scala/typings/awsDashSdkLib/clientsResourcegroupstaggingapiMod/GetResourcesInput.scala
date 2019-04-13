package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcesInput extends js.Object {
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The constraints on the resources that you want returned. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the AWS General Reference for the following:   For a list of service name strings, see AWS Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.  
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined
  /**
    * A limit that restricts the number of resources returned by GetResources in paginated output. You can set ResourcesPerPage to a minimum of 1 item and the maximum of 50 items. 
    */
  var ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined
  /**
    * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values. If you specify multiple filters connected by an AND operator in a single request, the response returns only those resources that are associated with every specified filter. If you specify multiple filters connected by an OR operator in a single request, the response returns all resources that are associated with at least one or possibly more of the specified filters.
    */
  var TagFilters: js.UndefOr[TagFilterList] = js.undefined
  /**
    * A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A resource with no tags is counted as having one tag (one key and value pair).  GetResources does not split a resource and its associated tags across pages. If the specified TagsPerPage would cause such a break, a PaginationToken is returned in place of the affected resource and its tags. Use that token in another request to get the remaining data. For example, if you specify a TagsPerPage of 100 and the account has 22 resources with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of 3 pages, with the first page displaying the first 10 resources, each with its 10 tags, the second page displaying the next 10 resources each with its 10 tags, and the third page displaying the remaining 2 resources, each with its 10 tags.  You can set TagsPerPage to a minimum of 100 items and the maximum of 500 items.
    */
  var TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined
}

object GetResourcesInput {
  @scala.inline
  def apply(
    PaginationToken: PaginationToken = null,
    ResourceTypeFilters: ResourceTypeFilterList = null,
    ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined,
    TagFilters: TagFilterList = null,
    TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined
  ): GetResourcesInput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (ResourceTypeFilters != null) __obj.updateDynamic("ResourceTypeFilters")(ResourceTypeFilters)
    if (!js.isUndefined(ResourcesPerPage)) __obj.updateDynamic("ResourcesPerPage")(ResourcesPerPage)
    if (TagFilters != null) __obj.updateDynamic("TagFilters")(TagFilters)
    if (!js.isUndefined(TagsPerPage)) __obj.updateDynamic("TagsPerPage")(TagsPerPage)
    __obj.asInstanceOf[GetResourcesInput]
  }
}

