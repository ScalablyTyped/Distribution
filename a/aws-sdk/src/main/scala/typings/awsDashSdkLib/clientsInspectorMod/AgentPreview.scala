package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPreview extends js.Object {
  /**
    * The health status of the Amazon Inspector Agent.
    */
  var agentHealth: js.UndefOr[AgentHealth] = js.undefined
  /**
    * The ID of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId
  /**
    * The version of the Amazon Inspector Agent.
    */
  var agentVersion: js.UndefOr[AgentVersion] = js.undefined
  /**
    * The Auto Scaling group for the EC2 instance where the agent is installed.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
  /**
    * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var hostname: js.UndefOr[Hostname] = js.undefined
  /**
    * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var ipv4Address: js.UndefOr[Ipv4Address] = js.undefined
  /**
    * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var kernelVersion: js.UndefOr[KernelVersion] = js.undefined
  /**
    * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}

object AgentPreview {
  @scala.inline
  def apply(
    agentId: AgentId,
    agentHealth: AgentHealth = null,
    agentVersion: AgentVersion = null,
    autoScalingGroup: AutoScalingGroup = null,
    hostname: Hostname = null,
    ipv4Address: Ipv4Address = null,
    kernelVersion: KernelVersion = null,
    operatingSystem: OperatingSystem = null
  ): AgentPreview = {
    val __obj = js.Dynamic.literal(agentId = agentId)
    if (agentHealth != null) __obj.updateDynamic("agentHealth")(agentHealth.asInstanceOf[js.Any])
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion)
    if (autoScalingGroup != null) __obj.updateDynamic("autoScalingGroup")(autoScalingGroup)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (ipv4Address != null) __obj.updateDynamic("ipv4Address")(ipv4Address)
    if (kernelVersion != null) __obj.updateDynamic("kernelVersion")(kernelVersion)
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem)
    __obj.asInstanceOf[AgentPreview]
  }
}

