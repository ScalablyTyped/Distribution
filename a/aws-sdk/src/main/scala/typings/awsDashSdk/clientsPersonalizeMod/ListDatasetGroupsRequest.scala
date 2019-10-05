package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetGroupsRequest extends js.Object {
  /**
    * The maximum number of dataset groups to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListDatasetGroups for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDatasetGroupsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null): ListDatasetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDatasetGroupsRequest]
  }
}

