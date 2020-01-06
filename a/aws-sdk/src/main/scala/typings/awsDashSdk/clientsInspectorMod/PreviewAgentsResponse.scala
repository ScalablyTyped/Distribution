package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewAgentsResponse extends js.Object {
  /**
    * The resulting list of agents.
    */
  var agentPreviews: AgentPreviewList = js.native
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object PreviewAgentsResponse {
  @scala.inline
  def apply(agentPreviews: AgentPreviewList, nextToken: PaginationToken = null): PreviewAgentsResponse = {
    val __obj = js.Dynamic.literal(agentPreviews = agentPreviews.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewAgentsResponse]
  }
}

