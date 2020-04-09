package typings.apolloServerCore.requestPipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCacheControl.mod.CacheControlExtensionOptions
import typings.apolloServerCaching.mod.InMemoryLRUCache
import typings.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLExecutor
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.ValidationRule
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphqlExtensions.mod.GraphQLExtension
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestPipelineConfig[TContext] extends js.Object {
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
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
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[Record[String, _]]]] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* document */ DocumentNode, _]) | js.Any] = js.undefined
  var schema: GraphQLSchema
  var tracing: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[ValidationRule]] = js.undefined
}

object GraphQLRequestPipelineConfig {
  @scala.inline
  def apply[TContext](
    schema: GraphQLSchema,
    cacheControl: CacheControlExtensionOptions = null,
    dataSources: () => DataSources[TContext] = null,
    documentStore: InMemoryLRUCache[DocumentNode] = null,
    executor: /* requestContext */ GraphQLRequestContextExecutionDidStart[Record[String, _]] => ValueOrPromise[GraphQLExecutionResult] = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: (_, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[TContext]) => GraphQLResponse = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions = null,
    plugins: js.Array[ApolloServerPlugin[Record[String, _]]] = null,
    rootValue: (js.Function1[/* document */ DocumentNode, _]) | js.Any = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[ValidationRule] = null
  ): GraphQLRequestPipelineConfig[TContext] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(js.Any.fromFunction0(dataSources))
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1(executor))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2(formatResponse))
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestPipelineConfig[TContext]]
  }
}

