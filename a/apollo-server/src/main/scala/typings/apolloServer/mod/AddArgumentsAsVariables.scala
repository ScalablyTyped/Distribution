package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "AddArgumentsAsVariables")
@js.native
class AddArgumentsAsVariables protected ()
  extends typings.apolloServer.exportsMod.AddArgumentsAsVariables {
  def this(targetSchema: GraphQLSchema, args: Record[String, _]) = this()
}

