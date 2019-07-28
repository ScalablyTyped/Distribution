package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolversByFunctionRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The Function ID.
    */
  var functionId: String
  /**
    * The maximum number of results you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which you can use to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListResolversByFunctionRequest {
  @scala.inline
  def apply(
    apiId: String,
    functionId: String,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListResolversByFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, functionId = functionId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListResolversByFunctionRequest]
  }
}

