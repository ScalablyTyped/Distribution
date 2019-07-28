package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFlowTemplatesRequest extends js.Object {
  /**
    * An array of objects that limit the result set. The only valid filter is DEVICE_MODEL_ID.
    */
  var filters: js.UndefOr[FlowTemplateFilters] = js.undefined
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object SearchFlowTemplatesRequest {
  @scala.inline
  def apply(
    filters: FlowTemplateFilters = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): SearchFlowTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[SearchFlowTemplatesRequest]
  }
}

