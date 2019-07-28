package typings.apolloDashServerDashExpress.distApolloServerMod

import typings.apolloDashServerDashCore.apolloDashServerDashCoreMod.ApolloServerBase
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/ApolloServer", "ApolloServer")
@js.native
class ApolloServer protected () extends ApolloServerBase {
  def this(config: ApolloServerExpressConfig) = this()
  def applyMiddleware(hasAppPathCorsBodyParserConfigDisableHealthCheckOnHealthCheck: ServerRegistration): Unit = js.native
  def createGraphQLServerOptions(req: Request, res: Response): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
}

