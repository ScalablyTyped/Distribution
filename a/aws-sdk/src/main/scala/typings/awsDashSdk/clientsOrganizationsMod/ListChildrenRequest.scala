package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChildrenRequest extends js.Object {
  /**
    * Filters the output to include only the specified child type.
    */
  var ChildType: typings.awsDashSdk.clientsOrganizationsMod.ChildType
  /**
    * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.MaxResults] = js.undefined
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.NextToken] = js.undefined
  /**
    * The unique identifier (ID) for the parent root or OU whose children you want to list. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var ParentId: typings.awsDashSdk.clientsOrganizationsMod.ParentId
}

object ListChildrenRequest {
  @scala.inline
  def apply(
    ChildType: ChildType,
    ParentId: ParentId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListChildrenRequest = {
    val __obj = js.Dynamic.literal(ChildType = ChildType.asInstanceOf[js.Any], ParentId = ParentId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListChildrenRequest]
  }
}

