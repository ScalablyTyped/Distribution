package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfilingGroupRequest extends js.Object {
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  var clientToken: ClientToken = js.native
  var profilingGroupName: ProfilingGroupName = js.native
}

object CreateProfilingGroupRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    profilingGroupName: ProfilingGroupName,
    agentOrchestrationConfig: AgentOrchestrationConfig = null
  ): CreateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (agentOrchestrationConfig != null) __obj.updateDynamic("agentOrchestrationConfig")(agentOrchestrationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupRequest]
  }
}

