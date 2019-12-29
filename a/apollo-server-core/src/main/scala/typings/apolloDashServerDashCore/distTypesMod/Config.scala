package typings.apolloDashServerDashCore.distTypesMod

import typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheControlExtensionOptions
import typings.apolloDashEngineDashReporting.distAgentMod.EngineReportingOptions
import typings.apolloDashServerDashCore.TypeofClassSchemaDirectiveVisitor
import typings.apolloDashServerDashCore.apolloDashServerDashCoreBooleans.`false`
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.PersistedQueryOptions
import typings.apolloDashServerDashCore.distPlaygroundMod.PlaygroundConfig
import typings.atApollographqlApolloDashTools.libBuildServiceDefinitionMod.GraphQLSchemaModule
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.graphqlDashTools.distInterfacesMod.IMocks
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'formatError' | 'debug' | 'rootValue' | 'validationRules' | 'executor' | 'formatResponse' | 'fieldResolver' | 'tracing' | 'dataSources' | 'cache' ]: apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<apollo-server-core.apollo-server-core/dist/types.Context<object>, any>[P]} */ trait Config extends js.Object {
  var cacheControl: js.UndefOr[CacheControlExtensionOptions | Boolean] = js.undefined
  var context: js.UndefOr[Context[js.Object] | (ContextFunction[_, js.Object])] = js.undefined
  var engine: js.UndefOr[Boolean | EngineReportingOptions[Context[js.Object]]] = js.undefined
  var extensions: js.UndefOr[
    js.Array[
      js.Function0[typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ]
  ] = js.undefined
  var gateway: js.UndefOr[GraphQLService] = js.undefined
  var introspection: js.UndefOr[Boolean] = js.undefined
  var mockEntireSchema: js.UndefOr[Boolean] = js.undefined
  var mocks: js.UndefOr[Boolean | IMocks] = js.undefined
  var modules: js.UndefOr[js.Array[GraphQLSchemaModule]] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions | `false`] = js.undefined
  var playground: js.UndefOr[PlaygroundConfig] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
  var resolvers: js.UndefOr[(IResolvers[_, _]) | (js.Array[IResolvers[_, _]])] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var schemaDirectives: js.UndefOr[Record[String, TypeofClassSchemaDirectiveVisitor]] = js.undefined
  var subscriptions: js.UndefOr[Partial[SubscriptionServerOptions] | String | `false`] = js.undefined
  var typeDefs: js.UndefOr[DocumentNode | (js.Array[DocumentNode | String]) | String] = js.undefined
  var uploads: js.UndefOr[Boolean | FileUploadOptions] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    cacheControl: CacheControlExtensionOptions | Boolean = null,
    context: Context[js.Object] | (ContextFunction[_, js.Object]) = null,
    engine: Boolean | EngineReportingOptions[Context[js.Object]] = null,
    extensions: js.Array[
      js.Function0[typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ] = null,
    gateway: GraphQLService = null,
    introspection: js.UndefOr[Boolean] = js.undefined,
    mockEntireSchema: js.UndefOr[Boolean] = js.undefined,
    mocks: Boolean | IMocks = null,
    modules: js.Array[GraphQLSchemaModule] = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions | `false` = null,
    playground: PlaygroundConfig = null,
    plugins: js.Array[PluginDefinition] = null,
    resolvers: (IResolvers[_, _]) | (js.Array[IResolvers[_, _]]) = null,
    schema: GraphQLSchema = null,
    schemaDirectives: Record[String, TypeofClassSchemaDirectiveVisitor] = null,
    subscriptions: Partial[SubscriptionServerOptions] | String | `false` = null,
    typeDefs: DocumentNode | (js.Array[DocumentNode | String]) | String = null,
    uploads: Boolean | FileUploadOptions = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (gateway != null) __obj.updateDynamic("gateway")(gateway.asInstanceOf[js.Any])
    if (!js.isUndefined(introspection)) __obj.updateDynamic("introspection")(introspection.asInstanceOf[js.Any])
    if (!js.isUndefined(mockEntireSchema)) __obj.updateDynamic("mockEntireSchema")(mockEntireSchema.asInstanceOf[js.Any])
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (playground != null) __obj.updateDynamic("playground")(playground.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

