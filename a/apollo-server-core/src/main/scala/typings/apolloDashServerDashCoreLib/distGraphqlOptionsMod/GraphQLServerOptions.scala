package typings
package apolloDashServerDashCoreLib.distGraphqlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServerOptions[TContext, TRootValue] extends js.Object {
  var cache: js.UndefOr[
    apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]
  ] = js.undefined
  var cacheControl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CacheControlExtensionOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CacheControlExtensionOptions */ js.Any
  ] = js.undefined
  var context: js.UndefOr[TContext | js.Function0[scala.Nothing]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var documentStore: js.UndefOr[
    apolloDashServerDashCachingLib.apolloDashServerDashCachingMod.InMemoryLRUCache[graphqlLib.languageAstMod.DocumentNode]
  ] = js.undefined
  var extensions: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      js.Function0[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLExtension */ _
      ]
    ]
  ] = js.undefined
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var formatError: js.UndefOr[
    js.Function1[
      /* error */ graphqlLib.graphqlMod.GraphQLError, 
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError
    ]
  ] = js.undefined
  var formatResponse: js.UndefOr[coreDashJsLib.Function] = js.undefined
  var parseOptions: js.UndefOr[graphqlDashToolsLib.distInterfacesMod.GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
    ]
  ] = js.undefined
  var rootValue: js.UndefOr[
    (js.Function1[/* parsedQuery */ graphqlLib.languageAstMod.DocumentNode, TRootValue]) | TRootValue
  ] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var tracing: js.UndefOr[scala.Boolean] = js.undefined
  var validationRules: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]]
  ] = js.undefined
}

object GraphQLServerOptions {
  @scala.inline
  def apply[TContext, TRootValue](
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String] = null,
    cacheControl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CacheControlExtensionOptions */ js.Any = null,
    context: TContext | js.Function0[scala.Nothing] = null,
    dataSources: js.Function0[DataSources[TContext]] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    documentStore: apolloDashServerDashCachingLib.apolloDashServerDashCachingMod.InMemoryLRUCache[graphqlLib.languageAstMod.DocumentNode] = null,
    extensions: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      js.Function0[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLExtension */ _
      ]
    ] = null,
    fieldResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]] = null,
    formatError: js.Function1[
      /* error */ graphqlLib.graphqlMod.GraphQLError, 
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError
    ] = null,
    formatResponse: coreDashJsLib.Function = null,
    parseOptions: graphqlDashToolsLib.distInterfacesMod.GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions = null,
    plugins: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
    ] = null,
    rootValue: (js.Function1[/* parsedQuery */ graphqlLib.languageAstMod.DocumentNode, TRootValue]) | TRootValue = null,
    tracing: js.UndefOr[scala.Boolean] = js.undefined,
    validationRules: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]] = null
  ): GraphQLServerOptions[TContext, TRootValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("schema")(schema)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver)
    if (formatError != null) __obj.updateDynamic("formatError")(formatError)
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(formatResponse)
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions)
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[GraphQLServerOptions[TContext, TRootValue]]
  }
}

