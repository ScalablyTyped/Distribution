package typings.apolloServerCore

import typings.apolloServerCore.anon.PartialGraphQLServerOptio
import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerCore.typesMod.Config
import typings.apolloServerCore.typesMod.FileUploadOptions
import typings.apolloServerCore.typesMod.SubscriptionServerOptions
import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.apolloServerTypes.mod.BaseContext
import typings.apolloServerTypes.mod.GraphQLRequest
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import typings.graphql.mod.GraphQLSchema
import typings.node.httpMod.Server
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/ApolloServer", JSImport.Namespace)
@js.native
object apolloServerMod extends js.Object {
  @js.native
  class ApolloServerBase protected () extends js.Object {
    def this(config: Config) = this()
    var config: js.Any = js.native
    var context: js.UndefOr[js.Any] = js.native
    var engineApiKeyHash: js.UndefOr[js.Any] = js.native
    var engineReportingAgent: js.UndefOr[js.Any] = js.native
    var engineServiceId: js.UndefOr[js.Any] = js.native
    var ensurePluginInstantiation: js.Any = js.native
    var experimental_approximateDocumentStoreMiB: js.Any = js.native
    var generateSchemaDerivedData: js.Any = js.native
    var graphqlPath: String = js.native
    var initSchema: js.Any = js.native
    var initializeDocumentStore: js.Any = js.native
    var logger: js.Any = js.native
    var parseOptions: js.Any = js.native
    var playgroundOptions: js.UndefOr[RenderPageOptions] = js.native
    var plugins: js.Array[ApolloServerPlugin[BaseContext]] = js.native
    var requestOptions: PartialGraphQLServerOptio = js.native
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
    def installSubscriptionHandlers(server: typings.ws.mod.Server): Unit = js.native
    def setGraphQLPath(path: String): Unit = js.native
    def stop(): js.Promise[Unit] = js.native
    /* protected */ def supportsSubscriptions(): Boolean = js.native
    /* protected */ def supportsUploads(): Boolean = js.native
    /* protected */ def willStart(): js.Promise[Unit] = js.native
  }
  
}

