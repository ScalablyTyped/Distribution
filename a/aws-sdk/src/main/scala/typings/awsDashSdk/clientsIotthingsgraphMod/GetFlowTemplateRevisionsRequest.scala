package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFlowTemplateRevisionsRequest extends js.Object {
  /**
    * The ID of the workflow. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetFlowTemplateRevisionsRequest {
  @scala.inline
  def apply(id: Urn, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): GetFlowTemplateRevisionsRequest = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetFlowTemplateRevisionsRequest]
  }
}

