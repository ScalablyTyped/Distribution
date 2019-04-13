package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentInfo extends js.Object {
  /**
    * The agent or connector ID.
    */
  var agentId: js.UndefOr[AgentId] = js.undefined
  /**
    * Network details about the host where the agent or connector resides.
    */
  var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.undefined
  /**
    * Type of agent.
    */
  var agentType: js.UndefOr[String] = js.undefined
  /**
    * Status of the collection process for an agent or connector.
    */
  var collectionStatus: js.UndefOr[String] = js.undefined
  /**
    * The ID of the connector.
    */
  var connectorId: js.UndefOr[String] = js.undefined
  /**
    * The health of the agent or connector.
    */
  var health: js.UndefOr[AgentStatus] = js.undefined
  /**
    * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
    */
  var hostName: js.UndefOr[String] = js.undefined
  /**
    * Time since agent or connector health was reported.
    */
  var lastHealthPingTime: js.UndefOr[String] = js.undefined
  /**
    * Agent's first registration timestamp in UTC.
    */
  var registeredTime: js.UndefOr[String] = js.undefined
  /**
    * The agent or connector version.
    */
  var version: js.UndefOr[String] = js.undefined
}

object AgentInfo {
  @scala.inline
  def apply(
    agentId: AgentId = null,
    agentNetworkInfoList: AgentNetworkInfoList = null,
    agentType: String = null,
    collectionStatus: String = null,
    connectorId: String = null,
    health: AgentStatus = null,
    hostName: String = null,
    lastHealthPingTime: String = null,
    registeredTime: String = null,
    version: String = null
  ): AgentInfo = {
    val __obj = js.Dynamic.literal()
    if (agentId != null) __obj.updateDynamic("agentId")(agentId)
    if (agentNetworkInfoList != null) __obj.updateDynamic("agentNetworkInfoList")(agentNetworkInfoList)
    if (agentType != null) __obj.updateDynamic("agentType")(agentType)
    if (collectionStatus != null) __obj.updateDynamic("collectionStatus")(collectionStatus)
    if (connectorId != null) __obj.updateDynamic("connectorId")(connectorId)
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (hostName != null) __obj.updateDynamic("hostName")(hostName)
    if (lastHealthPingTime != null) __obj.updateDynamic("lastHealthPingTime")(lastHealthPingTime)
    if (registeredTime != null) __obj.updateDynamic("registeredTime")(registeredTime)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[AgentInfo]
  }
}

