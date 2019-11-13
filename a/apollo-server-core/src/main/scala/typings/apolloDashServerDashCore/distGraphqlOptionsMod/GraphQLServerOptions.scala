package typings.apolloDashServerDashCore.distGraphqlOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheControlExtensionOptions
import typings.apolloDashServerDashCaching.apolloDashServerDashCachingMod.InMemoryLRUCache
import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import typings.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutionResult
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutor
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLResponse
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.WithRequired
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.document
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.operation
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.operationName
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.queryHash
import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.graphqlMod.ValidationContext
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServerOptions[TContext, TRootValue] extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.undefined
  var context: js.UndefOr[TContext | js.Function0[scala.Nothing]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var documentStore: js.UndefOr[InMemoryLRUCache[DocumentNode]] = js.undefined
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.undefined
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.undefined
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, TContext, StringDictionary[_]]] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLResponse
    ]
  ] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin]] = js.undefined
  var reporting: js.UndefOr[Boolean] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, TRootValue]) | TRootValue] = js.undefined
  var schema: GraphQLSchema
  var tracing: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.undefined
}

object GraphQLServerOptions {
  @scala.inline
  def apply[TContext, TRootValue](
    schema: GraphQLSchema,
    cache: KeyValueCache[String] = null,
    cacheControl: CacheControlExtensionOptions = null,
    context: TContext | js.Function0[scala.Nothing] = null,
    dataSources: () => DataSources[TContext] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    documentStore: InMemoryLRUCache[DocumentNode] = null,
    executor: /* requestContext */ WithRequired[
      GraphQLRequestContext[Record[String, _]], 
      document | operationName | operation | queryHash
    ] => ValueOrPromise[GraphQLExecutionResult] = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: (_, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[TContext]) => GraphQLResponse = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions = null,
    plugins: js.Array[ApolloServerPlugin] = null,
    reporting: js.UndefOr[Boolean] = js.undefined,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, TRootValue]) | TRootValue = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): GraphQLServerOptions[TContext, TRootValue] = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(js.Any.fromFunction0(dataSources))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore)
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1(executor))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2(formatResponse))
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions)
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(reporting)) __obj.updateDynamic("reporting")(reporting)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[GraphQLServerOptions[TContext, TRootValue]]
  }
}

