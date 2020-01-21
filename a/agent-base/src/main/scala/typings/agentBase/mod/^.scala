package typings.agentBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agent-base", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Base `http.Agent` implementation.
    * No pooling/keep-alive is implemented by default.
    */
  def apply(): Agent = js.native
  def apply(callback: AgentCallback): Agent = js.native
  def apply(callback: AgentCallback, opts: AgentOptions): Agent = js.native
  def apply(opts: AgentOptions): Agent = js.native
}

