package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.AgentArn] = js.undefined
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  /**
    * The status of the agent.
    */
  var Status: js.UndefOr[AgentStatus] = js.undefined
}

object AgentListEntry {
  @scala.inline
  def apply(AgentArn: AgentArn = null, Name: TagValue = null, Status: AgentStatus = null): AgentListEntry = {
    val __obj = js.Dynamic.literal()
    if (AgentArn != null) __obj.updateDynamic("AgentArn")(AgentArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentListEntry]
  }
}

