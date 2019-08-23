package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAgentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.AgentArn] = js.undefined
  /**
    * The time that the agent was activated (that is, created in your account).
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not accessible over the public Internet. 
    */
  var EndpointType: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.EndpointType] = js.undefined
  /**
    * The time that the agent last connected to DataSyc.
    */
  var LastConnectionTime: js.UndefOr[Time] = js.undefined
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  var PrivateLinkConfig: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.PrivateLinkConfig] = js.undefined
  /**
    * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent returns to ONLINE status.
    */
  var Status: js.UndefOr[AgentStatus] = js.undefined
}

object DescribeAgentResponse {
  @scala.inline
  def apply(
    AgentArn: AgentArn = null,
    CreationTime: Time = null,
    EndpointType: EndpointType = null,
    LastConnectionTime: Time = null,
    Name: TagValue = null,
    PrivateLinkConfig: PrivateLinkConfig = null,
    Status: AgentStatus = null
  ): DescribeAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (AgentArn != null) __obj.updateDynamic("AgentArn")(AgentArn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (LastConnectionTime != null) __obj.updateDynamic("LastConnectionTime")(LastConnectionTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PrivateLinkConfig != null) __obj.updateDynamic("PrivateLinkConfig")(PrivateLinkConfig)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentResponse]
  }
}

