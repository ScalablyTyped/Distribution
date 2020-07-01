package typings.apolloCacheControl.mod

import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.apolloServerTypes.mod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-cache-control", "plugin")
@js.native
object plugin extends js.Object {
  def apply(): ApolloServerPlugin[BaseContext] = js.native
  def apply(options: CacheControlExtensionOptions): ApolloServerPlugin[BaseContext] = js.native
}

