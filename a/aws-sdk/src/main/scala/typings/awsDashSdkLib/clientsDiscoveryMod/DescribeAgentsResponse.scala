package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAgentsResponse extends js.Object {
  /**
    * Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did not specify an agent/Connector ID. The output includes agent/Connector IDs, IP addresses, media access control (MAC) addresses, agent/Connector health, host name where the agent/Connector resides, and the version number of each agent/Connector.
    */
  var agentsInfo: js.UndefOr[AgentsInfo] = js.undefined
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for DescribeAgentsRequest$agentIds but set DescribeAgentsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAgentsResponse {
  @scala.inline
  def apply(agentsInfo: AgentsInfo = null, nextToken: NextToken = null): DescribeAgentsResponse = {
    val __obj = js.Dynamic.literal()
    if (agentsInfo != null) __obj.updateDynamic("agentsInfo")(agentsInfo)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeAgentsResponse]
  }
}

