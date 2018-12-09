package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/ApolloServer", "ApolloServer")
@js.native
class ApolloServer ()
  extends apolloDashServerDashCoreLib.apolloDashServerDashCoreMod.ApolloServerBase {
  def applyMiddleware(hasAppPathCorsBodyParserConfigDisableHealthCheckOnHealthCheck: ServerRegistration): scala.Unit = js.native
  def createGraphQLServerOptions(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): js.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
  ] = js.native
}

