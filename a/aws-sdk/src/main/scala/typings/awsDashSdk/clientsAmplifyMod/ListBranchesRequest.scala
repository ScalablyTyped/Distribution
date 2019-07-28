package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBranchesRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    *  Pagination token. Set to null to start listing branches from start. If a non-null pagination token is returned in a result, then pass its value in here to list more branches. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBranchesRequest {
  @scala.inline
  def apply(appId: AppId, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): ListBranchesRequest = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBranchesRequest]
  }
}

