package typings.apolloDashGraphql

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/transformSchema", JSImport.Namespace)
@js.native
object libSchemaTransformSchemaMod extends js.Object {
  def transformSchema(schema: GraphQLSchema, transformType: TypeTransformer): GraphQLSchema = js.native
  type TypeTransformer = js.Function1[/* type */ GraphQLNamedType, js.UndefOr[GraphQLNamedType | Null]]
}

