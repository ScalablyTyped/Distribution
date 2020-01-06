package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOrchestrationConfig extends js.Object {
  /**
    * If the agents should be enabled to create and report profiles.
    */
  var profilingEnabled: Boolean = js.native
}

object AgentOrchestrationConfig {
  @scala.inline
  def apply(profilingEnabled: Boolean): AgentOrchestrationConfig = {
    val __obj = js.Dynamic.literal(profilingEnabled = profilingEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentOrchestrationConfig]
  }
}

