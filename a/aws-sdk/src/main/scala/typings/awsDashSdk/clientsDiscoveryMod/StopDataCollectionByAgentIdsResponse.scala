package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDataCollectionByAgentIdsResponse extends js.Object {
  /**
    * Information about the agents or connector that were instructed to stop collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
}

object StopDataCollectionByAgentIdsResponse {
  @scala.inline
  def apply(agentsConfigurationStatus: AgentConfigurationStatusList = null): StopDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (agentsConfigurationStatus != null) __obj.updateDynamic("agentsConfigurationStatus")(agentsConfigurationStatus)
    __obj.asInstanceOf[StopDataCollectionByAgentIdsResponse]
  }
}

