package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchemasRequest extends js.Object {
  /**
    * The maximum number of schemas to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListSchemas for getting the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListSchemasRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): ListSchemasRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSchemasRequest]
  }
}

