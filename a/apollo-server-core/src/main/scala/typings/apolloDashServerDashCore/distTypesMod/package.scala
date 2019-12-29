package typings.apolloDashServerDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.cache
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.dataSources
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.debug
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.executor
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.fieldResolver
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatError
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatResponse
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.rootValue
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.tracing
  import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.validationRules
  import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
  import typings.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
  import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
  import typings.graphql.graphqlMod.GraphQLSchema
  import typings.std.Pick
  import typings.std.Record

  type BaseConfig = Pick[
    GraphQLServerOptions[Context[js.Object], js.Any], 
    formatError | debug | rootValue | validationRules | executor | formatResponse | fieldResolver | tracing | dataSources | cache
  ]
  type Context[T] = T
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[/* context */ FunctionParams, ValueOrPromise[Context[ProducedContext]]]
  type PluginDefinition = (ApolloServerPlugin[Record[String, js.Any]]) | (js.Function0[ApolloServerPlugin[Record[String, js.Any]]])
  type SchemaChangeCallback = js.Function1[/* schema */ GraphQLSchema, Unit]
  type Unsubscriber = js.Function0[Unit]
}
