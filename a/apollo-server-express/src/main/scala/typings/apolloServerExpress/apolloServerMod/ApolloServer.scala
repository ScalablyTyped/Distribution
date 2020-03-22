package typings.apolloServerExpress.apolloServerMod

import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerCore.mod.ApolloServerBase
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/ApolloServer", "ApolloServer")
@js.native
class ApolloServer protected () extends ApolloServerBase {
  def this(config: ApolloServerExpressConfig) = this()
  def applyMiddleware(hasAppRest: ServerRegistration): Unit = js.native
  def createGraphQLServerOptions(req: Request_[ParamsDictionary], res: Response_[_]): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def getMiddleware(): Router = js.native
  def getMiddleware(hasPathCorsBodyParserConfigDisableHealthCheckOnHealthCheck: GetMiddlewareOptions): Router = js.native
}

