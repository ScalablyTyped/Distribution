package typings.apolloServer.mod

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "mergeArguments")
@js.native
object mergeArguments extends js.Object {
  def apply(
    args1: js.Array[InputValueDefinitionNode],
    args2: js.Array[InputValueDefinitionNode],
    config: Config
  ): js.Array[InputValueDefinitionNode] = js.native
}

