package typings.apolloDashServerDashCore.distRunHttpQueryMod

import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.debug
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatError
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
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
}

