package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogPatternsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName = js.native
}

object ListLogPatternsRequest {
  @scala.inline
  def apply(
    ResourceGroupName: ResourceGroupName,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    PatternSetName: LogPatternSetName = null
  ): ListLogPatternsRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PatternSetName != null) __obj.updateDynamic("PatternSetName")(PatternSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogPatternsRequest]
  }
}

