package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.getDirectivesMod.DirectableGraphQLObject
import typings.graphqlToolsUtils.getDirectivesMod.DirectiveUseMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "getDirectives")
@js.native
object getDirectives extends js.Object {
  def apply(schema: GraphQLSchema, node: DirectableGraphQLObject): DirectiveUseMap = js.native
}

