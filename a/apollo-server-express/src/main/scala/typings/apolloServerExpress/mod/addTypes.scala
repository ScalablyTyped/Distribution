package typings.apolloServerExpress.mod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "addTypes")
@js.native
object addTypes extends js.Object {
  def apply(schema: GraphQLSchema, newTypesOrDirectives: js.Array[GraphQLNamedType | GraphQLDirective]): GraphQLSchema = js.native
}

