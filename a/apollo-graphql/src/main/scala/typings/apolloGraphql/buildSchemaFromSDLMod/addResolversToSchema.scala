package typings.apolloGraphql.buildSchemaFromSDLMod

import typings.apolloGraphql.resolverMapMod.GraphQLResolverMap
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/buildSchemaFromSDL", "addResolversToSchema")
@js.native
object addResolversToSchema extends js.Object {
  def apply(schema: GraphQLSchema, resolvers: GraphQLResolverMap[_]): Unit = js.native
}

