package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackResourceDriftsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[BoxedMaxResults] = js.undefined
  /**
    * A string that identifies the next page of stack resource drift results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * The name of the stack for which you want drift information.
    */
  var StackName: StackNameOrId
  /**
    * The resource drift status values to use as filters for the resource drift results returned.    DELETED: The resource differs from its expected template configuration in that the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected template values.    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatusFilters: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackResourceDriftStatusFilters] = js.undefined
}

object DescribeStackResourceDriftsInput {
  @scala.inline
  def apply(
    StackName: StackNameOrId,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    StackResourceDriftStatusFilters: StackResourceDriftStatusFilters = null
  ): DescribeStackResourceDriftsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackResourceDriftStatusFilters != null) __obj.updateDynamic("StackResourceDriftStatusFilters")(StackResourceDriftStatusFilters)
    __obj.asInstanceOf[DescribeStackResourceDriftsInput]
  }
}

