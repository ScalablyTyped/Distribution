package typings.apolloServer.exportsMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected ()
  extends typings.graphqlTools.mod.AddSelectionSetsByField {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}

