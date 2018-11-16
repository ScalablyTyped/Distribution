package typings
package apolloDashServerDashCoreLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/ApolloServer", "ApolloServerBase")
@js.native
class ApolloServerBase protected () extends js.Object {
  def this(config: apolloDashServerDashCoreLib.distTypesMod.Config) = this()
  var context: js.UndefOr[js.Any] = js.native
  var engineReportingAgent: js.UndefOr[js.Any] = js.native
  var extensions: js.Any = js.native
  var graphqlPath: java.lang.String = js.native
  var playgroundOptions: js.UndefOr[
    atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.RenderPageOptions
  ] = js.native
  var requestOptions: stdLib.Partial[apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[_]] = js.native
  var schema: graphqlLib.graphqlMod.GraphQLSchema = js.native
  var subscriptionServer: js.UndefOr[js.Any] = js.native
  var subscriptionServerOptions: js.UndefOr[apolloDashServerDashCoreLib.distTypesMod.SubscriptionServerOptions] = js.native
  var subscriptionsPath: js.UndefOr[java.lang.String] = js.native
  var uploadsConfig: js.UndefOr[apolloDashServerDashCoreLib.distTypesMod.FileUploadOptions] = js.native
  /* protected */ def graphQLServerOptions(): stdLib.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
      (stdLib.Record[java.lang.String, _]) | (js.Function0[
        (stdLib.Record[java.lang.String, _]) | (stdLib.Promise[stdLib.Record[java.lang.String, _]])
      ])
    ]
  ] = js.native
  /* protected */ def graphQLServerOptions(integrationContextArgument: stdLib.Record[java.lang.String, _]): stdLib.Promise[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
      (stdLib.Record[java.lang.String, _]) | (js.Function0[
        (stdLib.Record[java.lang.String, _]) | (stdLib.Promise[stdLib.Record[java.lang.String, _]])
      ])
    ]
  ] = js.native
  def installSubscriptionHandlers(server: nodeLib.httpMod.Server): scala.Unit = js.native
  def setGraphQLPath(path: java.lang.String): scala.Unit = js.native
  def stop(): stdLib.Promise[scala.Unit] = js.native
  /* protected */ def supportsSubscriptions(): scala.Boolean = js.native
  /* protected */ def supportsUploads(): scala.Boolean = js.native
}

