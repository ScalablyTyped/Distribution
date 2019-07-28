package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerAgentInfo extends js.Object {
  /**
    * Number of active discovery agents.
    */
  var activeAgents: Integer
  /**
    * Number of blacklisted discovery agents.
    */
  var blackListedAgents: Integer
  /**
    * Number of healthy discovery agents
    */
  var healthyAgents: Integer
  /**
    * Number of discovery agents with status SHUTDOWN.
    */
  var shutdownAgents: Integer
  /**
    * Total number of discovery agents.
    */
  var totalAgents: Integer
  /**
    * Number of unhealthy discovery agents.
    */
  var unhealthyAgents: Integer
  /**
    * Number of unknown discovery agents.
    */
  var unknownAgents: Integer
}

object CustomerAgentInfo {
  @scala.inline
  def apply(
    activeAgents: Integer,
    blackListedAgents: Integer,
    healthyAgents: Integer,
    shutdownAgents: Integer,
    totalAgents: Integer,
    unhealthyAgents: Integer,
    unknownAgents: Integer
  ): CustomerAgentInfo = {
    val __obj = js.Dynamic.literal(activeAgents = activeAgents, blackListedAgents = blackListedAgents, healthyAgents = healthyAgents, shutdownAgents = shutdownAgents, totalAgents = totalAgents, unhealthyAgents = unhealthyAgents, unknownAgents = unknownAgents)
  
    __obj.asInstanceOf[CustomerAgentInfo]
  }
}

