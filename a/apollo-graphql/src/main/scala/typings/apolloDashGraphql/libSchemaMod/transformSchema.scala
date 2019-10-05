package typings.apolloDashGraphql.libSchemaMod

import typings.apolloDashGraphql.libSchemaTransformSchemaMod.TypeTransformer
import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(schema: GraphQLSchema, transformType: TypeTransformer): GraphQLSchema = js.native
}

