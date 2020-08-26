package typings.apolloServer.mod

import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "AddFragmentsByField")
@js.native
class AddFragmentsByField protected ()
  extends typings.apolloServer.exportsMod.AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}

