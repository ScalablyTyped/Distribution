package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupResourcesInput extends js.Object {
  /**
    * Filters, formatted as ResourceFilter objects, that you want to apply to a ListGroupResources operation.    resource-type - Filter resources by their type. Specify up to five resource types in the format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.  
    */
  var Filters: js.UndefOr[ResourceFilterList] = js.native
  /**
    * The name of the resource group.
    */
  var GroupName: typings.awsDashSdk.clientsResourcegroupsMod.GroupName = js.native
  /**
    * The maximum number of group member ARNs that are returned in a single call by ListGroupResources, in paginated output. By default, this number is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.MaxResults] = js.native
  /**
    * The NextToken value that is returned in a paginated ListGroupResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.native
}

object ListGroupResourcesInput {
  @scala.inline
  def apply(
    GroupName: GroupName,
    Filters: ResourceFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListGroupResourcesInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupResourcesInput]
  }
}

