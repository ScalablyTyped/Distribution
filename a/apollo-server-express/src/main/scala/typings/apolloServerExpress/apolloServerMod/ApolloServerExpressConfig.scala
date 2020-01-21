package typings.apolloServerExpress.apolloServerMod

import typings.apolloCacheControl.mod.CacheControlExtensionOptions
import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import typings.apolloServerCore.TypeofClassSchemaDirectiveVisitor
import typings.apolloServerCore.apolloServerCoreBooleans.`false`
import typings.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typings.apolloServerCore.playgroundMod.PlaygroundConfig
import typings.apolloServerCore.typesMod.Config
import typings.apolloServerCore.typesMod.Context
import typings.apolloServerCore.typesMod.ContextFunction
import typings.apolloServerCore.typesMod.FileUploadOptions
import typings.apolloServerCore.typesMod.GraphQLService
import typings.apolloServerCore.typesMod.PluginDefinition
import typings.apolloServerCore.typesMod.SubscriptionServerOptions
import typings.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.graphqlTools.interfacesMod.IMocks
import typings.graphqlTools.interfacesMod.IResolvers
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerExpressConfig extends Config {
  @JSName("context")
  var context_ApolloServerExpressConfig: js.UndefOr[(ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]] = js.undefined
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(
    cacheControl: CacheControlExtensionOptions | Boolean = null,
    context: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object] = null,
    engine: Boolean | EngineReportingOptions[Context[js.Object]] = null,
    extensions: js.Array[js.Function0[typings.graphqlExtensions.mod.GraphQLExtension[_]]] = null,
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
  ): ApolloServerExpressConfig = {
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
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
}

