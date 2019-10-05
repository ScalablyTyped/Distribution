package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsInput extends js.Object {
  /**
    * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.    resource-type - Filter groups by resource type. Specify up to five resource types in the format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.  
    */
  var Filters: js.UndefOr[GroupFilterList] = js.undefined
  /**
    * The maximum number of resource group results that are returned by ListGroups in paginated output. By default, this number is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.MaxResults] = js.undefined
  /**
    * The NextToken value that is returned in a paginated ListGroups request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.undefined
}

object ListGroupsInput {
  @scala.inline
  def apply(Filters: GroupFilterList = null, MaxResults: Int | Double = null, NextToken: NextToken = null): ListGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsInput]
  }
}

