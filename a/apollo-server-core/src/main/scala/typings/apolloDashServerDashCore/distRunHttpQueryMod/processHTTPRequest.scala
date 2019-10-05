package typings.apolloDashServerDashCore.distRunHttpQueryMod

import typings.apolloDashServerDashCore.Anon_Context
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.cache
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.plugins
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "processHTTPRequest")
@js.native
object processHTTPRequest extends js.Object {
  def apply[TContext](
    options: (WithRequired[GraphQLServerOptions[TContext, _], cache | plugins]) with Anon_Context[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
}

