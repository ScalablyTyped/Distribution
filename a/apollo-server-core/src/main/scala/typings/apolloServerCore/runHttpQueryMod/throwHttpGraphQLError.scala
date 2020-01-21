package typings.apolloServerCore.runHttpQueryMod

import typings.apolloServerCore.apolloServerCoreStrings.debug
import typings.apolloServerCore.apolloServerCoreStrings.formatError
import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.std.Error
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "throwHttpGraphQLError")
@js.native
object throwHttpGraphQLError extends js.Object {
  def apply[E /* <: Error */](statusCode: Double, errors: js.Array[E]): scala.Nothing = js.native
  def apply[E /* <: Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: Pick[GraphQLServerOptions[Record[String, _], _], debug | formatError]
  ): scala.Nothing = js.native
  def apply[E /* <: Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: Pick[GraphQLServerOptions[Record[String, _], _], debug | formatError],
    extensions: Record[String, _]
  ): scala.Nothing = js.native
}

