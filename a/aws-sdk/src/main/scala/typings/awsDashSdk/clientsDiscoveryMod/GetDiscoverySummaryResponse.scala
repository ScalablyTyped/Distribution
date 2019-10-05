package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDiscoverySummaryResponse extends js.Object {
  /**
    * Details about discovered agents, including agent status and health.
    */
  var agentSummary: js.UndefOr[CustomerAgentInfo] = js.undefined
  /**
    * The number of applications discovered.
    */
  var applications: js.UndefOr[Long] = js.undefined
  /**
    * Details about discovered connectors, including connector status and health.
    */
  var connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.undefined
  /**
    * The number of servers discovered.
    */
  var servers: js.UndefOr[Long] = js.undefined
  /**
    * The number of servers mapped to applications.
    */
  var serversMappedToApplications: js.UndefOr[Long] = js.undefined
  /**
    * The number of servers mapped to tags.
    */
  var serversMappedtoTags: js.UndefOr[Long] = js.undefined
}

object GetDiscoverySummaryResponse {
  @scala.inline
  def apply(
    agentSummary: CustomerAgentInfo = null,
    applications: Int | Double = null,
    connectorSummary: CustomerConnectorInfo = null,
    servers: Int | Double = null,
    serversMappedToApplications: Int | Double = null,
    serversMappedtoTags: Int | Double = null
  ): GetDiscoverySummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (agentSummary != null) __obj.updateDynamic("agentSummary")(agentSummary)
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (connectorSummary != null) __obj.updateDynamic("connectorSummary")(connectorSummary)
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (serversMappedToApplications != null) __obj.updateDynamic("serversMappedToApplications")(serversMappedToApplications.asInstanceOf[js.Any])
    if (serversMappedtoTags != null) __obj.updateDynamic("serversMappedtoTags")(serversMappedtoTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiscoverySummaryResponse]
  }
}

