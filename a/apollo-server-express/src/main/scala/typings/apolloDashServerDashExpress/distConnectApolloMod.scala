package typings.apolloDashServerDashExpress

import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashExpress.distExpressApolloMod.ExpressGraphQLOptionsFunction
import typings.express.expressMod.Handler
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/connectApollo", JSImport.Namespace)
@js.native
object distConnectApolloMod extends js.Object {
  val graphqlConnect: js.Function1[
    /* options */ (GraphQLServerOptions[Record[String, js.Any], js.Any]) | ExpressGraphQLOptionsFunction, 
    Handler
  ] = js.native
}

