package typings.apolloServerExpress.mod

import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphqlToolsMerge.anon.Name
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "mergeFields")
@js.native
object mergeFields extends js.Object {
  def apply[T /* <: FieldDefinitionNode | InputValueDefinitionNode */](`type`: Name, f1: js.Array[T], f2: js.Array[T], config: Config): js.Array[T] = js.native
}

