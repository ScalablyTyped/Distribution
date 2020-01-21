package typings.apolloServerExpress

import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerExpress.expressApolloMod.ExpressGraphQLOptionsFunction
import typings.express.mod.Handler
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/connectApollo", JSImport.Namespace)
@js.native
object connectApolloMod extends js.Object {
  val graphqlConnect: js.Function1[
    /* options */ (GraphQLServerOptions[Record[String, js.Any], js.Any]) | ExpressGraphQLOptionsFunction, 
    Handler
  ] = js.native
}

