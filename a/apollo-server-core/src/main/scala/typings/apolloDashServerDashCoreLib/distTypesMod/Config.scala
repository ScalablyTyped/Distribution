package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'formatError' | 'debug' | 'rootValue' | 'validationRules' | 'formatResponse' | 'fieldResolver' | 'tracing' | 'dataSources' | 'cache' ]: apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<apollo-server-core.apollo-server-core/dist/types.Context<object>, any>[P]} */ trait Config extends js.Object {
  var cacheControl: js.UndefOr[
    apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheControlExtensionOptions | scala.Boolean
  ] = js.undefined
  var context: js.UndefOr[Context[js.Object] | (ContextFunction[_, js.Object])] = js.undefined
  var engine: js.UndefOr[
    scala.Boolean | apolloDashEngineDashReportingLib.distAgentMod.EngineReportingOptions[Context[js.Object]]
  ] = js.undefined
  var extensions: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      js.Function0[graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ]
  ] = js.undefined
  var introspection: js.UndefOr[scala.Boolean] = js.undefined
  var mockEntireSchema: js.UndefOr[scala.Boolean] = js.undefined
  var mocks: js.UndefOr[scala.Boolean | graphqlDashToolsLib.distInterfacesMod.IMocks] = js.undefined
  var modules: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod.GraphQLSchemaModule
    ]
  ] = js.undefined
  var parseOptions: js.UndefOr[graphqlDashToolsLib.distInterfacesMod.GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.PersistedQueryOptions | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibNumbers.`false`
  ] = js.undefined
  var playground: js.UndefOr[apolloDashServerDashCoreLib.distPlaygroundMod.PlaygroundConfig] = js.undefined
  var plugins: js.UndefOr[apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[PluginDefinition]] = js.undefined
  var resolvers: js.UndefOr[graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]] = js.undefined
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
  var schemaDirectives: js.UndefOr[stdLib.Record[java.lang.String, apolloDashServerDashCoreLib.Anon_Config]] = js.undefined
  var subscriptions: js.UndefOr[
    stdLib.Partial[SubscriptionServerOptions] | java.lang.String | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibNumbers.`false`
  ] = js.undefined
  var typeDefs: js.UndefOr[
    graphqlLib.languageAstMod.DocumentNode | apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[graphqlLib.languageAstMod.DocumentNode]
  ] = js.undefined
  var uploads: js.UndefOr[scala.Boolean | FileUploadOptions] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    cacheControl: apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheControlExtensionOptions | scala.Boolean = null,
    context: Context[js.Object] | (ContextFunction[_, js.Object]) = null,
    engine: scala.Boolean | apolloDashEngineDashReportingLib.distAgentMod.EngineReportingOptions[Context[js.Object]] = null,
    extensions: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      js.Function0[graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ] = null,
    introspection: js.UndefOr[scala.Boolean] = js.undefined,
    mockEntireSchema: js.UndefOr[scala.Boolean] = js.undefined,
    mocks: scala.Boolean | graphqlDashToolsLib.distInterfacesMod.IMocks = null,
    modules: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod.GraphQLSchemaModule
    ] = null,
    parseOptions: graphqlDashToolsLib.distInterfacesMod.GraphQLParseOptions = null,
    persistedQueries: apolloDashServerDashCoreLib.distGraphqlOptionsMod.PersistedQueryOptions | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibNumbers.`false` = null,
    playground: apolloDashServerDashCoreLib.distPlaygroundMod.PlaygroundConfig = null,
    plugins: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[PluginDefinition] = null,
    resolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _] = null,
    schema: graphqlLib.graphqlMod.GraphQLSchema = null,
    schemaDirectives: stdLib.Record[java.lang.String, apolloDashServerDashCoreLib.Anon_Config] = null,
    subscriptions: stdLib.Partial[SubscriptionServerOptions] | java.lang.String | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibNumbers.`false` = null,
    typeDefs: graphqlLib.languageAstMod.DocumentNode | apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[graphqlLib.languageAstMod.DocumentNode] = null,
    uploads: scala.Boolean | FileUploadOptions = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(introspection)) __obj.updateDynamic("introspection")(introspection)
    if (!js.isUndefined(mockEntireSchema)) __obj.updateDynamic("mockEntireSchema")(mockEntireSchema)
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions)
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (playground != null) __obj.updateDynamic("playground")(playground.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

