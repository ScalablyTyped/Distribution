package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesRequest extends js.Object {
  /**
    * The maximum amount of data that can be contained in a single set of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ID of the project.
    */
  var projectId: ProjectId
}

object ListResourcesRequest {
  @scala.inline
  def apply(projectId: ProjectId, maxResults: Int | Double = null, nextToken: PaginationToken = null): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListResourcesRequest]
  }
}

