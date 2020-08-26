package typings.agentBase

import typings.agentBase.mod.ClientRequest
import typings.agentBase.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  /* Inlined std.Pick<agent-base.agent-base.Agent, 'addRequest'> */
  @js.native
  trait PickAgentaddRequest extends js.Object {
    @JSName("addRequest")
    var addRequest_Original: js.Function2[/* req */ ClientRequest, /* _opts */ RequestOptions, Unit] = js.native
    def addRequest(req: ClientRequest, _opts: RequestOptions): Unit = js.native
  }
  
}

