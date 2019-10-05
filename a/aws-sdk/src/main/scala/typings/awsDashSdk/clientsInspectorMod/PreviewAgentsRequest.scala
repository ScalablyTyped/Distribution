package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewAgentsRequest extends js.Object {
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[PreviewAgentsMaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the PreviewAgents action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ARN of the assessment target whose agents you want to preview.
    */
  var previewAgentsArn: Arn
}

object PreviewAgentsRequest {
  @scala.inline
  def apply(previewAgentsArn: Arn, maxResults: Int | Double = null, nextToken: PaginationToken = null): PreviewAgentsRequest = {
    val __obj = js.Dynamic.literal(previewAgentsArn = previewAgentsArn)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[PreviewAgentsRequest]
  }
}

