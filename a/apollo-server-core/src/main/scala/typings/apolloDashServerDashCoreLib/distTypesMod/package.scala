package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Context[T] = T
  type ContextFunction[T] = js.Function1[/* context */ Context[T], stdLib.Promise[Context[T]]]
  type PluginDefinition = apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin | (js.Function0[
    apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
  ])
}
