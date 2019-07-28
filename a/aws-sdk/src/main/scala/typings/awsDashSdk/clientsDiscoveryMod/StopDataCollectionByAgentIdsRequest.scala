package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDataCollectionByAgentIdsRequest extends js.Object {
  /**
    * The IDs of the agents or connectors from which to stop collecting data.
    */
  var agentIds: AgentIds
}

object StopDataCollectionByAgentIdsRequest {
  @scala.inline
  def apply(agentIds: AgentIds): StopDataCollectionByAgentIdsRequest = {
    val __obj = js.Dynamic.literal(agentIds = agentIds)
  
    __obj.asInstanceOf[StopDataCollectionByAgentIdsRequest]
  }
}

