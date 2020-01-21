package typings.apolloServerCore.runHttpQueryMod

import typings.apolloServerCore.AnonContext
import typings.apolloServerCore.apolloServerCoreStrings.cache
import typings.apolloServerCore.apolloServerCoreStrings.plugins
import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerTypes.mod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "processHTTPRequest")
@js.native
object processHTTPRequest extends js.Object {
  def apply[TContext](
    options: (WithRequired[GraphQLServerOptions[TContext, _], cache | plugins]) with AnonContext[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
}

