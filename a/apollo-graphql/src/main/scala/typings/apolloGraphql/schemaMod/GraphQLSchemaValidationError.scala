package typings.apolloGraphql.schemaMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends typings.apolloGraphql.graphQLSchemaValidationErrorMod.GraphQLSchemaValidationError {
  def this(errors: js.Array[GraphQLError]) = this()
}

