package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfilingGroupRequest extends js.Object {
  /**
    * Remote configuration to configure the agents of the profiling group.
    */
  var agentOrchestrationConfig: AgentOrchestrationConfig = js.native
  var profilingGroupName: ProfilingGroupName = js.native
}

object UpdateProfilingGroupRequest {
  @scala.inline
  def apply(agentOrchestrationConfig: AgentOrchestrationConfig, profilingGroupName: ProfilingGroupName): UpdateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(agentOrchestrationConfig = agentOrchestrationConfig.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateProfilingGroupRequest]
  }
}

