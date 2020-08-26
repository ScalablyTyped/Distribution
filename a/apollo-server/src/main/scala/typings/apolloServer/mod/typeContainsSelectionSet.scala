package typings.apolloServer.mod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "typeContainsSelectionSet")
@js.native
object typeContainsSelectionSet extends js.Object {
  def apply(`type`: GraphQLObjectType[_, _], selectionSet: SelectionSetNode): Boolean = js.native
}

