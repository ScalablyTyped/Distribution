package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDataCollectionByAgentIdsRequest extends js.Object {
  /**
    * The IDs of the agents or connectors from which to start collecting data. If you send a request to an agent/connector ID that you do not have permission to contact, according to your AWS account, the service does not throw an exception. Instead, it returns the error in the Description field. If you send a request to multiple agents/connectors and you do not have permission to contact some of those agents/connectors, the system does not throw an exception. Instead, the system shows Failed in the Description field.
    */
  var agentIds: AgentIds
}

object StartDataCollectionByAgentIdsRequest {
  @scala.inline
  def apply(agentIds: AgentIds): StartDataCollectionByAgentIdsRequest = {
    val __obj = js.Dynamic.literal(agentIds = agentIds)
  
    __obj.asInstanceOf[StartDataCollectionByAgentIdsRequest]
  }
}

