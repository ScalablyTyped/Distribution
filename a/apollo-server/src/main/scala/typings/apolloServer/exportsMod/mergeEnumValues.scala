package typings.apolloServer.exportsMod

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "mergeEnumValues")
@js.native
object mergeEnumValues extends js.Object {
  def apply(
    first: js.Array[EnumValueDefinitionNode],
    second: js.Array[EnumValueDefinitionNode],
    config: Config
  ): js.Array[EnumValueDefinitionNode] = js.native
}

