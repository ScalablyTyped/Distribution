package typings.apolloServerCore.typesMod

import typings.apolloCacheControl.mod.CacheControlExtensionOptions
import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import typings.apolloServerCore.anon.PartialSubscriptionServer
import typings.apolloServerCore.anon.TypeofSchemaDirectiveVisi
import typings.apolloServerCore.apolloServerCoreBooleans.`false`
import typings.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typings.apolloServerCore.playgroundMod.PlaygroundConfig
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMock.typesMod.IMocks
import typings.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends BaseConfig {
  var cacheControl: js.UndefOr[CacheControlExtensionOptions | Boolean] = js.native
  var context: js.UndefOr[Context[js.Object] | (ContextFunction[_, js.Object])] = js.native
  var engine: js.UndefOr[Boolean | EngineReportingOptions[Context[js.Object]]] = js.native
  var experimental_approximateDocumentStoreMiB: js.UndefOr[Double] = js.native
  var extensions: js.UndefOr[js.Array[js.Function0[typings.graphqlExtensions.mod.GraphQLExtension[_]]]] = js.native
  var gateway: js.UndefOr[GraphQLService] = js.native
  var introspection: js.UndefOr[Boolean] = js.native
  var mockEntireSchema: js.UndefOr[Boolean] = js.native
  var mocks: js.UndefOr[Boolean | IMocks] = js.native
  var modules: js.UndefOr[js.Array[GraphQLSchemaModule]] = js.native
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  var persistedQueries: js.UndefOr[PersistedQueryOptions | `false`] = js.native
  var playground: js.UndefOr[PlaygroundConfig] = js.native
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
  var resolvers: js.UndefOr[
    (IResolvers[_, _, Record[String, _], _]) | (js.Array[IResolvers[_, _, Record[String, _], _]])
  ] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var schemaDirectives: js.UndefOr[Record[String, TypeofSchemaDirectiveVisi]] = js.native
  var subscriptions: js.UndefOr[PartialSubscriptionServer | String | `false`] = js.native
  var typeDefs: js.UndefOr[DocumentNode | (js.Array[DocumentNode | String]) | String] = js.native
  var uploads: js.UndefOr[Boolean | FileUploadOptions] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheControl(value: CacheControlExtensionOptions | Boolean): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setContextFunction1(value: _ => ValueOrPromise[Context[js.Object]]): Self = this.set("context", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: Context[js.Object] | (ContextFunction[_, js.Object])): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEngine(value: Boolean | EngineReportingOptions[Context[js.Object]]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setExperimental_approximateDocumentStoreMiB(value: Double): Self = this.set("experimental_approximateDocumentStoreMiB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental_approximateDocumentStoreMiB: Self = this.set("experimental_approximateDocumentStoreMiB", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: js.Function0[typings.graphqlExtensions.mod.GraphQLExtension[js.Any]]*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[js.Function0[typings.graphqlExtensions.mod.GraphQLExtension[_]]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setGateway(value: GraphQLService): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway: Self = this.set("gateway", js.undefined)
    @scala.inline
    def setIntrospection(value: Boolean): Self = this.set("introspection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntrospection: Self = this.set("introspection", js.undefined)
    @scala.inline
    def setMockEntireSchema(value: Boolean): Self = this.set("mockEntireSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMockEntireSchema: Self = this.set("mockEntireSchema", js.undefined)
    @scala.inline
    def setMocks(value: Boolean | IMocks): Self = this.set("mocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMocks: Self = this.set("mocks", js.undefined)
    @scala.inline
    def setModulesVarargs(value: GraphQLSchemaModule*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[GraphQLSchemaModule]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setParseOptions(value: GraphQLParseOptions): Self = this.set("parseOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseOptions: Self = this.set("parseOptions", js.undefined)
    @scala.inline
    def setPersistedQueries(value: PersistedQueryOptions | `false`): Self = this.set("persistedQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueries: Self = this.set("persistedQueries", js.undefined)
    @scala.inline
    def setPlayground(value: PlaygroundConfig): Self = this.set("playground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayground: Self = this.set("playground", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: PluginDefinition*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginDefinition]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResolversVarargs(value: (IResolvers[js.Any, js.Any, Record[String, js.Any], js.Any])*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(
      value: (IResolvers[_, _, Record[String, _], _]) | (js.Array[IResolvers[_, _, Record[String, _], _]])
    ): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSchemaDirectives(value: Record[String, TypeofSchemaDirectiveVisi]): Self = this.set("schemaDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDirectives: Self = this.set("schemaDirectives", js.undefined)
    @scala.inline
    def setSubscriptions(value: PartialSubscriptionServer | String | `false`): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
    @scala.inline
    def setTypeDefsVarargs(value: (DocumentNode | String)*): Self = this.set("typeDefs", js.Array(value :_*))
    @scala.inline
    def setTypeDefs(value: DocumentNode | (js.Array[DocumentNode | String]) | String): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
    @scala.inline
    def setUploads(value: Boolean | FileUploadOptions): Self = this.set("uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
  }
  
}

