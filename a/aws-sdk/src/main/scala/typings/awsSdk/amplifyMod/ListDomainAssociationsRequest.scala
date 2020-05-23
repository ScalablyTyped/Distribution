package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainAssociationsRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a result, then pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDomainAssociationsRequest {
  @scala.inline
  def apply(appId: AppId, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): ListDomainAssociationsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsRequest]
  }
}

