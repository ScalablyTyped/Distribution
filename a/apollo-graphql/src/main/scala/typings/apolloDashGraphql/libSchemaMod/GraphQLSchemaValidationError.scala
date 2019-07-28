package typings.apolloDashGraphql.libSchemaMod

import typings.graphql.graphqlMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends typings.apolloDashGraphql.libSchemaGraphQLSchemaValidationErrorMod.GraphQLSchemaValidationError {
  def this(errors: js.Array[GraphQLError]) = this()
}

