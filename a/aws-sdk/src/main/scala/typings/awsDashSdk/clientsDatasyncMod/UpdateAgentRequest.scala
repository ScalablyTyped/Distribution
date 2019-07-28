package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to update.
    */
  var AgentArn: typings.awsDashSdk.clientsDatasyncMod.AgentArn
  /**
    * The name that you want to use to configure the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
}

object UpdateAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn, Name: TagValue = null): UpdateAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateAgentRequest]
  }
}

