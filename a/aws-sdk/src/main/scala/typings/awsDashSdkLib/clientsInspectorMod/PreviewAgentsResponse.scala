package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewAgentsResponse extends js.Object {
  /**
    * The resulting list of agents.
    */
  var agentPreviews: AgentPreviewList
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object PreviewAgentsResponse {
  @scala.inline
  def apply(agentPreviews: AgentPreviewList, nextToken: PaginationToken = null): PreviewAgentsResponse = {
    val __obj = js.Dynamic.literal(agentPreviews = agentPreviews)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[PreviewAgentsResponse]
  }
}

