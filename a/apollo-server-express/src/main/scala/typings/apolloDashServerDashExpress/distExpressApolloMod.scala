package typings.apolloDashServerDashExpress

import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typings.express.expressMod.Handler
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/expressApollo", JSImport.Namespace)
@js.native
object distExpressApolloMod extends js.Object {
  def graphqlExpress(options: GraphQLServerOptions[Record[String, _], _]): Handler = js.native
  def graphqlExpress(options: ExpressGraphQLOptionsFunction): Handler = js.native
  type ExpressGraphQLOptionsFunction = js.Function2[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    ValueOrPromise[GraphQLServerOptions[Record[String, js.Any], js.Any]]
  ]
}

