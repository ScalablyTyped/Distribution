package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type BaseConfig = stdLib.Pick[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[Context[js.Object], js.Any], 
    apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.formatError | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.debug | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.rootValue | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.validationRules | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.executor | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.formatResponse | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.fieldResolver | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.tracing | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.dataSources | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.cache
  ]
  type Context[T] = T
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[
    /* context */ FunctionParams, 
    apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[Context[ProducedContext]]
  ]
  type PluginDefinition = apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin | (js.Function0[
    apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
  ])
  type SchemaChangeCallback = js.Function1[/* schema */ graphqlLib.graphqlMod.GraphQLSchema, scala.Unit]
  type Unsubscriber = js.Function0[scala.Unit]
}
