package typings.apolloDashServerDashCore.distRunHttpQueryMod

import typings.apolloDashServerDashCore.Anon_Context
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.cache
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.debug
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatError
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.plugins
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.WithRequired
import typings.std.Error
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def processHTTPRequest[TContext](
    options: (WithRequired[GraphQLServerOptions[TContext, _], cache | plugins]) with Anon_Context[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def throwHttpGraphQLError[E /* <: Error */](statusCode: Double, errors: js.Array[E]): scala.Nothing = js.native
  def throwHttpGraphQLError[E /* <: Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: Pick[GraphQLServerOptions[Record[String, _], _], debug | formatError]
  ): scala.Nothing = js.native
}

