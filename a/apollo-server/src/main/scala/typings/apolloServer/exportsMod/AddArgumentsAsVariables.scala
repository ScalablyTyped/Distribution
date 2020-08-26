package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "AddArgumentsAsVariables")
@js.native
class AddArgumentsAsVariables protected ()
  extends typings.graphqlTools.mod.AddArgumentsAsVariables {
  def this(targetSchema: GraphQLSchema, args: Record[String, _]) = this()
}

