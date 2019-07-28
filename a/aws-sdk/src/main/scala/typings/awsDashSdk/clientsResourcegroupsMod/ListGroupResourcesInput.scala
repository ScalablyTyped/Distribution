package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupResourcesInput extends js.Object {
  /**
    * Filters, formatted as ResourceFilter objects, that you want to apply to a ListGroupResources operation.    resource-type - Filter resources by their type. Specify up to five resource types in the format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.  
    */
  var Filters: js.UndefOr[ResourceFilterList] = js.undefined
  /**
    * The name of the resource group.
    */
  var GroupName: typings.awsDashSdk.clientsResourcegroupsMod.GroupName
  /**
    * The maximum number of group member ARNs that are returned in a single call by ListGroupResources, in paginated output. By default, this number is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.MaxResults] = js.undefined
  /**
    * The NextToken value that is returned in a paginated ListGroupResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.undefined
}

object ListGroupResourcesInput {
  @scala.inline
  def apply(
    GroupName: GroupName,
    Filters: ResourceFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListGroupResourcesInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupResourcesInput]
  }
}

