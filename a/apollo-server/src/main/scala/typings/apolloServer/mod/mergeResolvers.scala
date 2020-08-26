package typings.apolloServer.mod

import typings.graphqlToolsMerge.mergeResolversMod.MergeResolversOptions
import typings.graphqlToolsMerge.mergeResolversMod.ResolversDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "mergeResolvers")
@js.native
object mergeResolvers extends js.Object {
  def apply[TContext, T /* <: ResolversDefinition[TContext] */](resolversDefinitions: js.Array[T]): T = js.native
  def apply[TContext, T /* <: ResolversDefinition[TContext] */](resolversDefinitions: js.Array[T], options: MergeResolversOptions): T = js.native
}

