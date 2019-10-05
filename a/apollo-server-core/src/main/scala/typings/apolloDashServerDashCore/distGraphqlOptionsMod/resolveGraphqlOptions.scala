package typings.apolloDashServerDashCore.distGraphqlOptionsMod

import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/graphqlOptions", "resolveGraphqlOptions")
@js.native
object resolveGraphqlOptions extends js.Object {
  def apply(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def apply(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
}

