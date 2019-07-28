package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypesRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
  /**
    * The maximum number of results you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListTypesRequest {
  @scala.inline
  def apply(
    apiId: String,
    format: TypeDefinitionFormat,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListTypesRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTypesRequest]
  }
}

