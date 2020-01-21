package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.AnonField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "ReplaceFieldWithFragment")
@js.native
class ReplaceFieldWithFragment protected ()
  extends typings.graphqlTools.mod.ReplaceFieldWithFragment {
  def this(targetSchema: GraphQLSchema, fragments: js.Array[AnonField]) = this()
}

