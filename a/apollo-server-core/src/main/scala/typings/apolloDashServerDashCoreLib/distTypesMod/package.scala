package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type BaseConfig = stdLib.Pick[
    apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[Context[js.Any], js.Any], 
    apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.formatError | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.debug | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.rootValue | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.validationRules | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.formatResponse | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.fieldResolver | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.tracing | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.dataSources | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.cache
  ]
  type Context[T] = T
  type ContextFunction[T] = js.Function1[/* context */ Context[T], js.Promise[Context[T]]]
  type PluginDefinition = apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin | (js.Function0[
    apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
  ])
}
