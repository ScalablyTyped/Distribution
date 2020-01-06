package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to update.
    */
  var AgentArn: typings.awsDashSdk.clientsDatasyncMod.AgentArn = js.native
  /**
    * The name that you want to use to configure the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
}

object UpdateAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn, Name: TagValue = null): UpdateAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentRequest]
  }
}

