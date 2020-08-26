package typings.apolloServer.mod

import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "appendObjectFields")
@js.native
object appendObjectFields extends js.Object {
  def apply(schema: GraphQLSchema, typeName: String, additionalFields: GraphQLFieldConfigMap[_, _]): GraphQLSchema = js.native
}

