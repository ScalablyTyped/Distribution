package typings.apolloTracing.mod

import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.apolloServerTypes.mod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-tracing", "plugin")
@js.native
object plugin extends js.Object {
  def apply(): js.Function0[ApolloServerPlugin[BaseContext]] = js.native
  def apply(_futureOptions: js.Object): js.Function0[ApolloServerPlugin[BaseContext]] = js.native
}

