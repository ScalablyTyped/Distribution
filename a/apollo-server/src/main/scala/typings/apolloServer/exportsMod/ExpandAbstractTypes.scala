package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "ExpandAbstractTypes")
@js.native
class ExpandAbstractTypes protected ()
  extends typings.graphqlTools.mod.ExpandAbstractTypes {
  def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
}

