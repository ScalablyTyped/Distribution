package typings.apolloDashServerDashCore.distRequestPipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheControlExtensionOptions
import typings.apolloDashServerDashCaching.apolloDashServerDashCachingMod.InMemoryLRUCache
import typings.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutor
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValidationRule
import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
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
  var formatResponse: js.UndefOr[js.Function] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PersistedQueryOptions */ js.Any
  ] = js.undefined
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin]] = js.undefined
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
    executor: GraphQLExecutor[Record[String, _]] = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null,
    formatResponse: js.Function = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PersistedQueryOptions */ js.Any = null,
    plugins: js.Array[ApolloServerPlugin] = null,
    rootValue: (js.Function1[/* document */ DocumentNode, _]) | js.Any = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[ValidationRule] = null
  ): GraphQLRequestPipelineConfig[TContext] = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (dataSources != null) __obj.updateDynamic("dataSources")(js.Any.fromFunction0(dataSources))
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore)
    if (executor != null) __obj.updateDynamic("executor")(executor)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver)
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(formatResponse)
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions)
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[GraphQLRequestPipelineConfig[TContext]]
  }
}

