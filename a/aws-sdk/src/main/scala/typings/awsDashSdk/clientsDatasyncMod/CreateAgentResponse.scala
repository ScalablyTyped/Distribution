package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAgentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent. Use the ListAgents operation to return a list of agents for your account and AWS Region.
    */
  var AgentArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.AgentArn] = js.native
}

object CreateAgentResponse {
  @scala.inline
  def apply(AgentArn: AgentArn = null): CreateAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (AgentArn != null) __obj.updateDynamic("AgentArn")(AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentResponse]
  }
}

