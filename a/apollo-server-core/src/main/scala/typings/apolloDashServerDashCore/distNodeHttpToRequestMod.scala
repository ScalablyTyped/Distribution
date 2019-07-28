package typings.apolloDashServerDashCore

import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/nodeHttpToRequest", JSImport.Namespace)
@js.native
object distNodeHttpToRequestMod extends js.Object {
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
}

