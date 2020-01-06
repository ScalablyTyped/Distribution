package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogPatternSetsResponse extends js.Object {
  /**
    * The list of log pattern sets.
    */
  var LogPatternSets: js.UndefOr[LogPatternSetList] = js.native
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.native
}

object ListLogPatternSetsResponse {
  @scala.inline
  def apply(
    LogPatternSets: LogPatternSetList = null,
    NextToken: PaginationToken = null,
    ResourceGroupName: ResourceGroupName = null
  ): ListLogPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (LogPatternSets != null) __obj.updateDynamic("LogPatternSets")(LogPatternSets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogPatternSetsResponse]
  }
}

