package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogPatternsResponse extends js.Object {
  /**
    * The list of log patterns.
    */
  var LogPatterns: js.UndefOr[LogPatternList] = js.native
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object ListLogPatternsResponse {
  @scala.inline
  def apply(
    LogPatterns: LogPatternList = null,
    NextToken: PaginationToken = null,
    ResourceGroupName: ResourceGroupName = null
  ): ListLogPatternsResponse = {
    val __obj = js.Dynamic.literal()
    if (LogPatterns != null) __obj.updateDynamic("LogPatterns")(LogPatterns.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogPatternsResponse]
  }
}

