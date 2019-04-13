package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAgentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[AgentArn] = js.undefined
  /**
    * The time that the agent was activated (that is, created in your account).
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The time that the agent was last connected.
    */
  var LastConnectionTime: js.UndefOr[Time] = js.undefined
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
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
    LastConnectionTime: Time = null,
    Name: TagValue = null,
    Status: AgentStatus = null
  ): DescribeAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (AgentArn != null) __obj.updateDynamic("AgentArn")(AgentArn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LastConnectionTime != null) __obj.updateDynamic("LastConnectionTime")(LastConnectionTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentResponse]
  }
}

