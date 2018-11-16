package typings
package apolloDashServerLib.apolloDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "ApolloServer")
@js.native
class ApolloServer protected ()
  extends apolloDashServerDashExpressLib.apolloDashServerDashExpressMod.ApolloServer {
  def this(config: apolloDashServerDashCoreLib.distTypesMod.Config with apolloDashServerLib.Anon_Cors) = this()
  var cors: js.UndefOr[js.Any] = js.native
  var createServerInfo: js.Any = js.native
  var httpServer: js.UndefOr[js.Any] = js.native
  def applyMiddleware(): scala.Unit = js.native
  def listen(opts: js.Any*): stdLib.Promise[ServerInfo] = js.native
}

