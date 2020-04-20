package typings.apolloServerExpress

import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/expressApollo", JSImport.Namespace)
@js.native
object expressApolloMod extends js.Object {
  def graphqlExpress(options: GraphQLServerOptions[Record[String, _], _]): Handler = js.native
  def graphqlExpress(options: ExpressGraphQLOptionsFunction): Handler = js.native
  type ExpressGraphQLOptionsFunction = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    ValueOrPromise[GraphQLServerOptions[Record[String, js.Any], js.Any]]
  ]
}

