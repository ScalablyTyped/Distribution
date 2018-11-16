package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait Config extends js.Object {
  var context: js.UndefOr[Context[_] | ContextFunction[_]] = js.undefined
  var engine: js.UndefOr[
    scala.Boolean | apolloDashEngineDashReportingLib.distAgentMod.EngineReportingOptions
  ] = js.undefined
  var extensions: js.UndefOr[
    js.Array[
      js.Function0[graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[_]]
    ]
  ] = js.undefined
  var introspection: js.UndefOr[scala.Boolean] = js.undefined
  var mockEntireSchema: js.UndefOr[scala.Boolean] = js.undefined
  var mocks: js.UndefOr[scala.Boolean | graphqlDashToolsLib.distInterfacesMod.IMocks] = js.undefined
  var persistedQueries: js.UndefOr[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.PersistedQueryOptions | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibNumbers.`false`
  ] = js.undefined
  var playground: js.UndefOr[apolloDashServerDashCoreLib.distPlaygroundMod.PlaygroundConfig] = js.undefined
  var resolvers: js.UndefOr[graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]] = js.undefined
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
  var schemaDirectives: js.UndefOr[
    stdLib.Record[
      java.lang.String, 
      ScalablyTyped.runtime.Instantiable1[
        /* config */ graphqlDashToolsLib.Anon_Name, 
        graphqlDashToolsLib.graphqlDashToolsMod.SchemaDirectiveVisitor
      ]
    ]
  ] = js.undefined
  var subscriptions: js.UndefOr[
    stdLib.Partial[SubscriptionServerOptions] | java.lang.String | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibNumbers.`false`
  ] = js.undefined
  var typeDefs: js.UndefOr[
    graphqlLib.languageAstMod.DocumentNode | js.Array[graphqlLib.languageAstMod.DocumentNode]
  ] = js.undefined
  var uploads: js.UndefOr[scala.Boolean | FileUploadOptions] = js.undefined
}

