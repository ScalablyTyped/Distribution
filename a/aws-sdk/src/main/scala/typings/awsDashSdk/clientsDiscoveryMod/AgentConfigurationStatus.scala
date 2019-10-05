package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentConfigurationStatus extends js.Object {
  /**
    * The agent/connector ID.
    */
  var agentId: js.UndefOr[String] = js.undefined
  /**
    * A description of the operation performed.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Information about the status of the StartDataCollection and StopDataCollection operations. The system has recorded the data collection operation. The agent/connector receives this command the next time it polls for a new command. 
    */
  var operationSucceeded: js.UndefOr[Boolean] = js.undefined
}

object AgentConfigurationStatus {
  @scala.inline
  def apply(
    agentId: String = null,
    description: String = null,
    operationSucceeded: js.UndefOr[scala.Boolean] = js.undefined
  ): AgentConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    if (agentId != null) __obj.updateDynamic("agentId")(agentId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(operationSucceeded)) __obj.updateDynamic("operationSucceeded")(operationSucceeded)
    __obj.asInstanceOf[AgentConfigurationStatus]
  }
}

