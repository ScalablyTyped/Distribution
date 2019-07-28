package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolversRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The maximum number of results you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The type name.
    */
  var typeName: String
}

object ListResolversRequest {
  @scala.inline
  def apply(
    apiId: String,
    typeName: String,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListResolversRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, typeName = typeName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListResolversRequest]
  }
}

