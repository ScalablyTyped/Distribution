package typings.apolloServerExpress.mod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "AddMergedTypeSelectionSets")
@js.native
class AddMergedTypeSelectionSets protected ()
  extends typings.graphqlTools.mod.AddMergedTypeSelectionSets {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}

