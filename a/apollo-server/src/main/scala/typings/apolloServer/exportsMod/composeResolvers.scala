package typings.apolloServer.exportsMod

import typings.graphqlToolsResolversComposition.resolversCompositionMod.ResolversComposerMapping
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "composeResolvers")
@js.native
object composeResolvers extends js.Object {
  def apply[Resolvers /* <: Record[String, _] */](resolvers: Resolvers): Resolvers = js.native
  def apply[Resolvers /* <: Record[String, _] */](resolvers: Resolvers, mapping: ResolversComposerMapping[Resolvers]): Resolvers = js.native
}

