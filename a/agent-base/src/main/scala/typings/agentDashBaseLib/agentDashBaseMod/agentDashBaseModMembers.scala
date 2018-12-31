package typings
package agentDashBaseLib.agentDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agent-base", JSImport.Namespace)
@js.native
object agentDashBaseModMembers extends js.Object {
  /**
    * Base `http.Agent` implementation.
    * No pooling/keep-alive is implemented by default.
    */
  def apply(): agentDashBaseLib.agentDashBaseMod.AgentNs.Agent = js.native
  def apply(callback: agentDashBaseLib.agentDashBaseMod.AgentNs.AgentCallback): agentDashBaseLib.agentDashBaseMod.AgentNs.Agent = js.native
  def apply(
    callback: agentDashBaseLib.agentDashBaseMod.AgentNs.AgentCallback,
    opts: agentDashBaseLib.agentDashBaseMod.AgentNs.AgentOptions
  ): agentDashBaseLib.agentDashBaseMod.AgentNs.Agent = js.native
  def apply(opts: agentDashBaseLib.agentDashBaseMod.AgentNs.AgentOptions): agentDashBaseLib.agentDashBaseMod.AgentNs.Agent = js.native
}

