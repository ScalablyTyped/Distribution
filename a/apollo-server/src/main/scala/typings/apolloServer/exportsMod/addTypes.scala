package typings.apolloServer.exportsMod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "addTypes")
@js.native
object addTypes extends js.Object {
  def apply(schema: GraphQLSchema, newTypesOrDirectives: js.Array[GraphQLNamedType | GraphQLDirective]): GraphQLSchema = js.native
}

