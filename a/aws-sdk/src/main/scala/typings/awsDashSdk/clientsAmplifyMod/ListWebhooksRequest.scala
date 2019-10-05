package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebhooksRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    *  Pagination token. Set to null to start listing webhooks from start. If non-null pagination token is returned in a result, then pass its value in here to list more webhooks. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListWebhooksRequest {
  @scala.inline
  def apply(appId: AppId, maxResults: Int | Double = null, nextToken: NextToken = null): ListWebhooksRequest = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListWebhooksRequest]
  }
}

