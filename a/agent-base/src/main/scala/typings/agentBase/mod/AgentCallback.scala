package typings.agentBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentCallback extends js.Object {
  def apply(req: ClientRequest, opts: RequestOptions): AgentCallbackReturn | js.Promise[AgentCallbackReturn] = js.native
  def apply(req: ClientRequest, opts: RequestOptions, fn: AgentCallbackCallback): Unit = js.native
}

