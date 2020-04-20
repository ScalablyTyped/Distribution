package typings.apolloServer

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCacheControl.mod.CacheControlExtensionOptions
import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import typings.apolloServer.apolloServerBooleans.`false`
import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typings.apolloServerCore.PartialSubscriptionServer
import typings.apolloServerCore.TypeofSchemaDirectiveVisi
import typings.apolloServerCore.graphqlOptionsMod.DataSources
import typings.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typings.apolloServerCore.playgroundMod.PlaygroundConfig
import typings.apolloServerCore.typesMod.Context
import typings.apolloServerCore.typesMod.ContextFunction
import typings.apolloServerCore.typesMod.FileUploadOptions
import typings.apolloServerCore.typesMod.GraphQLService
import typings.apolloServerCore.typesMod.PluginDefinition
import typings.apolloServerExpress.apolloServerMod.ExpressContext
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLExecutor
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.Logger
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typings.cors.mod.CorsOptions
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.ValidationContext
import typings.graphqlExtensions.mod.GraphQLExtension
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.graphqlTools.interfacesMod.IMocks
import typings.graphqlTools.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-express.apollo-server-express.ApolloServerExpressConfig & {  cors ? :apollo-server-express.apollo-server-express.CorsOptions | boolean, onHealthCheck ? (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>): std.Promise<any>} */
trait ApolloServerExpressConfig extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var cacheControl: js.UndefOr[CacheControlExtensionOptions | Boolean] = js.undefined
  var context: js.UndefOr[(ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]] = js.undefined
  var cors: js.UndefOr[CorsOptions | Boolean] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[Context[js.Object]]]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var engine: js.UndefOr[Boolean | EngineReportingOptions[Context[js.Object]]] = js.undefined
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.undefined
  var experimental_approximateDocumentStoreMiB: js.UndefOr[Double] = js.undefined
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.undefined
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, Context[js.Object], StringDictionary[_]]] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[Context[js.Object]], 
      GraphQLResponse
    ]
  ] = js.undefined
  var gateway: js.UndefOr[GraphQLService] = js.undefined
  var introspection: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var mockEntireSchema: js.UndefOr[Boolean] = js.undefined
  var mocks: js.UndefOr[Boolean | IMocks] = js.undefined
  var modules: js.UndefOr[js.Array[GraphQLSchemaModule]] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions | `false`] = js.undefined
  var playground: js.UndefOr[PlaygroundConfig] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
  var resolvers: js.UndefOr[(IResolvers[_, _]) | (js.Array[IResolvers[_, _]])] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var schemaDirectives: js.UndefOr[Record[String, TypeofSchemaDirectiveVisi]] = js.undefined
  var subscriptions: js.UndefOr[PartialSubscriptionServer | String | `false`] = js.undefined
  var tracing: js.UndefOr[Boolean] = js.undefined
  var typeDefs: js.UndefOr[DocumentNode | (js.Array[DocumentNode | String]) | String] = js.undefined
  var uploads: js.UndefOr[Boolean | FileUploadOptions] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.undefined
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(
    cache: KeyValueCache[String] = null,
    cacheControl: CacheControlExtensionOptions | Boolean = null,
    context: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object] = null,
    cors: CorsOptions | Boolean = null,
    dataSources: () => DataSources[Context[js.Object]] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    engine: Boolean | EngineReportingOptions[Context[js.Object]] = null,
    executor: /* requestContext */ GraphQLRequestContextExecutionDidStart[Record[String, _]] => ValueOrPromise[GraphQLExecutionResult] = null,
    experimental_approximateDocumentStoreMiB: Int | Double = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: (_, StringDictionary[_], Context[js.Object], /* info */ GraphQLResolveInfo) => js.Any = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[Context[js.Object]]) => GraphQLResponse = null,
    gateway: GraphQLService = null,
    introspection: js.UndefOr[Boolean] = js.undefined,
    logger: Logger = null,
    mockEntireSchema: js.UndefOr[Boolean] = js.undefined,
    mocks: Boolean | IMocks = null,
    modules: js.Array[GraphQLSchemaModule] = null,
    onHealthCheck: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_] = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions | `false` = null,
    playground: PlaygroundConfig = null,
    plugins: js.Array[PluginDefinition] = null,
    resolvers: (IResolvers[_, _]) | (js.Array[IResolvers[_, _]]) = null,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any = null,
    schema: GraphQLSchema = null,
    schemaDirectives: Record[String, TypeofSchemaDirectiveVisi] = null,
    subscriptions: PartialSubscriptionServer | String | `false` = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    typeDefs: DocumentNode | (js.Array[DocumentNode | String]) | String = null,
    uploads: Boolean | FileUploadOptions = null,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(js.Any.fromFunction0(dataSources))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1(executor))
    if (experimental_approximateDocumentStoreMiB != null) __obj.updateDynamic("experimental_approximateDocumentStoreMiB")(experimental_approximateDocumentStoreMiB.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2(formatResponse))
    if (gateway != null) __obj.updateDynamic("gateway")(gateway.asInstanceOf[js.Any])
    if (!js.isUndefined(introspection)) __obj.updateDynamic("introspection")(introspection.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(mockEntireSchema)) __obj.updateDynamic("mockEntireSchema")(mockEntireSchema.asInstanceOf[js.Any])
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1(onHealthCheck))
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (playground != null) __obj.updateDynamic("playground")(playground.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
}

