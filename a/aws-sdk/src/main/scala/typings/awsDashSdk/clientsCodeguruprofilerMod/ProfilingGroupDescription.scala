package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingGroupDescription extends js.Object {
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  var arn: js.UndefOr[ProfilingGroupArn] = js.native
  /**
    * The timestamp of when the profiling group was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  var name: js.UndefOr[ProfilingGroupName] = js.native
  var profilingStatus: js.UndefOr[ProfilingStatus] = js.native
  /**
    * The timestamp of when the profiling group was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}

object ProfilingGroupDescription {
  @scala.inline
  def apply(
    agentOrchestrationConfig: AgentOrchestrationConfig = null,
    arn: ProfilingGroupArn = null,
    createdAt: Timestamp = null,
    name: ProfilingGroupName = null,
    profilingStatus: ProfilingStatus = null,
    updatedAt: Timestamp = null
  ): ProfilingGroupDescription = {
    val __obj = js.Dynamic.literal()
    if (agentOrchestrationConfig != null) __obj.updateDynamic("agentOrchestrationConfig")(agentOrchestrationConfig.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profilingStatus != null) __obj.updateDynamic("profilingStatus")(profilingStatus.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingGroupDescription]
  }
}

