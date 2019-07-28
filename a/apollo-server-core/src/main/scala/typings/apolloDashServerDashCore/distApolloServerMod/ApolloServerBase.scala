package typings.apolloDashServerDashCore.distApolloServerMod

import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashCore.distTypesMod.Config
import typings.apolloDashServerDashCore.distTypesMod.FileUploadOptions
import typings.apolloDashServerDashCore.distTypesMod.SubscriptionServerOptions
import typings.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequest
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLResponse
import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.RenderPageOptions
import typings.graphql.graphqlMod.GraphQLSchema
import typings.node.httpMod.Server
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/ApolloServer", "ApolloServerBase")
@js.native
class ApolloServerBase protected () extends js.Object {
  def this(config: Config) = this()
  var config: js.Any = js.native
  var context: js.UndefOr[js.Any] = js.native
  var engineApiKeyHash: js.UndefOr[js.Any] = js.native
  var engineReportingAgent: js.UndefOr[js.Any] = js.native
  var engineServiceId: js.UndefOr[js.Any] = js.native
  var ensurePluginInstantiation: js.Any = js.native
  var generateSchemaDerivedData: js.Any = js.native
  var graphqlPath: String = js.native
  var initSchema: js.Any = js.native
  var initializeDocumentStore: js.Any = js.native
  var parseOptions: js.Any = js.native
  var playgroundOptions: js.UndefOr[RenderPageOptions] = js.native
  var plugins: js.Array[ApolloServerPlugin] = js.native
  var requestOptions: Partial[GraphQLServerOptions[_, _]] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var schemaDerivedData: js.Any = js.native
  var schemaIsFederated: js.Any = js.native
  var subscriptionServer: js.UndefOr[js.Any] = js.native
  var subscriptionServerOptions: js.UndefOr[SubscriptionServerOptions] = js.native
  var subscriptionsPath: js.UndefOr[String] = js.native
  var toDispose: js.Any = js.native
  var uploadsConfig: js.UndefOr[FileUploadOptions] = js.native
  def executeOperation(request: GraphQLRequest): js.Promise[GraphQLResponse] = js.native
  /* protected */ def graphQLServerOptions(): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  /* protected */ def graphQLServerOptions(integrationContextArgument: Record[String, _]): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def installSubscriptionHandlers(server: Server): Unit = js.native
  def setGraphQLPath(path: String): Unit = js.native
  def stop(): js.Promise[Unit] = js.native
  /* protected */ def supportsSubscriptions(): Boolean = js.native
  /* protected */ def supportsUploads(): Boolean = js.native
  /* protected */ def willStart(): js.Promise[Unit] = js.native
}

